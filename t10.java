import java.util.*;
public class t10{
    /*public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        System.out.println(factorial(4));
    }*/

    /*public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }*/

    /*public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(5, 3));
        System.out.println(sum(3.2f, 4.8f));
    }*/

    public static boolean isPrime(int n){

        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;    
            }
        }
        return true;
    }

    public static void PrimesinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println( );
    }

    public static void main(String[] args){
        PrimesinRange(100);
    }
}