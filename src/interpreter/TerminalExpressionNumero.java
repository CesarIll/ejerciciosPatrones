package interpreter;

public class TerminalExpressionNumero extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")) {
            context.valor = 1;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("2")){
            context.valor= 2;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("3")){
            context.valor = 3;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("4")){
            context.valor = 4;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("5")){
            context.valor = 5;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("6")){
            context.valor = 6;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("7")){
            context.valor = 7;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("8")){
            context.valor = 8;
            context.input= context.input.substring(1);
        } else if(context.input.startsWith("9")){
            context.valor= 9;
            context.input= context.input.substring(1);
        }else if(context.input.startsWith("0")) {
            context.valor= 0;
            context.input = context.input.substring(1);
        }
    }
}
