package week9.labtest;
import java.util.Scanner;
/*
34 add 11 mul 7
ob 300 mul 75 add 4350 cb div 15 add 1126
ob ob 5 add 8 cb sub cb sub ob 7 sub 3 cb cb mul 8 add 25 mod 3
 */
public class Q2two {
    static Stack <String> operator = new Stack<>();
    public static void main(String[] args) {
        operator.clearStack();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter infix expression : ");
        String infixInput = input.nextLine();
        String [] infExp = infixInput.split(" ");
        Stack <String> tempOpr = new Stack<>();
        for(String element : infExp){
            if (isNumber(element))
                System.out.println(element);
            else {
//                System.out.println(element);
//                operator.push(element);
                String mathOperator = convertToOperator(element);
//                System.out.println(mathOperator);
                operator.push(mathOperator);
            }
        }
        operator.removeLast();
//        Stack<String> temp = new Stack<>();
//        while (!operator.isEmpty()){
//            temp = safeToPush(operator.pop());
//        }
        operator.displayStack();
//        temp.displayStack();
    }

    public static Stack<String> addToStack(String opr, int index){
//        System.out.println(opr);
        Stack<String> tempOpr = new Stack<>();
        for (int i = operator.getSize(); i >= index; i--){
            if (i == index){
                System.out.println(opr);
                operator.push(opr);
                break;
            }
            String tempPop = operator.pop();
//            System.out.println(tempPop);
            tempOpr.push(tempPop);
        }
//        tempOpr.displayStack();
        // to store back the tempOpr into the main operator stack
        while (!tempOpr.isEmpty()){
            operator.push(tempOpr.pop());
        }

        return operator;
    }

    public static boolean isNumber(String element){
        char [] ch = element.toCharArray();
        StringBuilder str = new StringBuilder();
        boolean result = false;
        for(char c : ch){
            if (Character.isDigit(c))
                result = true;
        }
        return result;
    }

    public static String convertToOperator(String element){
        String result;
        switch (element){
            case "add":
                result = "+";
                break;
            case "sub":
                result =  "-";
                break;
            case "mul":
                result = "*";
                break;
            case "div":
                result = "/";
                break;
            case "mod":
                result = "%";
                break;
            case "ob":
                result = "(";
                break;
            case "cb":
                result = ")";
                break;
            default:
                result = "";
                break;
        }
        return result;
    }

    public static Stack <String> safeToPush(String element){
//        System.out.println("here");
//        operator.displayStack();
        Stack <String> result = new Stack<>();
//        System.out.println(element);
        for (int i = operator.getSize() - 1; i >=0; i--){
//            System.out.println(i + " " + oprPrecedence(operator.get(i)));
            if (oprPrecedence(operator.get(i)) == oprPrecedence(element)) {
                operator = addToStack(element , i);
            }
        }
        while (!operator.isEmpty()){
            result.push(operator.pop());
        }
        return result;
    }

    public static int oprPrecedence(String element){
        switch (element){
            case "+":
                return 6;
            case "-":
                return 5;
            case "*":
                return 4;
            case "/":
                return 3;
            case "%":
                return 2;
            case "(":
                return 7;
            case ")":
                return 1;
            default:
                return 0;
        }
    }
}
