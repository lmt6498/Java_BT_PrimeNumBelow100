import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int numbers = nhap.nextInt();
        System.out.printf("Các số nguyên tố nhỏ hơn %d là: \n", numbers);
        int n = 2;
        for (n = 2; n < numbers; n++) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print("\t" + n);
            }
        }
    }
}
