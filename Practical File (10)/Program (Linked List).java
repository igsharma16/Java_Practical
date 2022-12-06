import java.util.Scanner;
import java.util.ArrayList;

public class Program{
    public static void main(String[] args){
        List linked = new List();   
        inp e = new inp(linked);
        for(Integer c : e.b1){
            System.out.println(linked.pop(c));
        }
    }
}

class Node{
    int data;
    Node next;
}

class List{
    Node head;

    void add(int d){
        Node temp = new Node();
        temp.data = d;
        temp.next = null;
        
        if(head == null){
            head = temp;
        }
        else{
            Node t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = temp;
        }
    }

    int pop(int pos){
        Node temp = head;
        while(pos -2 > 0){
            temp = temp.next;
            pos--;
        }
        Node z = temp.next;
        int k = z.data;
        temp.next = z.next;
        z = null;
        temp = null;
        return k;
    }
}

class inp{
    Scanner ip = new Scanner(System.in);
    
    ArrayList<Integer> b1 = new ArrayList<Integer>();


    public inp(List linked){
    int N = ip.nextInt();
    for(int i = 0 ; i < N ; i++){
        linked.add(ip.nextInt());
    }
    int M = ip.nextInt();
       for(int j = 0 ; j < M ; j++){
        b1.add(ip.nextInt());
    }
}
}