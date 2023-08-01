import java.util.*;

public class t13 {
    /*public static void butterfly(int n){
        //first half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        butterfly(4);
    }*/
    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }  
    }
    public static void diamond(int n){
        //first half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        
        for(int i=1;i<=numbers.length;i++){
            if(largest)
            largest=numbers[i];
        }
    }
    public static void main(String[] args){
        //solid_rhombus(5);
        //hollow_rhombus(5);
        //diamond(4);
        int numbers[]={1, 2, 6, 3, 5};

    }
}
