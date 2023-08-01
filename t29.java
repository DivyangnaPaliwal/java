class Animal12 {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal12 extends Animal12 {
    void walk() {
        System.out.println("walks");
    }
}

class Dog12 extends Mammal12 {
    void bark() {
        System.out.println("barks");
    }
}

class Cat12 extends Mammal12 {
    void moew() {
        System.out.println("moews");
    }
}

class Fish12 extends Animal12 {
    void swim() {
        System.out.println("swims");
    }
}

class Tuna12 extends Fish12 {
    void fat() {
        System.out.println("fatter");
    }
}

class Shark12 extends Fish12 {
    void big() {
        System.out.println("bigger");
    }
}

class Bird12 extends Animal12 {
    void fly() {
        System.out.println("flies");
    }
}

class Peacock12 extends Animal12 {
    void beautiful() {
        System.out.println("beautiful");
    }
}

//class Dog12 extends Mammal {
//    String breed;
//}

public class t29 {
    public static void main(String[] agrs) {
        Peacock12 p1=new Peacock12();
        p1.eat();
    }
}