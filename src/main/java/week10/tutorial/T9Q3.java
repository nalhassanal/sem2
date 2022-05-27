package week10.tutorial;

public class T9Q3 {
    public static void main(String[] args) {
        String [] input = {"String" , "Zaba" , "zabarose" , "firdaus" , "nur" , "adam" , "habibah"};
        for (String element: input) {
            System.out.println(element + " " + reverseString(element));
        }
    }

    public static String reverseString(String str){
        if (null == str || (str.length() <= 1))
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
