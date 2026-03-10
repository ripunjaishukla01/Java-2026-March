import java.util.Scanner;

public class praticeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of String : ");
        int size = sc.nextInt();
         sc.nextLine(); 
        String []city = new String[size];
         for(int j = 0;j<size; j++){
       System.out.print("Enter the number to store at "+ (j+1) +" index : ");
        city[j] = sc.nextLine();
    }
    
    for (String mark : city) {
        System.out.println(mark);
    }

        System.out.println("\nStored Cities:");
        for (int i = 0; i < city.length; i++) {
            System.out.println((i + 1) + ". " + city[i]);
        }
        
   } 
    }

