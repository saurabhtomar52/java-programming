// Rectangle
// public class pattern1{
//     public static void main(String[] args) {
//         int a=4;
//         int b=8;
//         for(int i=1; i<=a; i++){
//             for(int j=1; j<=b; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// // }
// ..............................................

// Hollow rectangle
public class pattern1{
    public static void main(String[] args) {
        int a=5;
        int b=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(j==1 || j==b||i==1||i==a){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

}
