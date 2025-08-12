public class pattern6{
    public static void main(String[] args) {
        int a=5;
        // int b=5;
        for(int i=1;i<=a;i++){
            for(int j=a;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print( "#");
                }
            }System.out.println();
        }
    }   
}
