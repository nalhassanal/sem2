package week10.lab;
/*
Create a recursive function that accepts a String parameter,
and substitute any of the lowercase “a” (not applicable for uppercase “A”)
found with “i” char. Example:
        substituteAI(“flabbergasted ”) -> “flibbergisted ”
        substituteAI(“Astronaut ”) -> “Astroniut ”
 */
public class L9Q1 {

    public static void main(String[] args) {
        String [] input = {"flabbergasted", "Astronaut"};
        for (String element : input){
            System.out.println(element + " -> " + substituteAi(element));
        }
    }

    public static String substituteAi(String str){
        if (str.length() < 1)
            return "";
        char letter = str.charAt(0); // get the first letter in the word
        String remaining = str.substring(1); // slice the string to remove the first letter
        if (letter == 'a') // if the first letter is an 'a' replace it with 'i'
            return "i" + substituteAi(remaining);
        // else return the letter
        return letter + substituteAi(remaining);
    }
}
