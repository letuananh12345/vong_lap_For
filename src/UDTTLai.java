import java.sql.SQLOutput;
import java.util.Scanner;

public class UDTTLai {
    public static void main(String[] args) {
        double TienGui = 1.0;
        int ThangGui = 1;
        double TiLeLaiSuat=1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("nhập số tiền gửi");
        TienGui=input.nextDouble();

        System.out.println("nhập số tháng gửi");
        ThangGui=input.nextInt();

        System.out.println("nhập tỷ lệ lãi suất");
        TiLeLaiSuat=input.nextDouble();

        double SoTienLai =0;
        for (int i=0;i<ThangGui;i++){
            SoTienLai+= TienGui*(TiLeLaiSuat/100)/12*ThangGui;
        }
        System.out.println(SoTienLai);
    }

}
