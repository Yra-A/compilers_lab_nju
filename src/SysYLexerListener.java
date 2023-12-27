// Generated from /Users/yra/Desktop/Compilers/Lab/src/SysYLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SysYLexerParser}.
 */
public interface SysYLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SysYLexerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SysYLexerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(SysYLexerParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(SysYLexerParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SysYLexerParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SysYLexerParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(SysYLexerParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(SysYLexerParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(SysYLexerParser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(SysYLexerParser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(SysYLexerParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(SysYLexerParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(SysYLexerParser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(SysYLexerParser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SysYLexerParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SysYLexerParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(SysYLexerParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(SysYLexerParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(SysYLexerParser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(SysYLexerParser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(SysYLexerParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(SysYLexerParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(SysYLexerParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(SysYLexerParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#funcFParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncFParams(SysYLexerParser.FuncFParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#funcFParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncFParams(SysYLexerParser.FuncFParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#funcFParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncFParam(SysYLexerParser.FuncFParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#funcFParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncFParam(SysYLexerParser.FuncFParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SysYLexerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SysYLexerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(SysYLexerParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(SysYLexerParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SysYLexerParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SysYLexerParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SysYLexerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SysYLexerParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(SysYLexerParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(SysYLexerParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(SysYLexerParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(SysYLexerParser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SysYLexerParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SysYLexerParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(SysYLexerParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(SysYLexerParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(SysYLexerParser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(SysYLexerParser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SysYLexerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SysYLexerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYLexerParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(SysYLexerParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYLexerParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(SysYLexerParser.ConstExpContext ctx);
}