// Generated from /Users/yra/Desktop/Compilers/Lab/src/SysYLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SysYLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SysYLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SysYLexerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(SysYLexerParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(SysYLexerParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(SysYLexerParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(SysYLexerParser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(SysYLexerParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(SysYLexerParser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(SysYLexerParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(SysYLexerParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(SysYLexerParser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(SysYLexerParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(SysYLexerParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#funcFParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParams(SysYLexerParser.FuncFParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#funcFParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncFParam(SysYLexerParser.FuncFParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SysYLexerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(SysYLexerParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SysYLexerParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SysYLexerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SysYLexerParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(SysYLexerParser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SysYLexerParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(SysYLexerParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(SysYLexerParser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SysYLexerParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SysYLexerParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(SysYLexerParser.ConstExpContext ctx);
}