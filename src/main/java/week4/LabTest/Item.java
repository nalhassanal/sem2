package week4.LabTest;

import org.jetbrains.annotations.NotNull;

/*
generic class Item <T1,T2>
	T1 item
	T2 price
 */
public class Item <T1, T2>{
    private T1 item;
    private T2 price;

    public Item() {
    }

    public Item(T1 item, T2 price) {
        this.item = item;
        this.price = price;
    }

    public T1 getItem() {
        return item;
    }

    public void setItem(T1 item) {
        this.item = item;
    }

    public T2 getPrice() {
        return price;
    }

    public void setPrice(T2 price) {
        this.price = price;
    }

}
