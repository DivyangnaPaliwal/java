import java.util.*;

public class t6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int year=sc.nextInt();
        if(((year % 400 == 0)  || (year % 4 == 0)) && (year % 100 != 0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }*/

        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float avg = (a+b+c)/3f;
        System.out.println(avg);*/

        //int s=sc.nextInt();
        //int area = s*s;
        //System.out.println(area);

        /*float pencil=sc.nextInt();
        float pen=sc.nextInt();
        float eraser=sc.nextInt();
        float sum = pencil+pen+eraser;
        System.out.println("total : " + sum);
        float gst=sum*0.18f;
        System.out.println("gst : " + gst);
        sum=sum+gst;
        System.out.println("after adding gst : " + sum);*/

        /*int n=sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }
        else if(n<0){
            System.out.println("the number is negetive");
        }
        else{
            System.out.println("the number is zero");
        }*/

        /*int a=sc.nextInt();
        if((a%5==0) && (a%11==0)){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }*/

        /*char ch = sc.next().charAt(0);
        if((ch >='a' && ch<='z') || (ch >='A' && ch <='Z')){
            System.out.println("an alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }*/

        /*char ch=sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("an alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("a digit");
        }
        else{
            System.out.println("a special character");
        }*/

        /*char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("upper case");
        }
        else{
            System.out.println("not valid");
        }*/

        int month=sc.nextInt();
        switch(month){
            case 1: System.out.println("january");
                    break;
            case 2: System.out.println("february");
                    break;
            case 3: System.out.println("march");
                    break;
            case 4: System.out.println("april");
                    break;
            case 5: System.out.println("may");
                    break;
            case 6: System.out.println("june");
                    break;
            case 7: System.out.println("july");
                    break;
            case 8: System.out.println("august");
                    break;
            case 9: System.out.println("september");
                    break;
            case 10: System.out.println("october");
                    break;
            case 11: System.out.println("november");
                    break;
            case 12: System.out.println("december");
                    break;        
        }





    }
    
}
