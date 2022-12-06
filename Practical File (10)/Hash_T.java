// a program illustrating the use of HashTable class and its methods.
// By Gulshan Sharma 25597

import java.util.*;
class Student{
    String id;
    String name;
    Student(String std_id , String std_name){
        id = std_id;
        name = std_name;
    }
    String getId(){
        return id;
    }
    String getName(){
        return name;
    }

}
public class Hash_T {
    public static void main(String[] args){
        Hashtable tb1 = new Hashtable();
        Student s1 , s2;
        s1 = new Student("1234" , "John");
        tb1.put(s1.getId() , s1);

        s2 = (Student) tb1.get("1234");
        System.out.println("Student name is " + s2.getName());
    }
}
