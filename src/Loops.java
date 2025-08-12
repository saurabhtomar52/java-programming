// sum of n natural number
import java.util.*;
public class  Loops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;

        do{
            n=sc.nextInt();
            if(n>100){
                break;
            }
            int sum=0;
            for(int i=1; i<=n; i++){
                sum =sum +i;
        }
            System.out.print(sum);
            System.out.println("_____________________");
        }while(true);
      
    }
}