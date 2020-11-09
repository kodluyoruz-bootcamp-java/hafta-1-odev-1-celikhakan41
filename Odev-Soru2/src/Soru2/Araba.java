package Soru2;

public class Araba {
    public int model_yil;
    public String marka;
    public int km;
    public String renk;
    public int fiyat;


    public Araba(){
        this.model_yil=0;
        this.marka ="Belirtilmemiş";
        this.km=0;
        this.renk="Belirtilmemiş";
        this.fiyat=0;
        arabaBilgileriYazdir(model_yil, marka, km, renk, fiyat);
    }


    public Araba(int model_yil,String marka,int km,String renk, int fiyat){
        this.model_yil=model_yil;
        this.marka =marka;
        this.km=km;
        this.renk=renk;
        this.fiyat=fiyat;
        arabaBilgileriYazdir(model_yil, marka, km, renk, fiyat);

    }
    public void arabaBilgileriYazdir(int model_yil,String marka,int km,String renk, int fiyat){
        System.out.println(model_yil+" Model "+marka+renk+" renk "+fiyat+" TL");
    }

}
