public class Polymorphism{
    public static void main(String[] args){
        Bus b = new Bus();
        Car c = new Car();
        b.steering();
        c.steering();
        b.brake();
        c.brake();

    }
}

interface Ivehicle{
    void steering();
    void brake();
}

class Bus implements Ivehicle{
    public void steering(){
        System.out.println("Steering is used to turn the bus");
    }
    public void brake(){
        System.out.println("Brake is applied to reduce speed of the bus");
    }
}

class Car implements Ivehicle{
    public void steering(){
        System.out.println("Steering is used to turn car");
    }
    public void brake(){
        System.out.println("Brake is applied to stop the car.");
    }
}

