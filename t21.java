import java.util.*;

public class t21 {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a palindrome
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;
            }
            // east
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    // public static int sum(int a, int b){
    // int sum = a+b;
    // return sum;
    // }

    public static void Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {
        String newStr = " ";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        // String path="WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // String s1="divyangna";
        // String s2="divyangna";
        // String s3=new String("divyangna");

        // if(s1==s2){
        // System.out.println("equal");
        // }
        // else{
        // System.out.println("not equal");
        // }

        // if(s1==s3){
        // System.out.println("equal");
        // }
        // else{
        // System.out.println("not equal");
        // }

        // if(s1.equals(s3)){
        // System.out.println("equal");
        // }
        // else{
        // System.out.println("not equal");
        // }

        // substring
        // String str="HelloWorld";
        // System.out.println(substring(str, 0, 5));

        // String fruits[] = { "apple", "mango", "banana" };
        //
        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }
        // System.out.println(largest);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the no.:5 6");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println(sum(a, b));
        //
        // System.out.println();
        // int num=sc.nextInt();

        // Scanner sc = new Scanner(System.in);
        // int c = 1;
        // while(c==1){
        // Sum();
        // System.out.println("For Continue 1 , For Break 0 ");
        // c = sc.nextInt();
        // }

        // StringBuilder sb=new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        // sb.append(ch);
        // }
        // System.out.println(sb.length());

        // String str="hi, i am divyangna.";
        // System.out.println(toUpperCase(str));

        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
