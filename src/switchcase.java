import java.util.*;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int butten= sc.nextInt();
        switch (butten) {
            case 1:
                System.err.println("hello");
                break;
            case 2:
                System.out.println("namste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("default button");
                break;
        }
    }
    
}
