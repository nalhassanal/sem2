package exam.Question4;
/*
A company will have a lucky draw activity during its annual dinner.
Currently, the company only has 10 staff and all are eligible
to join the activity if they attend the dinner. However, the
final list of joining the dinner is not confirmed yet.

To ensure that the lucky draw is successful, the company wants
to write a program so that lucky staff are selected randomly
from a list provided.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LuckyDraw {
    public static void main(String[] args) {
        LinkedList<Staff> staffList1 = listFromfile();

        LinkedList<Staff> staffList2 = staffList1.clone();

        round1(staffList1);

        round2(staffList2);
    }

    public static void round2(LinkedList<Staff> ls){
        int totalPrize = 1000;
        while (totalPrize > 0){
            int index = (int) (Math.random() * 10);
            Staff luckyStaff = ls.get(index);
            if(luckyStaff.getPosition().equals("Assistant")){
                totalPrize -= 200;
                if (totalPrize < 0)
                    break;
                System.out.println(luckyStaff.getPosition() + " " + luckyStaff.getName() + " wins RM200. Cash vourchers left RM" +totalPrize);
            }else if(luckyStaff.getPosition().equals("Supervisor")){
                totalPrize -= 100;
                if (totalPrize < 0)
                    break;
                System.out.println(luckyStaff.getPosition() + " " + luckyStaff.getName() + " wins RM100. Cash vourchers left RM" +totalPrize);
            }else if(luckyStaff.getPosition().equals("Manager")){
                System.out.println(luckyStaff.getPosition() + " " + luckyStaff.getName() + " is the winner, but no cash voucher will be given");
            }
        }
    }

    public static void round1(LinkedList<Staff> ls){
        String win = " wins a drone!";
        ArrayList<Integer> selectedStaffiD = new ArrayList<>();
        int index = 0;
        while (index < 5) {
            int rand = (int) (Math.random() * 10);// includes 0 and 9
            if (!selectedStaffiD.contains(rand)){
                index++;
                Staff luckyStaff = ls.get(rand);
                System.out.println(luckyStaff.getID() + " " + luckyStaff.getName() + win);
            }
            selectedStaffiD.add(rand);
        }
    }

    public static LinkedList<Staff> listFromfile(){
        LinkedList<Staff> toReturn = new LinkedList<>();
        String filepath = "staffList.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = br.readLine()) != null){
                String [] data = line.split(",");
                toReturn.addLast(new Staff(Integer.parseInt(data[0].trim()), data[1].trim(), data[2].trim()));
            }
            br.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return toReturn;
    }
}
