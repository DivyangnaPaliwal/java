public class t24 {
    public static boolean containsduplicate(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int num[]={1,2,3,4,5,6,7,8};
        System.out.println(containsduplicate(num));
    }
}
