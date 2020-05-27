package interpreter;

import java.util.ArrayList;

public class Parser {

    //private ArrayList<AbstractExpresion> parseTree = new ArrayList<AbstractExpresion>();
    private Context context;

    public Parser(String s) {
        context= new Context(s.replace(" ",""));
        for (String token : s.split(" ")) {
            switch (token){
                case "a":
                    //parseTree.add();
                    break;
                case "e":
                   // parseTree.add(new TerminalExpressionE());
                    break;
                case "i":
                    //parseTree.add(new TerminalExpressionI());
                    break;
                case "o":
                    //parseTree.add(new TerminalExpressionO());
                    break;
                case "u":
                   // parseTree.add(new TerminalExpressionU());
                    break;
                default:
                    break;
            }
        }
    }
}
