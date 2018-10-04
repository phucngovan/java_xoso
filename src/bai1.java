import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottery = 12;
        System.out.println("nhập số đầu tiên");
        int guessDigit1 = sc.nextInt();
        System.out.println("nhập số thứ 2");
        int guessDigit2 = sc.nextInt();
        int x = guessDigit1 * 10 + guessDigit2;
        if (x==lottery) {
            System.out.println("chúc mừng bạn đã trúng 1 tỷ");

        }else if(guessDigit1==lottery-10&&guessDigit2==(lottery-2)/10) {
            System.out.println("bạn đã trúng 100 triệu");
        }else if(guessDigit1==1||guessDigit2==1) {
            System.out.println("bạn trúng 50tr");
        }else if(guessDigit1==2||guessDigit2==2) {
            System.out.println("bạn trúng 50tr");
        }else {
            System.out.println("è");
        }
    }
}
