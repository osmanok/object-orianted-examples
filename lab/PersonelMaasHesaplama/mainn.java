package paket1;

import java.util.Scanner;

public class mainn{
  public static void main(String arg[]){
    Scanner input=new Scanner(System.in);
    calisan temp=new Calisan();

    do{
      int yil,secim;
      System.out.print("Adinizi giriniz:"); temp.personel_ad=input.next();
      System.out.print("Soyadiniz giriniz:"); temp.personel_soyad=input.next();
      System.out.print("Cocuk sayisini giriniz:"); temp.cocuk_sayisi=input.nextInt();
      System.out.print("Masinizi giriniz"); temp.maas=input.nextInt();
      System.out.print("Kac yil sonraki maasinizi hesaplamak istiyorsunuz"); temp.yil=input.nextInt();

      float zam=temp.zam_hesapla(temp.maas);
      float gelecek_maas=temp.yil_hesapla(yil, temp.maas);
      System.out.println(temp.personel_ad + temp.personel_soyad + "Eski Maas:" + temp.maas + " Yeni maas:" + (temp.maas+zam));
      System.out.println(yil + "yil sonraki maaasiniz" + gelecek_maas);

      System.out.println("Devam etmek icin 1 Cikmak icin 2'yi tuslayiniz..");
      secim=input.nextInt();

      if(secim==2){
        break;
      }
    }while(1);
  }
}