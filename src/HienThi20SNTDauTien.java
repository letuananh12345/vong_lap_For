import java.util.Scanner;

public class HienThi20SNTDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng cần kiểm tra:");
        int num = sc.nextInt();
        int count = 0;
        int number = 2;
        while (count < num) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(number+" ");
                count++;
            }
            number++;
        }
    }
}
