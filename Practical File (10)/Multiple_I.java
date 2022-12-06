//Program to show multiple inheritence using Interfaces
//By Gulshan Sharma 
// 25597

public class Multiple_I implements IKitchen , IDrawingHall , IBedroom{
    public void store(){
        System.out.println("Keep the groceries on the shelf");
    }
    public void showcase(){
        System.out.println("Keep the prizes on the showcase.");
    }
    public void acProvision(){
        System.out.println("Provide an airconditioner in the bedroom");
    }

    public static void main(String[] args){
        Multiple_I m = new Multiple_I();
        m.store();
        m.showcase();
        m.acProvision();

        IKitchen k = new Multiple_I();
        k.store();
        IBedroom b = new Multiple_I();
        b.acProvision();
    }
}

interface IKitchen{
    void store();
}

interface IDrawingHall{
    void showcase();
}

interface IBedroom{
    void acProvision();
}

