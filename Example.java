    //  Check karo number even hai ya odd.
    import java.util.*;
public class Example {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    
    try {
        int num = sc.nextInt();
        if (num %2==0) {
            System.out.println(num+" this is even Number ");
        } else {
            System.out.println(num+" this is odd number");    
        }
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Error"+e);
    }
   } 
}
