import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a x");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x < 2) {

            System.out.println(x + " is not Prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(x)) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }

            if (check) {
                System.out.println(x + "is Prime");
            } else {
                System.out.println(x + "is not Prime");
            }
        }
    }
}
