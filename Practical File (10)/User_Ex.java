//Program to create a  user defined exception
// Gulshan Sharma 25597

class MyException extends Exception{
    int detail;

    public MyException(int a){
        detail = a;
    }
    public String toString(){
        return "MyException " + detail + " ";
    }
}   // Class MyException

public class User_Ex {
    public static void main(String[] args) {
        try{
            comp(1);
            comp(20);
        }
        catch (MyException e){
            System.out.println("Caught " + e);
        }
    }

    static void comp(int a) throws MyException{
        System.out.println("Computing " + a);
        if(a > 10){
            throw new MyException(a);
        }
        System.out.println("Exit");
    }
}




