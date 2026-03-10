import java.util.Scanner;

public class DarkLightIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mode :");
        String mode = sc.next();
        if (mode.equalsIgnoreCase("dark")) {
            System.out.println( "Mode color is black");
        }
        else if(mode.equalsIgnoreCase("light")){
            System.out.println("Mode color is white");
        }
        else{
            System.out.println("Not a valid mode - Are you doing comedy with me !!!");
        }
    }
}