package week9.labtest;
import java.util.Scanner;
/*
34 add 11 mul 7
ob 300 mul 75 add 4350 cb div 15 add 1126
 */
public class Q2 {
    public static void main(String[] args) {
        Stack<String> operator = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        
        String infixInput = input.nextLine();
        String [] inExp = infixInput.split(" ");

        Stack <String> temp = new Stack<>();
        for (int i = 0; i < inExp.length; i++) {
            if (inExp[i].equalsIgnoreCase("add") || inExp[i].equalsIgnoreCase("sub")
            || inExp[i].equalsIgnoreCase("mul") || inExp[i].equalsIgnoreCase("div")
            || inExp[i].equalsIgnoreCase("mod") ||inExp[i].equalsIgnoreCase("ob") ||
            inExp[i].equalsIgnoreCase("cb") ){
                if (precedence(inExp[i]) <= 1 )
                    temp.push(inExp[i]);
                else {
                    if (precedence(inExp[i]) == 2)
                        temp.push(inExp[i]);
                    else {
                        if (precedence(inExp[i]) == 3)
                            temp.push(inExp[i]);
                        else {
                            if (precedence(inExp[i]) == 4)
                                temp.push(inExp[i]);
                            else {
                                if (precedence(inExp[i]) == 5)
                                    temp.push(inExp[i]);
                                else {
                                    if (precedence(inExp[i]) == 7)
                                        temp.push(inExp[i]);
                                    else operator.push(inExp[i]);
                                }
                            }
                        }
                    }
                }

            }
            else {
                System.out.println(inExp[i]);
            }
        }
        while (!temp.isEmpty())
            operator.push(temp.pop());
        System.out.println(operator);
    }

    public static int precedence(String operator){
        switch (operator){
            case "add" :
                return 5;
            case "sub":
                return 4;
            case "mul" :
                return 3;
            case "div":
                return 2;
            case "mod" :
                return 1;
            case "ob":
                return 6;
            case "cb" :
                return 7;
            default:
                return 0;
        }
    }

    public static String operatorRewrite(String operator){
        switch (operator){
            case "add" :
                return "+";
            case "sub":
                return "-";
            case "mul" :
                return "*";
            case "div":
                return "/";
            case "mod" :
                return "%";
            case "ob":
                return "(";
            case "cb" :
                return ")";
            default:
                return null;
        }
    }
}
