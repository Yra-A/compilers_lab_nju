import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("input path is required");
        }
        String source = args[0];
        CharStream input = CharStreams.fromFileName(source);
        SysYLexer sysYLexer = new SysYLexer(input);
        sysYLexer.removeErrorListeners();
        myErrorListener myErrorListener = new myErrorListener();
        sysYLexer.addErrorListener(myErrorListener);
        List<Token> tokens = (List<Token>) sysYLexer.getAllTokens();

        // 如果出现错误就不输出token
        if (myErrorListener.hasError()) {
            return;
        }
        for (Token token : tokens) {
            String text = token.getText();
            if (token.getType() == SysYLexer.INTEGER_CONST) {
                if (text.length() > 1) {
                    if (text.startsWith("0x") || text.startsWith("0X")) {
                        // 十六进制
                        text = text.substring(2);
                        text = String.valueOf(Integer.parseInt(text, 16));
                    } else if (text.startsWith("0")) {
                        // 八进制
                        text = text.substring(1);
                        text = String.valueOf(Integer.parseInt(text, 8));
                    }
                }
            }
            String typeStr = SysYLexer.VOCABULARY.getSymbolicName(token.getType());
            if (token.getType() == SysYLexer.LINE_COMMENT || token.getType() == SysYLexer.WS || token.getType() == SysYLexer.MULTILINE_COMMENT) {
                continue;
            }
            System.err.printf("%s %s at Line %d.\n", typeStr, text, token.getLine());
        }
    }
}

class myErrorListener extends BaseErrorListener
{
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