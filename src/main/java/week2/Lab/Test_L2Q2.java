package week2.Lab;

public class Test_L2Q2 {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.setE("test");
        intObj.setE(33);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
