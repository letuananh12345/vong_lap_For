import java.util.Scanner;

public class UCMAX {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a: ");
        a = sc.nextInt();

        System.out.println("Enter b: ");
        b = sc.nextInt();

        a = Math.abs(a); // tra ve gia tri tuyet doi cua a khi nhap. vd : math.abs(-2)=2
        b = Math.abs(b);

        if (a==0 || b==0){
            System.out.println("khong co uoc chung max");
        }
            while (a!=b){
                if (a>b){
                a=a-b;
            }else {
                    b=b-a;
                }
                }
        System.out.println("uoc chung max la: " + a);
    }
}
