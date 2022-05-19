package week9;

import org.jetbrains.annotations.NotNull;

public class pQueueEX implements Comparable<pQueueEX>{
    private String name;
    private int id;

    public pQueueEX(){}

    public pQueueEX(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(pQueueEX other) {
        return getId() == other.getId();
    }

    @Override
    public int compareTo(pQueueEX other) {
        if (this.equals(other))
            return 0;
        else if (getId() > other.getId())
            return 1;
        else
            return -1;
    }

    public String toString(){
        return "EX{ Name = " + name + ", ID = " + id + " }";
    }
}
