import java.util.Scanner;

public class EvenOddIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        try {
            int num = sc.nextInt();
            if ( num % 2 == 0) {
                System.out.println(num +" is a even number.");
            }else{
                System.out.println(num + " is a odd number.");
            }  
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception occured : " + e);
        } finally {
            sc.close();
            System.out.println("Program executed successfully.");
        }

    }
}
