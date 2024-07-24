package learnAdvanced.LearnArray.linkedList1;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * LinkedList <String> ll = new LinkedList<>();
 * 
 * ll.add("EE");
 * ll.add(2, "WSA");
 * ll.addAll(al);
 * ll.addAll(3, al1);
 * ll.addFirst("FS");
 * ll.addLast("lop");
 * 
 * ll.contains("EE")
 * ll.containsAll(al1)
 * ll.contains("wwwwww")
 * 
 * ll.set(2, "ewqsr");
 * 
 * ll.size()
 * 
 * ll.clear();
 * ll.remove();
 * ll.remove(6);
 * ll.removeAll(al1);
 * ll.removeFirst();
 * ll.removeFirstOccurrence("ews");
 * ll.removeLast();
 * ll.removeLastOccurrence("ews");
 * 
 * ll.element()
 * 
 * ll.get(6)
 * ll.getFirst()
 * ll.getLast()
 * 
 * ll.indexOf("ews")
 * ll.indexOf("poleswss")
 * ll.lastIndexOf("ews")
 * 
 * ll.isEmpty()
 * 
 * ll.peek()
 * ll.peekFirst()
 * ll.peekLast()
 * 
 * ll.poll()
 * ll.pollFirst()
 * ll.pollLast()
 */

public class LearnLinkedList {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("qas");
        al.add("pol");
        al.add("lwq");

        ArrayList <String> al1 = new ArrayList<>();
        al1.add("qas");
        al1.add("EE");
        al1.add("ews");

        LinkedList <String> ll = new LinkedList<>();

        ll.add("EE");
        ll.add("ESD");
        ll.add("ews");

        //System.out.println(ll);

        ll.add(2, null);
        ll.add(2, "opi");
        
        //System.out.println(ll);

        ll.addAll(al);
        //System.out.println(ll);

        ll.addAll(3, al1);
        //System.out.println(ll);

        ll.addFirst(null);
        ll.addLast("lop");

        System.out.println(ll.poll());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);
    }
}
