import java.util.*;
public class Gradecalculater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the student marks between 1 to 100:");
        int marks= sc.nextInt();
        int grade= marks/10;
        switch (grade) {
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;        
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;    
            default:
                System.out.println("Fail");
                break;
        }
            
        }


    }
    

