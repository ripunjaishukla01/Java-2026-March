import java.util.Scanner;

public class pratice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a button number (1-4): ");
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
            }else if (button == 2){
            System.out.println("Namaste");
            }
        
            else if (button == 3){
            System.out.println("Jai Shree Ram");
            }
            else if (button ==4){
            System.out.println("Ripunjai Shukla");
            }
            else{
            System.out.println("Invalid Button" );

        }
    }
}
