package Soru1;

import javax.naming.NameNotFoundException;

public class Soru1 {
    static float sayac=0.0f;
    static float toplam=0.0f;
    public static void main(String[] args) {
        elliUc();
        ucBesYedi();
        ucBesYediElliUc();


    }
    static void ucBesYediElliUc(){
        sayac=0.0f;
        toplam=0.0f;
        for (int i = 1; i <= 2000; i++) {
            if ((i % 3 == 0 && i % 5 == 0) && (i % 7 == 0 && i % 53 == 0)) {
                toplam+=i;
                sayac++;

            }

        }
        float x=(toplam/sayac);
        if (Double.isNaN(x)){
            System.out.println("0 ile 2000 arasında 3,5,7,53’e bölünebilen sayı YOK");
        }
        else{
            System.out.println("0 ile 2000 arasında 3,5,7,53’e bölünebilen sayıların ağırlıklı ortalaması : "+(toplam/sayac));
        }


    }

    static void ucBesYedi(){
        sayac=0.0f;
        toplam=0.0f;
        for (int i = 1; i <= 2000; i++){
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                toplam+=i;
                sayac+=1;
            }

        }
        System.out.println("0 ile 2000 arasında 3,5,7 e bölünebilen sayıların ağırlıklı ortalaması: "+(toplam/sayac));
    }

    static void elliUc(){
        sayac=0.0f;
        toplam=0.0f;
        for (int i = 1; i <= 2000; i++){
            if (i % 53 == 0){
                toplam+=i;
                sayac+=1;
            }
        }
        System.out.println("0 ile 2000 arasında 53 e bölünebilen sayıların ağırlıklı ortalaması: "+(toplam/sayac));


    }
}
