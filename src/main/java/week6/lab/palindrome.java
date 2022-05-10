package week6.lab;
/*
A string is a palindrome if it spells the same way forwards and backwards.
Write a Java program that uses a stack to determine if a string is a palindrome or not.
Let your string be of maximum size 15 characters.
Note however the actual size may be 15 or less.
 */
public class palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome tester");
        MyStack<String> palindrome = new MyStack<>();
        String [] text = {"civic", "racecar", "level", "saippuakivikauppias", "kayak" , "madam" , "fox" , "java" ,"tattarrattat"};
//        usingStack(palindrome, text);

        for (String element: text) {
            // using this has no limits for string length
            System.out.println("is " + element + " a palindrome? " + palindrome(element));
        }
    }
    public static boolean correctText(String text){
        if (text.length() > 15) return false;
        return true;
    }

    public static void usingStack(MyStack<String> palindrome, String [] text){
        for (String element: text) {
            if(correctText(element)) {
                for (int i = 0; i < element.length(); i++) {
                    palindrome.push(String.valueOf(element.charAt(i)));
                }
                System.out.println("is " + element + " a palindrome? " + palindromeFinder(palindrome, element));
            }
            else{
                System.out.println(element + " is too long to test " + element.length() + " letters long");
            }
        }
    }

    public static boolean palindromeFinder(MyStack<String> stack, String text){
        String reverseText = "";
        while(!stack.isEmpty()){
            reverseText+=stack.pop();
        }
        if (reverseText.equalsIgnoreCase(text))
            return true;
        return false;
    }

    public static boolean palindrome(String text){
        if(text.length() == 0 || text.length() == 1)
            return true;

        if ( text.charAt(0) == text.charAt(text.length() - 1)){
            return palindrome(text.substring(1, text.length() - 1));
        }

        return false;
    }
}
