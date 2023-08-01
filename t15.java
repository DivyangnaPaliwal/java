public class t15 {
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {

            int curr = numbers[i];// 2,4,6,8,10

            for (int j = i + 1; i < numbers.length; j++) {

                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }

    public static void printSubarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);

        /*
         * reverse(numbers);
         * 
         * //print
         * for(int i=0;i<numbers.length;i++){
         * System.out.print(numbers[i] + " ");
         * }
         * System.out.println();
         */
        // printPairs(numbers);
    }
}
