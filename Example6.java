import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
         
        if ( num >=1 ) {
            System.out.println("this is positive number.");
        } 
        else if (num == 0){
            System.out.println("Neither negative nor positive.");
        }
        else {
            System.out.println("this is negative number.");
        }
    }
}
