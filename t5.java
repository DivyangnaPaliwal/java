import java.util.*;

public class t5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        /*int age=sc.nextInt();
        if(age>=18){
            System.out.println("vote, drive");

        }
        else{
            System.out.println("not adult");
        }*/
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater then b");
        }
        else if(a==b){
            System.out.println("both are equal");
        }
        else{
            System.out.println("b is greater then a");
        }
        */

        /*int a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }*/

        /*int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }
        else if(income>=500000 && income<=1000000){
            tax = (int) (income*0.2);
        }
        else{
            tax = (int) (income*0.3);
        }
        System.out.println("your tax is : "+ tax);*/

        /*int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("a is biggest of 3");
        }
        else if(b>=c){
            System.out.println("b is greatest of 3");
        }
        else{
            System.out.println("c is greatest of 3");
        }*/

        //int number=sc.nextInt();
        //String type = (number%2==0) ? "even" : "odd";
        //System.out.println(type);

        //int marks=sc.nextInt();
        //String reportCard = (marks >=33)? "pass" : "fail";
        //System.out.println(reportCard);

        /*int number = 4;

        switch(number){
            case 1: System.out.println("samosa");
                    break;
            case 2: System.out.println("momos");
                    break;
            case 3: System.out.println("mango shake");
                    break;
            default: System.out.println("we woke up");                        
        }*/

        /*System.out.println("enter a :");
        int a=sc.nextInt();

        System.out.println("enter b :");
        int b=sc.nextInt();

        System.out.println("enter the operator");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':System.out.println(a+b);
                     break;
            case '-':System.out.println(a-b);
                     break;
            case '*':System.out.println(a*b);
                     break;
            case '/':System.out.println(a/b);
                     break;
            case '%':System.out.println(a%b);
                     break;
            default :System.out.println(a%b);         
        }*/

        /*int number=sc.nextInt();
        if(number%2==0){
            System.out.println("positive");
        }
        else{
            System.out.println("negetive");
        }*/

        /*double temp=sc.nextDouble();
            if(temp>=100){
                System.out.println("you have a fever");
            }                 
            else{
                System.out.println("you dont have a fever");
            }*/
        
        int number=sc.nextInt();
        switch(number){
            case 1:System.out.println("Sunday");
                   break;
            case 2:System.out.println("Monday");
                   break;
            case 3:System.out.println("Tuesday");
                   break;
            case 4:System.out.println("Wednesday");
                   break;
            case 5:System.out.println("Thursday");
                   break;
            case 6:System.out.println("Friday");
                   break;
            case 7:System.out.println("Saturday");
                   break;
            default:System.out.println("Enter the valid number");                                                 
        }    

    }
}
