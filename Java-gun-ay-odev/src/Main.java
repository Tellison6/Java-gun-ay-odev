import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenmek istediğiniz ayı (1-12) arasında giriniz: ");
        int ay = scanner.nextInt();

        if (ay == 1 ){
            System.out.println("Muharrem ayı");
        }
        else if (ay == 2) {
            System.out.println("Safer ayı");
        }else if (ay == 3) {
            System.out.println("Rebiülevvel ayı");
        }
        else if (ay == 4) {
            System.out.println("Rebiülahir ayı");
        }
        else if (ay == 5) {
            System.out.println("Cemaziyelevvel ayı");
        }
        else if (ay == 6) {
            System.out.println("Cemaziyelahir ayı");
        }
        else if (ay == 7) {
            System.out.println("Recep ayı");
        }
        else if (ay == 8) {
            System.out.println("Şaban ayı");
        }
        else if (ay == 9) {
            System.out.println("Ramazan ayı");
        }
        else if (ay == 10) {
            System.out.println("Şevval ayı");
        }
        else if (ay == 11) {
            System.out.println("Zilkade ayı");
        }
        else if (ay == 12) {
            System.out.println("Zilhicce ayı");
        }
        else if (ay > 12 || ay < 0){
            System.out.println("Lütfen geçerli bir sayı yazınız.");
        }


    }
}