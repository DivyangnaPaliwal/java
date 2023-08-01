import java.util.*;

public class t23 {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        // for (char ch = 'A'; ch <= 'Z'; ch++) {
        // System.out.println((char) (ch | ' '));
        // // prints abcdefghijklmnopqrstuvwxyz
        // }
        // int x = 4;
        // System.out.println(x + " + " + 1 + " is " + -~x);

        // int x = 4;
        // int y = 6;
        // System.out.println("before swapping :");
        // System.out.println("x = " + x + " y = " + y);
        //// swap
        // x = x ^ y;
        // y = x ^ y;
        // x = x ^ y;
        // System.out.println("after swapping :");
        // System.out.println("x = " + x + " y = " + y);

        // String str1 = "divyagnapaliwal";
        // String str2 = "chandrakalapaliwal";
        // String str = "divyangnapaliwal";
        //
        // System.out.println(str1.equals(str2) + " " + str1.equals(str));

        // String str=new Scanner(System.in).next();
        // int count=0;
        //
        // for(int i=0;i<str.length();i++){
        // char ch=str.charAt(i);
        // if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        // count+=1;
        // }
        // }
        // System.out.println(count);

        // String str="ApnaCollege".replace("l"," ");
        // System.out.println(str);

        String str1 = "earth";
        String str2 = "heart";

        // Convert Strings to lowercase. Why? so thatwe don't have to checkseparately
        // for lower & uppercase.

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same

        if (str1.length() == str2.length()) {

            // convert strings into char array

            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // sort the char array

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if the sorted char arrays are sameor identical then the strings areanagram

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of eachother.");
            }

            else {
                System.out.println(str1 + " and " + str2 + " are not anagrams ofeach other.");
            }
        } 
        else {
            // case when lengths are not equal
            System.out.println(str1 + " and " + str2 + " are not anagrams of eachother.");
        }
    }
}
