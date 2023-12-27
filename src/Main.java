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
        System.err.printf("Error type B at Line %d:%s\n", line, msg);
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
            System.out.print(" ");
        }
        return null;
    }

    @Override
    public Void visitChildren(RuleNode node) {
        String ruleName = SysYParser.ruleNames[node.getRuleContext().getRuleIndex()];
        printIndent();
        indent += 2;
        ruleName = ruleName.substring(0, 1).toUpperCase() + ruleName.substring(1);
        System.err.println(ruleName); // 打印正在访问的规则名称

        Void result = this.defaultResult();
        int n = node.getChildCount();
        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            Void childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }
        indent -= 2;
        return result;
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        Token token = node.getSymbol();
        if (token != null) {
            int type = token.getType() - 1;
            if (type < 0 || type >= highlightColors.length || highlightColors[type] == null) {
                return null;
            }
            String text = token.getText();

            printIndent();
            System.err.printf("%s %s[%s]-", text, SysYLexer.ruleNames[type], highlightColors[type]);
        }
        return null;
    }

    private Void getHighlightColor(SysYLexer sysYLexer) {
        highlightColors = new String[sysYLexer.getVocabulary().getMaxTokenType()];
        //保留字
        highlightColors[SysYLexer.CONST - 1] = "orange";
        highlightColors[SysYLexer.INT - 1] = "orange";
        highlightColors[SysYLexer.VOID - 1] = "orange";
        highlightColors[SysYLexer.IF - 1] = "orange";
        highlightColors[SysYLexer.ELSE - 1] = "orange";
        highlightColors[SysYLexer.WHILE - 1] = "orange";
        highlightColors[SysYLexer.BREAK - 1] = "orange";
        highlightColors[SysYLexer.CONTINUE - 1] = "orange";
        highlightColors[SysYLexer.RETURN - 1] = "orange";
        highlightColors[SysYLexer.PLUS - 1] = "blue";
        highlightColors[SysYLexer.MINUS - 1] = "blue";
        highlightColors[SysYLexer.MUL - 1] = "blue";
        highlightColors[SysYLexer.DIV - 1] = "blue";
        highlightColors[SysYLexer.MOD - 1] = "blue";
        highlightColors[SysYLexer.ASSIGN - 1] = "blue";
        highlightColors[SysYLexer.EQ - 1] = "blue";
        highlightColors[SysYLexer.NEQ - 1] = "blue";
        highlightColors[SysYLexer.LT - 1] = "blue";
        highlightColors[SysYLexer.GT - 1] = "blue";
        highlightColors[SysYLexer.LE - 1] = "blue";
        highlightColors[SysYLexer.GE - 1] = "blue";
        highlightColors[SysYLexer.NOT - 1] = "blue";
        highlightColors[SysYLexer.AND - 1] = "blue";
        highlightColors[SysYLexer.OR - 1] = "blue";
        highlightColors[SysYLexer.IDENT - 1] = "red";
        highlightColors[SysYLexer.INTEGER_CONST - 1] = "green";
        return null;
    }
}