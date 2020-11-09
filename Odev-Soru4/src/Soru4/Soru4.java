package Soru4;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        boolean kontrol=true;
        do {
            Scanner sayiAl=new Scanner(System.in);
            System.out.print("Ondalıklı Bir Sayı Giriniz  : ");
            try {
                float sayi=sayiAl.nextFloat();
                System.out.print("Sayı aşağı yuvarlamak isterseniz 'a' tuşuna yukarı yuvarlamak için 'y' tuşuna basınız...");
                Scanner harfAl=new Scanner(System.in);

                String harf=harfAl.next();



                switch (harf){
                    case "a":
                        System.out.println(Math.floor(sayi));
                        kontrol=false;
                        break;
                    case "y":
                        System.out.println(Math.ceil(sayi));
                        kontrol=false;
                        break;
                    default:
                        System.out.println("'a' veya 'y' tuşuna basınız...");
                }
            }
            catch (Exception e){
                System.out.println("Sayıyı virgüllü giriniz. Örneğin : 12,5");
            }

        }
        while (kontrol);

    }


}
