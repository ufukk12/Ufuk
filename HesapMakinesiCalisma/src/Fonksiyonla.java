import java.util.Scanner;

public class Fonksiyonla {



        char Secim;
        Scanner input = new Scanner(System.in);

        public void mesajYazdir(String yazdir){
            System.out.println(yazdir);
        }

        public char seçimAl(Scanner input, char Secim){
            Secim = input.next().charAt(0);
            return Secim;
        }

        public double sayi1Al(Scanner input, double sayi1){
            sayi1 = input.nextDouble();
            return sayi1;

        }

        public double sayi2Al(Scanner input, double sayi2){
            sayi2 = input.nextDouble();
            return sayi2;

        }

        public double aciAl(Scanner input, double aciDeğeri){
            aciDeğeri = input.nextDouble();
            return aciDeğeri;


        }

        public double islemler(Scanner input, double sayi1, double sayi2, double aciDegeri){
            switch (seçimAl(input , Secim)){
                case '+':
                    mesajYazdir("lütfen toplanacak 2 tane sayıyı sırayla girin");
                    sayi1 =sayi1Al(input, sayi1);
                    sayi2 = sayi2Al(input, sayi2);
                    return sayi1+sayi2;
                case '-':
                    mesajYazdir("lütfen çıkarılacak 2 sayıyı sırayla girin");
                    sayi1 =sayi1Al(input, sayi1);
                    sayi2 = sayi2Al(input, sayi2);
                    return sayi1 - sayi2;
                case '*':
                    mesajYazdir("lütfen çarpılacak 2 sayıyı sırayla girin");
                    sayi1 =sayi1Al(input, sayi1);
                    sayi2 = sayi2Al(input, sayi2);
                    return sayi1 * sayi2;
                case '/':
                    mesajYazdir("lütfen bölünecek 2 sayıyı sırayla girin");
                    sayi1 =sayi1Al(input, sayi1);
                    sayi2 = sayi2Al(input, sayi2);
                    if (sayi2 == 0){
                        mesajYazdir("2. Sayı 0 dan farklı olmalıdır lütfen tekrar işlem ve sayı girişi yapın");

                        return islemler(input, sayi1, sayi2, aciDegeri);
                    }else {
                        return sayi1 / sayi2;
                    }
                case '!':
                    mesajYazdir("Lütfen faktöryelini almak istediğiniz sayıyı giriniz");
                    sayi1 = sayi1Al(input , sayi1);
                    double faktoryel = 1;
                    for(int i = 1; i<=sayi1; i++){

                        faktoryel *= i;

                    }
                    return faktoryel;
                default:
                    mesajYazdir("Yanlış Seçim!! Lütfen tekrar seçim yapın");
                    return seçimAl(input , Secim);

            }


        }


    }




