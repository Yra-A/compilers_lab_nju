// Generated from ./src/SysYParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SysYParserParser}.
 */
public interface SysYParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SysYParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SysYParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(SysYParserParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(SysYParserParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(SysYParserParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(SysYParserParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(SysYParserParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(SysYParserParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(SysYParserParser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(SysYParserParser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(SysYParserParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(SysYParserParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(SysYParserParser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(SysYParserParser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SysYParserParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SysYParserParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(SysYParserParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(SysYParserParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(SysYParserParser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(SysYParserParser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(SysYParserParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(SysYParserParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(SysYParserParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(SysYParserParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#funcFParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncFParams(SysYParserParser.FuncFParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#funcFParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncFParams(SysYParserParser.FuncFParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#funcFParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncFParam(SysYParserParser.FuncFParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#funcFParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncFParam(SysYParserParser.FuncFParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SysYParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SysYParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(SysYParserParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(SysYParserParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SysYParserParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SysYParserParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SysYParserParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SysYParserParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(SysYParserParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(SysYParserParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(SysYParserParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(SysYParserParser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SysYParserParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SysYParserParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(SysYParserParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(SysYParserParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(SysYParserParser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(SysYParserParser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SysYParserParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SysYParserParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SysYParserParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(SysYParserParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SysYParserParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(SysYParserParser.ConstExpContext ctx);
}