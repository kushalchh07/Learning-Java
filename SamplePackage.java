

public class SamplePackage {
    
    public class Animal{
public void eat(){
    System.out.println("Eating...");
}
    }
    
    public class Dog extends Animal{
        public void eat(){
            System.out.println("Eating...");
        }
    }

    public static void main(String args[]) {
        SamplePackage sp = new SamplePackage();
        sp.new Dog().eat();
    }
}
