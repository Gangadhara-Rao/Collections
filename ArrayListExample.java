package cg;

import java.util.*;
public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);  
        for (Integer num : al) {         
            System.out.println(num);   
        }
    }
}
