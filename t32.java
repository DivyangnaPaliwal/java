public class t32 {
    public static void main(String[]args){
        Horse h=new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();;
    }
}

abstract class Animal12{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal12{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}

class Chicken extends Animal12{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}