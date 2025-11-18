package SOLID;

public class L {
    
    public abstract class Bird {
        public abstract void eat();
    }

    public interface IFlyable {
        void fly();
    }

    public interface IRunnable {
        void run();
    }

    public class FlyingBird extends Bird implements IFlyable {
        @Override
        public void eat() {
            System.out.println("Flying bird is eating");
        }

        @Override
        public void fly() {
            System.out.println("Flying bird is flying");
        }
    }

    public class FlightlessBird extends Bird implements IRunnable {
        @Override
        public void eat() {
            System.out.println("Flightless bird is eating");
        }

        @Override
        public void run() {
            System.out.println("Flightless bird is running");
        }
    }

    public class Sparrow extends FlyingBird {
    }

    public class Ostrich extends FlightlessBird {
    }

    public static void main(String[] args) {
        L l = new L();
        
       
        Bird sparrow = l.new Sparrow();
        Bird ostrich = l.new Ostrich();
        
        sparrow.eat(); 
        ostrich.eat();  
        
     
        IFlyable flyingBird = l.new Sparrow();
        flyingBird.fly(); 
        
        IRunnable runningBird = l.new Ostrich();
        runningBird.run(); 
    }
}