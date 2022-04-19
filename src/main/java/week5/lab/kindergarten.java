package week5.lab;

import java.util.Scanner;

public class kindergarten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> studentNames = new LinkedList<>();
        boolean keepGoing = true;
        String name;
        System.out.println("Enter your student name list. Enter 'n' to end...");
        while (keepGoing){
            name = input.nextLine();
            if (name.equalsIgnoreCase("n")) {
                keepGoing = false;
                break;
            }
            studentNames.add(name);
        }
        System.out.println("\nYou have entered the following students' name :");
        studentNames.printList();

        System.out.println("\nThe number of students entered is : " + studentNames.getSize());

        char rename;
        keepGoing = true;
        while (keepGoing){
            System.out.println("All the names entered are correct? " +
                    "Enter 'r' to rename the student name," +
                    "'n' to proceed.");
            rename = input.next().charAt(0);
            if ( rename == 'n'){
                keepGoing = false;
                break;
            }
            System.out.println("\nEnter the existing student name that you want " +
                    "to rename :");
            String target = input.next() + input.nextLine();

            System.out.println("\nEnter the new name :");
            String newName = input.nextLine();

            studentNames.replace(target, newName);

            System.out.println("\nThe new student list is : ");
            studentNames.printList();
            System.out.println();
        }
        System.out.println();
        char remove;
        keepGoing = true;
        while (keepGoing){
            System.out.println("Do you want to remove any of your student name?" +
                    " Enter 'y' for yes, 'n' to proceed");
            remove = input.next().charAt(0);
            if ( remove == 'n'){
                keepGoing = false;
                break;
            }
            System.out.println("\nEnter a student name to remove : ");
            String toBeRemoved = input.next() + input.nextLine();

            studentNames.removeElement(toBeRemoved);

            System.out.println("\nThe number of updated students is : " + studentNames.getSize());
            System.out.println("The updated student list is : ");
            studentNames.printList();
            System.out.println();
        }
        System.out.println("\nAll student data captured complete. Thank you!");
    }
}
