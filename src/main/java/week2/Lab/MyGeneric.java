package week2.Lab;

public class MyGeneric <T>{
    T e;
    public MyGeneric(){

    }

    public MyGeneric(T e){
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
}
