import java.util.Scanner;

public class GunOdev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenmek istediğiniz günü (1-7) arasında giriniz: ");
        int gun = scanner.nextInt();

        if (gun == 1 ){
            System.out.println("Yevmu’l-Eḥad Günü");
        }
        else if (gun == 2) {
            System.out.println("Yevmu’l-İs̠neyn günü");
        }else if (gun == 3) {
            System.out.println("Yevmu’s̠-S̠ülās̠ā’ günü");
        }
        else if (gun == 4) {
            System.out.println("Yevmu’l-Erbi‘ā’ günü");
        }
        else if (gun == 5) {
            System.out.println("Yevmu’l-Hamīs günü");
        }
        else if (gun == 6) {
            System.out.println("Yevmu’l-Cumu'a günü ");
        }
        else if (gun > 7 || gun < 0) {
            System.out.println("Lütfen geçerli bir sayı yazınız.");
        }
    }
}
