public class t14 {
    public static int binarySearch(int numbers[], int key){
        int start=0;
        int end=numbers.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            
            //comparison
            if(numbers[mid]==key){//found
                return mid;
            }
            if(numbers[mid]<key){//right
                start=mid+1;
            }
            else{//left
                end=mid-1;
            }
        }
        return -1;
    }

    /*public static void reverse(int numbers[]){
        int first=0, last=numbers.length-1;

        while(first<last){
            //swap
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;
            last--;
        }
    
    public static void main(String[] args){
        /*int numbers[]={2,4,6,8,10,12,14};
        int key=10;

        System.out.println("index for the key is : " + binarySearch(numbers, key));*/

        int numbers[]={2, 4, 3, 8, 10};

        reverse(numbers);

    }

    
}
