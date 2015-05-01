package  asu.dans;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * @author Nikhil Aravind
 *
 */
public class DANSRuntime extends DANSGrammarBaseVisitor<DANSValue> {

	
    private Scope scope = new Scope();

    
    @Override
    public DANSValue visitAddExpression(@NotNull DANSGrammarParser.AddExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() + rhs.asDouble());
        }

        return new DANSValue(lhs.toString() + rhs.toString());
    }
    

    // expression '-' expression                #subtractExpression
    public DANSValue visitSubtractExpression(@NotNull DANSGrammarParser.SubtractExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() - rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }
    
    
    // expression '*' expression                #multiplyExpression
    public DANSValue visitMultiplyExpression(@NotNull DANSGrammarParser.MultiplyExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() * rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }
    // expression '/' expression                #divideExpression
    public DANSValue visitDivideExpression(@NotNull DANSGrammarParser.DivideExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() / rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }
    
    // expression '>' expression               #gtEqExpression
    public DANSValue visitGtExpression(@NotNull DANSGrammarParser.GtExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() > rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }

    // expression '<=' expression               #ltEqExpression
    public DANSValue visitLtEqExpression(@NotNull DANSGrammarParser.LtEqExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() <= rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }
    

    // expression '>=' expression                #gtExpression
    public DANSValue visitGtEqExpression(@NotNull DANSGrammarParser.GtEqExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() >= rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }

    // expression '<' expression                #ltExpression
    public DANSValue visitLtExpression(@NotNull DANSGrammarParser.LtExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));

        if(lhs.isNumber() && rhs.isNumber()) {
            return new DANSValue(lhs.asDouble() < rhs.asDouble());
        }
        String errmsg="This operation cannot be performed on a String";
        return new DANSValue(errmsg);
    }

    // expression '==' expression               #eqExpression
    
    @Override
    public DANSValue visitEqExpression(@NotNull DANSGrammarParser.EqExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));
        return new DANSValue(lhs.equals(rhs));
    }

    // expression '!=' expression               #notEqExpression
    @Override
    public DANSValue visitNotEqExpression(@NotNull DANSGrammarParser.NotEqExpressionContext ctx) {
        DANSValue lhs = this.visit(ctx.expression(0));
        DANSValue rhs = this.visit(ctx.expression(1));
        return new DANSValue(!lhs.equals(rhs));
    }

    // expression '&&' expression               #andExpression
    // TODO

    // expression '||' expression               #orExpression
    // TODO

    // expression '?' expression ':' expression #ternaryExpression
    // TODO

    // expression In expression                 #inExpression
    // TODO

    // Number                                   #numberExpression
    @Override
    public DANSValue visitNumberExpression(@NotNull DANSGrammarParser.NumberExpressionContext ctx) {
        return new DANSValue(Double.valueOf(ctx.getText()));
    }

    // Bool                                     #boolExpression
    @Override
    public DANSValue visitBoolExpression(@NotNull DANSGrammarParser.BoolExpressionContext ctx) {
        return new DANSValue(Boolean.valueOf(ctx.getText()));
    }

    // Null                                     #nullExpression
    @Override
    public DANSValue visitNullExpression(@NotNull DANSGrammarParser.NullExpressionContext ctx) {
        return DANSValue.NULL;
    }

    // functionCall indexes?                    #functionCallExpression
    // TODO

    // list indexes?                            #listExpression
    // TODO

    // Identifier indexes?                      #identifierExpression
    @Override
    public DANSValue visitIdentifierExpression(@NotNull DANSGrammarParser.IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        // TODO account for optional `indexes` production
        return scope.resolve(id);
    }

    // String indexes?                          #stringExpression
    @Override
    public DANSValue visitStringExpression(@NotNull DANSGrammarParser.StringExpressionContext ctx) {
        String text = ctx.getText();
        String stripped = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        // TODO account for optional `indexes` production
        return new DANSValue(stripped);
    }

    // '(' expression ')' indexes?              #expressionExpression
    // TODO

    // Input '(' String? ')'                    #inputExpression
    // TODO

    @Override
    public DANSValue visitAssignment(@NotNull DANSGrammarParser.AssignmentContext ctx) {
        String id = ctx.Identifier().getText();
        // TODO account for optional `indexes` production
        DANSValue value = this.visit(ctx.expression());
        scope.assign(id, value);
        return DANSValue.VOID;
    }

    // Identifier '(' exprList? ')' #identifierFunctionCall
    // TODO

    // Println '(' expression? ')'  #printlnFunctionCall
    @Override
    public DANSValue visitPrintlnFunctionCall(@NotNull DANSGrammarParser.PrintlnFunctionCallContext ctx) {
        System.out.println(this.visit(ctx.expression()));
        return DANSValue.VOID;
    }

    // Print '(' expression ')'     #printFunctionCall
    /*@Override
    public DANSValue visitPrintFunctionCall(@NotNull DANSGrammarParser.PrintFunctionCallContext ctx) {
        System.out.print(this.visit(ctx.expression()));
        return DANSValue.VOID;
    }*/

    // Assert '(' expression ')'    #assertFunctionCall
    // TODO

    // Size '(' expression ')'      #sizeFunctionCall
    // TODO

    // ifStatement
    //  : ifStat elseIfStat* elseStat? End
    //  ;
    //
    // ifStat
    //  : If expression Do block
    //  ;
    //
    // elseIfStat
    //  : Else If expression Do block
    //  ;
    //
    // elseStat
    //  : Else Do block
    //  ;
    @Override
    public DANSValue visitIfStatement(@NotNull DANSGrammarParser.IfStatementContext ctx) {

        // if ...
        if(this.visit(ctx.ifStat().expression()).asBoolean()) {
            return this.visit(ctx.ifStat().block());
        }

        // else if ...
        for(int i = 0; i < ctx.elseIfStat().size(); i++) {
            if(this.visit(ctx.elseIfStat(i).expression()).asBoolean()) {
                return this.visit(ctx.elseIfStat(i).block());
            }
        }

        // else ...
        if(ctx.elseStat() != null) {
            return this.visit(ctx.elseStat().block());
        }

        return DANSValue.VOID;
    }
    
    @Override   
    public DANSValue visitWhileStatement(@NotNull DANSGrammarParser.WhileStatementContext ctx) {
    	
    	/* DANSValue value = this.visit(ctx.expression().getChild(2));   
    	 String id = ctx.expression().getChild(0).getText();
    	 scope.assign(id, value);*/
    			
    			
    	while(this.visit(ctx.expression()).asBoolean()) {
    		this.visit(ctx.block());
        }
    
        return DANSValue.VOID;
    }
    
    public DANSValue visitFunctionDecl(@NotNull DANSGrammarParser.FunctionDeclContext ctx){
    	
    	
    	
    	
    	return DANSValue.VOID;
    	
    }
    
    
    
}