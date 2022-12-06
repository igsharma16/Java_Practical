public class Stack {
    Node top;
    
    void push(int d){                               //Stack implemented to store column numbers
        Node temp = new Node();
        temp.data = d;
        if(top == null){
            temp.next = null;
            top = temp;
        }
        else{
            temp.next = top;
            top = temp;
        }
    }

    int pop(){
        Node temp = top;
        top = top.next;
        int t = temp.data;
        temp = null;
        return t;
    }
}


//By  Gulshan Sharma 
// Roll No. 25597
// CSE - B