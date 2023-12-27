// Generated from ./src/SysYParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SysYParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SysYParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SysYParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(SysYParserParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SysYParserParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(SysYParserParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(SysYParserParser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(SysYParserParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(SysYParserParser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SysYParserParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(SysYParserParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(SysYParserParser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(SysYParserParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(SysYParserParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#funcFParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParams(SysYParserParser.FuncFParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#funcFParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParam(SysYParserParser.FuncFParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SysYParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(SysYParserParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SysYParserParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SysYParserParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SysYParserParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(SysYParserParser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SysYParserParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(SysYParserParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(SysYParserParser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SysYParserParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYParserParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(SysYParserParser.ConstExpContext ctx);
}