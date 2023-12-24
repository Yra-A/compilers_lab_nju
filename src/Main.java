import java.io.IOException;

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
        sysYLexer.getAllTokens();
    }
}

class myErrorListener extends BaseErrorListener
{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e)
    {
        System.err.printf("Error type A at Line %d:%s", line, msg);
    }
}