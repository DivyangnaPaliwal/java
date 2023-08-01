import java.util.*;

public class t16 {
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=1;j<numbers.length;j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("max subarray sum = " + ms);
    }
    public static void main(String[] args){
        int numbers[]={-2, -3, 4, -1, -2, 1, 5, -3};
        //maxSubarraySum( numbers);
        kadanes(numbers);
    }
}
