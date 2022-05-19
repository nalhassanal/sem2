package week9.labtest2.set2;

import org.jetbrains.annotations.NotNull;

public class packet implements Comparable<packet>{
    private String type;
    private int id;
    private final String[] typeList = {"Voice", "Video", "Data"};
    private int priority;

    public packet(String type){this.type = type;}

    public packet(String type, int id){
        this.type = type;
        this.id = id;
        setPriority();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(packet other) {
        return getType().equals(other.getType());
    }

    private void setPriority(){
        if (getType().equalsIgnoreCase(typeList[0]))
            priority = 2;
        if (getType().equalsIgnoreCase(typeList[1]))
            priority = 1;
        if (getType().equalsIgnoreCase(typeList[2]))
            priority = 0;
    }

    public int getPriority() {
        return priority;
    }

    public boolean contains (String type){
        return type.equalsIgnoreCase(this.type);
    }

    public boolean contains (int id){
        return id == this.id;
    }

    @Override
    public int compareTo(packet other) {
        if (getPriority() >= other.getPriority())
            return 1;
        if (getPriority() <= other.getPriority())
            return -1;
        else
            return 0;
    }

    public String toString(){
        return type + " " + id + " (Priority=" + priority + ")";
    }
}
