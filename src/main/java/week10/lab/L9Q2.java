package week10.lab;
/*
Write a recursive method called permuteString() that will find
and print all the possibilities to arrange the letters of a given word. Example:
 */
/*
Input String: “ABC”
Output Permutation :
                  ABC
                  ACB
                  BAC
                  BCA
                  CAB
                  CBA
 */
/*
Tips:
1)  Take out the first char from String and permute the remaining chars.
                   If String = “ABC”
                   First char = A and remaining chars permutations are BC and CB.
2)  Insert first char in the available positions in the permutations.
                   BC -> ABC, BAC, BCA
                   CB -> ACB, CAB, CBA
3) Then write a recursive function call to return the permutations and then another
function call to insert the first characters to get the complete list of permutations.

 */
public class L9Q2 {
    public static void main(String[] args) {
        String [] input = {"ABC"};
        for(String element: input){
            System.out.println("Input String " + element);
            System.out.println("Output Permutation: ");
            permuteString("" , element);
        }
    }

    public static void permuteString(String beginning, String ending){
        System.out.println(beginning + ", " + ending);
        if (ending.length() <= 1)
            System.out.println(beginning + ending);

        else {
            for (int i = 0; i < ending.length(); i++) {
                String newString = ending.substring(0, i) + ending.substring(i + 1);
                permuteString(beginning + ending.charAt(i) , newString);
            }
        }
    }
}
