// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Koşullar :

            Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
            Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
            Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
            Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Etkinlik Önerisi İçin \nHava Sıcaklığını Giriniz : ");
        double derece = input.nextInt();

        if (derece <5){
            System.out.println("Kayak Yapınız..");
        }else if (derece>=5 && derece <15) {
            System.out.println("Sinemaya Gidiniz..");
        }else if (derece>=15 && derece<25){
            System.out.println("Piknik Yapabilirsiniz..");
        }else if (derece>=25){
            System.out.println("Yüzmeye Gidebilirsiniz..");
        }else {
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }
    }
}