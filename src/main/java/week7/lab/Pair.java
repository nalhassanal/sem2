package week7.lab;

public class Pair {
    private int unit;
    private int price;
    public Pair(int StoreUnit, int price){
        this.unit =StoreUnit;
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public int getPrice() {
        return price;
    }

    public void setUnit(int unit) {
        this.unit += unit;
    }

    public String toString(){
        return "(Unit = " + unit + ", Price = " + price + ")";
    }
}
