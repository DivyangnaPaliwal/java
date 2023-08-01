public class t28{
    public static void main(String[]args){
        Mammal lion=new Mammal();
        lion.eat();
        lion.legs=4;
        System.out.println(lion.legs);
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

//class Cat extends Mammal{
//    String breed;
//}

//class Fish extends Animal{
//    int fins;
//
//    void swim(){
//        System.out.println("swims in water");
//    }
//}