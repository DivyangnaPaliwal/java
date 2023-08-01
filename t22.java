import java.util.*;

public class t22 {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static int geIthBit(int n, int i) {
        int bitMask = 1;
        if ((n & (1 << bitMask)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(i << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = 1 << i - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans=1;

        while(n>0){
            if((n&1)!=0){//check LSB
               ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // oddOrEven(3);
        // oddOrEven(8);
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearBitsInRange(10, 2, 4));
        // System.out.println(isPowerOfTwo(15));
        // System.out.println(countSetBits(15));
        System.out.println(fastExpo(3, 5));
    }
}
