import java.util.*;

class t7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int counter=0;
        while(counter<100){
            System.out.println("Hello World");
            counter++;
        }*/

        /*int i=1;
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
        System.out.println("Printing done");*/

        /*int i=1;
        int n=sc.nextInt();
        int sum=0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);*/

        //for(int i=1;i<=10;i++){
        //    System.out.println("Hello World");
        //}

        //for(int i=1;i<=4;i++){
        //    System.out.println("****");
        //}

        /*int i=1;
        do{
            System.out.println("Hello World");
            i++;
        }while(i<=10);*/

        /*for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of this loop");*/

        /*do{
            System.out.println("enter your number :");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);*/

        /*for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);*/

        do{
            System.out.print("enter your number :");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}

