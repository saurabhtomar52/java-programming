//  variable, input, output.
// import java.util.*;
// public class veriable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum=a+b;
//         int multiply=a*b;
//         System.out.println(sum);
//         System.out.println(multiply);

//     }
    
// }
// java is a typed language that means fist we define the type of variable before the name of variable
// data type are two types primitive{byte, short, char, boolean, int, long, float, double} and Non primitive{string, array, class, object, interface}

// conditional statement(if, else, switch, break);
// even odd code
import java.util.*;
public class veriable{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd" );
        }
    }
}