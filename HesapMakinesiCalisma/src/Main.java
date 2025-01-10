import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Fonksiyonla fnks = new Fonksiyonla();

        char secimİslem = 0;
        double sayi1 = 0;
        double sayi2 = 0;
        double aci = 0;

        //Calşıma1 --> HesapMakinesi

        fnks.mesajYazdir("-------------------------------------------------------");

        fnks.mesajYazdir("Lütfen yapmak istediğiniz işlemi seçin:");
        fnks.mesajYazdir("Yapmak istediğiniz işlemi giriniz (+,-,*,/, cos->c, tan->t, sin->s, üs alma->u)");


        System.out.println(fnks.islemler(scn, sayi1, sayi2, aci));


    }
}