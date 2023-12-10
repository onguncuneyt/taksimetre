import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int gidilenKm;
        double perKm = 2.20 , toplam=10;

        System.out.print("Gidin mesafeyi KM cinsinden giriniz : ");
        gidilenKm = inp.nextInt();

        toplam += gidilenKm*perKm;

        if(toplam >= 0 && toplam <=20){
            toplam = 20;
            System.out.println("Toplam Ücret : " + toplam);
        }else if (toplam>20){
            System.out.println("Toplam Ücret : " + toplam);
        }else{
            System.out.println("Km değeri geçersiz ");
        }


    }
}