import java.util.Scanner;
class Constructor {
     Constructor(){
        System.out.println("Ripunjai Shukla");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            System.out.println(i);
        }

        // /System.out.println("constructor called ");
    }
    public static void main(String[] args) {
        Constructor s1 = new Constructor();
    }
}

