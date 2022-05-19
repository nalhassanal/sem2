package week9.labtest2.set2;

import java.util.LinkedList;

public class priorityQ {
    private final LinkedList<packet> ls;

    public priorityQ(){
        this.ls = new LinkedList<>();
    }

    private int highPriority(packet e){
        return e.getPriority();
    }

    public int size(){
        return ls.size();
    }

    public int lastIndexOf(String type){
        int index = size();
        LinkedList<packet> temp = (LinkedList<packet>) ls.clone();
        if (type.equals("")){
            while(!temp.isEmpty()){
                index--;
                String tempo = temp.pop().getType();
                if(tempo.equals(""))
                    return index;
            }
        }
        if (!type.equals("")) {
            while (!temp.isEmpty()){
                index--;
                String tempo = temp.pop().getType();
                if (type.equalsIgnoreCase(tempo)){
                    return index;
                }
            }
        }
        return index;
    }

    public int indexOf(String type){
        int index = 0;
        LinkedList<packet> temp = (LinkedList<packet>) ls.clone();
        if (type.equals("")){
            while(!temp.isEmpty()){
                String tempo = temp.pop().getType();
                if(tempo.equals(""))
                    return index;
                index++;
            }
        }
        if (!type.equals("")) {
            while (!temp.isEmpty()){
                String tempo = temp.pop().getType();
                if (type.equalsIgnoreCase(tempo)){
                    return index;
                }
                index++;
            }
        }
        return index;
    }

    public void enqueue(packet e){
        if (size() == 0) {
            ls.addFirst(e);
            return;
        }
        // if the priority of e is higher than the top of the queue
        if (e.getPriority() == 2) {
            int index = lastIndexOf("Voice");
//            System.out.println(index);
            ls.add(index, e);
        }
        else if (e.getPriority() == 1){
            int index = lastIndexOf("Video");
            System.out.println(index);
            ls.add(index, e);
        }
        // if the priority of e is lower than the top of the queue
        else
            ls.add(e);
    }

    public packet dequeue(){
        return ls.removeFirst();
    }

    public packet peek(){
        return ls.get(0);
    }

    public boolean contains (packet e){
        return ls.contains(e);
    }

    public boolean remove(packet e){
        if(contains(e)) {
            ls.remove(e);
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return ls.isEmpty();
    }

    public void clear(){
        ls.clear();
    }

    public void displayQueue(){
        for (packet p:
             ls) {
            System.out.println(p);
        }
    }

}
