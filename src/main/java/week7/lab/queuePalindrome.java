package week7.lab;

public class queuePalindrome {
    public static void main(String[] args) {
        MyQueue <String> queue = new MyQueue<>();
        String[] strings = {"civic", "racecar", "level", "saippuakivikauppias", "kayak" , "madam" , "fox" , "java" ,"tattarrattat"};
        for (String element: strings) {
            if (correctText(element)){
                for (int i = 0; i < element.length(); i++) {
                    queue.enqueue(String.valueOf(element.charAt(i)));
                }
                System.out.println("Is " + element + " a palindrome? " + palindromeFinder(queue, element));
            }
            else
                System.out.println(element + " is too long to test " + element.length() + " letters long");
        }
    }

    public static boolean correctText(String text){
        return text.length() <= 15;
    }

    public static boolean palindromeFinder(MyQueue<String> queue, String text){
        StringBuilder reverseText = new StringBuilder();
        while(!queue.isEmpty()){
            reverseText.append(queue.dequeue());
        }
        return reverseText.toString().equalsIgnoreCase(text);
    }
}
