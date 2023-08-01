import java.util.*;

public class t9 {
    /*public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }*/

    /*public static int calculateSum(int num1 , int num2){ //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args){
        //printHelloWorld();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = a+b;
        sum = calculateSum(a , b); //arguments or actual parameters
        System.out.println(sum);
    }*/
    public static int multiply(int a, int b){
        int product = a*b;
        return product; 
    }
    public static void main(String[] args){
        int a=3;
        int b=5;
        int pro = multiply(a,b);
        System.out.println(pro);

        int x=12;
        int y=6;
        pro=multiply(x, y);
        System.out.println(pro);
    }
}
