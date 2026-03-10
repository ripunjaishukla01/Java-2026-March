import java.util.Scanner;

class algebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}

public class pratice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        algebra obj = new algebra();
        int result = obj.add(num1, num2);
        System.out.println("Sum = " + result);
    }
}