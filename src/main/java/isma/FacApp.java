package isma;

import java.util.Scanner;
public class FacApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        String name = input.next() +" "+ input.next();
        int basic = input.nextInt();
        int DA = input.nextInt();
        int MedAllowance = input.nextInt();
        int OtherAllowance = input.nextInt();

        switch (choice){
            case 1:
                AssistantProfessor a = new AssistantProfessor(name,basic,DA);
                System.out.println(a.getDetails());
                break;
            case 2:
                AssociateProfessor b = new AssociateProfessor(name,basic,DA,MedAllowance);
                System.out.println(b.getDetails());
                break;
            case 3:
                Professor c = new Professor(name,basic,DA,MedAllowance, OtherAllowance);
                System.out.println(c.getDetails());
                break;

        }

    }
}
