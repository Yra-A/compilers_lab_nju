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
        System.err.println(input.toString());
        SysYLexer sysYLexer = new SysYLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(sysYLexer);
        SysYParser sysYParser = new SysYParser(tokens);

        sysYParser.removeErrorListeners();
        myErrorListener myErrorListener = new myErrorListener();
        sysYParser.addErrorListener(myErrorListener);

        ParseTree tree = sysYParser.compUnit();
        if (myErrorListener.hasError()) {
            Visitor visitor = new Visitor(sysYLexer);
            visitor.visit(tree);
        }
    }
}

class myErrorListener extends BaseErrorListener {
    private boolean hasError = false;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e)
    {
        hasError = true;
        System.err.printf("Error type A at Line %d:%s", line, msg);
    }

    public boolean hasError() {
        return hasError;
    }
}

class Visitor extends SysYParserBaseVisitor<Void> {

    private String[] highlightColors;

    public Visitor(SysYLexer sysYLexer) {
        super();
        getHighlightColor(sysYLexer);
    }

    @Override
    public Void visitChildren(RuleNode node) {
        String ruleName = SysYParser.ruleNames[node.getRuleContext().getRuleIndex()];
        System.err.println(ruleName); // 打印正在访问的规则名称
        return null;
    }

    @Override
    public Void visitTerminal(TerminalNode node) {
        Token token = node.getSymbol();
        if (token != null) {
            int type = token.getType();
            String text = token.getText();
            System.err.printf("[%s]\n", highlightColors[type]);
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