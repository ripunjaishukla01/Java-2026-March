import java.util.Scanner;

public class array {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int size = sc.nextInt();
    int []marks = new int[size];
    for(int j = 0;j<size; j++){
       System.out.print("Enter the number to store at "+ (j+1) +" index : ");
        marks[j] = sc.nextInt();
    }

    for (int mark : marks) {
        System.out.println(mark);
    }
   } 
}
