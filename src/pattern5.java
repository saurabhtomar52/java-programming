public class pattern5{
    public static void main(String[] args) {
        int a=5;
        int b=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j<i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }System.out.println();
        }
    }
}