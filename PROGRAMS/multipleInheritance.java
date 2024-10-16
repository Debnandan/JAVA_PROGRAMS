interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats insects");
    }
    
    public void fly() {
        System.out.println("Bat flies using its wings");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Bat ob = new Bat();
        ob.eat();
        ob.fly();
    }
}

