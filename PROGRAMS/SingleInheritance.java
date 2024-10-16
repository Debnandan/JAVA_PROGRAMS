class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class DomesticAnimal extends Animal{
    void walk(){
        System.out.println("walking");
    }
}
class dog extends DomesticAnimal{
    void sound(){
        System.out.println("Barks");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        dog ob = new dog();
        ob.sound();
        ob.walk();
        ob.eat();
    }

}
