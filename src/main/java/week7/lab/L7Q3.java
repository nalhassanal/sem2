package week7.lab;
import java.util.*;
/*
Buy 100 shares at $ 20 price
Buy 50 shares at $ 20 price
Sell 50 shares at $ 20 price
sell 60 shares at $ 30 price
sell 50 shares at $ 35 price
 */
public class L7Q3 {
    public static class pair{
        private int buyUnit;
        private int buyPrice;

        public pair(int buyUnit, int buyPrice){
            this.buyUnit = buyUnit;
            this.buyPrice = buyPrice;
        }

        public int getBuyUnit() {
            return buyUnit;
        }

        public int getBuyPrice() {
            return buyPrice;
        }

        public void modifyCount(int unit){
            buyUnit += unit;
        }

        @Override
        public String toString() {
            return "{Units: " + buyUnit + ", Price: " + buyPrice;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyQueue<pair> q = new MyQueue<>();
        boolean keepGoing = true;
        int profit = 0;

        while(keepGoing) {

            System.out.print("Enter your query (in format 'Buy / Sell x shares at $ y price') :");
            String query = input.nextLine();
            if (query.isBlank()){
                System.out.println("Ending program. . .");
                keepGoing = false;
                break;
            }
            String[] temp = query.split(" ");

            int share = Integer.parseInt(temp[1]);
            int price = Integer.parseInt(temp[5]);
//            System.out.println(price);

            if (temp[0].equalsIgnoreCase("buy")) {
                System.out.println("Buying now. . . ");
                q.enqueue(new pair(share, price));
                System.out.println(q.toString());
            } else {
                System.out.println("Selling now. . .");
                while (!q.isEmpty() && share > 0) {
                    int priceDiff = price - q.peek().getBuyPrice();
                    // scenario 1
                    if (share >= q.peek().getBuyUnit()) {
                        profit += priceDiff * q.peek().getBuyPrice();
                        share -= q.peek().getBuyPrice();
                        q.dequeue();
//                        System.out.println(profit);
                    }
                    // scenario 2
                    else {
                        profit += priceDiff * share;
                        q.peek().modifyCount(-share);
                        share = 0;
                    }
                    System.out.println(q.toString());
                    System.out.println("Total Capital Gain/Lose " + profit);
                }
                if (q.isEmpty() && share>0){
                    System.out.println("No shares to sell");
                }
            }

        }
        System.out.println("Final Capital Gain/Lose " + profit);
    }
}
