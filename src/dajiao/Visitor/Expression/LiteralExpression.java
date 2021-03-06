package dajiao.Visitor.Expression;

/**
 * Author       : mooncake
 * Created on   : 14-6-2
 * Package Name : dajiao.Interpreter.Expression
 */
public class LiteralExpression extends Expression {

    String str;

    public LiteralExpression(String str){
        this.str = str;
    }

    @Override
    public boolean match(Context context) {
        String temp = context.getNChar(str.length());
        if(temp == null || !temp.equals(this.str)){
            return false;
        }

        context.removeNChar(str.length());
        return true;
    }

    @Override
    public void Accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }
}
