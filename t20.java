import java.util.*;

public class t20 {

    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at(" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;

    }

    public static void printLetters(String str) {
        //char ch;
        for (int i = 0; i < str.length(); i++) {
            //ch = str.charAt(i);
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) == 'u') {

                 System.out.print(str.charAt(i));
            }
            //System.out.println(ch +""+ i + "...."+ ch+0);
        }
        
    }

    public static void main(String[] args) {
        // int matrix[][] = { { 10, 20, 30, 40 },
        // { 15, 25, 35, 45 },
        // { 17, 29, 37, 48 },
        // { 32, 33, 39, 50 } };
        // int key = 34;
        // //staircaseSearch(matrix, key);
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
        // String fullName="Divyangna paliwal";
        // System.out.println(fullName.length());




        String firstName = "Divyangna";
        String lastName = "Paliwal";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(6));
        printLetters(fullName);
    }
}
