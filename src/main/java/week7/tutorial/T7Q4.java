/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7.tutorial;

/**
 *
 * @author Hassanal
 */
import week7.spectrum.GenericQueue;
public class T7Q4 {
    public static void main(String[] args) {
        GenericQueue<Integer> X = new GenericQueue<>();
        X.enqueue(new Integer(14));
        X.enqueue(new Integer(3));
        X.enqueue(new Integer(5));
        
        Object Y = X.dequeue();
        X.enqueue(new Integer(7));
        X.enqueue(new Integer(9));
        Y = X.dequeue();
        X.enqueue(new Integer(2));
        X.enqueue(new Integer(4));
        
        System.out.println(X.front());
        
    }
}
