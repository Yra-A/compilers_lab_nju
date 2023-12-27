import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("input path is required");
        }
        String source = args[0];
        CharStream input = CharStreams.fromFileName(source);
        SysYLexer sysYLexer = new SysYLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(sysYLexer);
        SysYParser sysYParser = new SysYParser(tokens);

        sysYParser.removeErrorListeners();
        MyErrorParserListener myErrorParserListener = new MyErrorParserListener();
        sysYParser.addErrorListener(myErrorParserListener);

        ParseTree tree = sysYParser.program();
        if (!myErrorParserListener.hasError()) {
            Visitor visitor = new Visitor(sysYLexer);
            visitor.visit(tree);
        }
    }
}

class MyErrorParserListener extends BaseErrorListener {
    private boolean hasError = false;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e)
    {
        hasError = true;
        System.err.printf("Error type A at Line %d:%s\n", line, msg);
    }

    public boolean hasError() {
        return hasError;
    }
}

class Visitor extends SysYParserBaseVisitor<Void> {

    private String[] highlightColors;
    private int indent = 0;

    private String[] tokenNames;

    public Visitor(SysYLexer sysYLexer) {
        super();
        getHighlightColor(sysYLexer);
        tokenNames = sysYLexer.getRuleNames();
    }

    private Void printIndent() {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        return null;
    }

    @Override
    public Void visitChildren(RuleNode node) {
        String ruleName = SysYParser.ruleNames[node.getRuleContext().getRuleIndex()];
        printIndent();
        indent += 1;

        System.err.println(ruleName); // 打印正在访问的规则名称

        Void result = this.defaultResult();
        int n = node.getChildCount();
        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            Void childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }
        indent -= 1;
        return result;
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        Token token = node.getSymbol();
        if (token != null) {
            int type = token.getType() - 1;
            if (type + 1 >= highlightColors.length || highlightColors[type + 1] == null) {
                return null;
            }
            String text = token.getText();
            printIndent();
            System.err.printf("%s %s[%s]\n", text, SysYLexer.ruleNames[type], highlightColors[type]);
        }
        return null;
    }

    private Void getHighlightColor(SysYLexer sysYLexer) {
        highlightColors = new String[sysYLexer.getVocabulary().getMaxTokenType() + 1];
        //保留字
        highlightColors[SysYLexer.CONST] = "orange";
        highlightColors[SysYLexer.INT] = "orange";
        highlightColors[SysYLexer.VOID] = "orange";
        highlightColors[SysYLexer.IF] = "orange";
        highlightColors[SysYLexer.ELSE] = "orange";
        highlightColors[SysYLexer.WHILE] = "orange";
        highlightColors[SysYLexer.BREAK] = "orange";
        highlightColors[SysYLexer.CONTINUE] = "orange";
        highlightColors[SysYLexer.RETURN] = "orange";
        highlightColors[SysYLexer.PLUS] = "blue";
        highlightColors[SysYLexer.MINUS] = "blue";
        highlightColors[SysYLexer.MUL] = "blue";
        highlightColors[SysYLexer.DIV] = "blue";
        highlightColors[SysYLexer.MOD] = "blue";
        highlightColors[SysYLexer.ASSIGN] = "blue";
        highlightColors[SysYLexer.EQ] = "blue";
        highlightColors[SysYLexer.NEQ] = "blue";
        highlightColors[SysYLexer.LT] = "blue";
        highlightColors[SysYLexer.GT] = "blue";
        highlightColors[SysYLexer.LE] = "blue";
        highlightColors[SysYLexer.GE] = "blue";
        highlightColors[SysYLexer.NOT] = "blue";
        highlightColors[SysYLexer.AND] = "blue";
        highlightColors[SysYLexer.OR] = "blue";
        highlightColors[SysYLexer.IDENT] = "red";
        highlightColors[SysYLexer.INTEGER_CONST] = "green";
        return null;
    }
}