public class t12{
    /*public static void hollow_rectangle(int totRows, int totCols){

        for(int i=1;i<=totRows;i++){

            for(int j=1;j<=totCols;j++){

                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollow_rectangle(4,5);
    }*/

    /*public static void inverted_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_triangle(4);
    }*/
    /*public static void inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_half_pyramid(5);
    }*/
    /*public static void floyd_triangle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        floyd_triangle(5);
    }*/
    public static void zero_one_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            } 
            System.out.println(); 
        }
    }
    public static void main(String[] args){
        zero_one_triangle(5);
    }
    
}
