import java.util.*;

public class t25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Animal Fish=new Animal();
        Fish tuna=new Fish();
        Fish shark=new Fish();
        Animal Bird=new Animal();
        Bird peacock=new Bird();
        Bird sparrow=new Bird();
        Animal Mammal=new Animal();
        Mammal dog=new Mammal();
        Mammal cat=new Mammal();
        
    }
}
class Animal{
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}
class Fish extends Animal{
     void swim(){
        System.out.println("swims");
     }
}
class tuna extends Fish{
    int teeth;
}
class shark extends Fish{
    void bigMouth(){
        System.out.println("big mouth");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}
class peacock extends Bird{
    void feathers(){
        System.out.println("beautiful feathers");
    }
}
class sparrow extends Bird{
    void cute(){
        System.out.println("cute");
    }
}
class Mammal extends Animal{
    int legs;
}
class dog extends Mammal{
    void bark(){
        System.out.println("barks");
    }
}
class cat extends Mammal{
    void moew(){
        System.out.println("meows");
    }
}