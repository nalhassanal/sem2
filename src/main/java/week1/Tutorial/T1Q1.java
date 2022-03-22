package week1.Tutorial;
/*
   Write the definition of a class Telephone that contains:
   - An instance variable areaCode
   - An instance variable number
   - A static variable numberOfTelephoneObject that keeps track of the number of Telephone objects created
   - A constructor that accepts two arguments used to initialize the two instance variables
   - The accessor and mutator methods for areaCode and number
   - A method makeFullNumber that does not accept any arguments, concatenates areaCode and number
      with a dash in between, and returns the resultant string.
    */
    /*
    Write the statements to:
    - Instantiate 5 Telephone objects and store them in an array. Iterate through the array to
      print the full number of the 5 Telephone objects on the console. Your output should look as below:
       03-79676300
       03-79676301
       03-79676302
       03-79676303
       03-79676304
     */

public class T1Q1 {
    public static class Telephone{
        private int number;
        private int areaCode;
        static int numberOfTelephoneObject;

        public Telephone (int code, int number){
            this.areaCode = code;
            this.number = number;
        }

        public void setAreaCode(int code){
            this.areaCode = code;
        }

        public int getAreaCode(){
            return areaCode;
        }

        public void setNumber(int number){
            this.number = number;
        }

        public int getNumber(){
            return number;
        }

        public String makeFullNumber(){
            String ret = "0" + areaCode + "-" + number;
            return ret;
        }
    }

    public static void main(String[] args) {
        Telephone [] Telephone_obj = new Telephone[5];

        for ( int i = 0 ; i < Telephone_obj.length; i++){
            Telephone_obj[i]= new Telephone(03,79676300+i);
            System.out.println(Telephone_obj[i].makeFullNumber());
        }
    }
}

