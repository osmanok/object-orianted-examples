package ogrenci;

import java.util.Scanner;

public class ogrencimain{
  public static void main(String arg[]){
    Scanner input=new Scanner(System.in);
    ogrenci ogrenci1=new ogrenci();

    System.out.println("ogrencinin numarsi"); ogrenci1.ogr_no=input.nextInt();
    System.out.println("ogrencinin adi"); ogrenci1.adi=input.next();
    System.out.println("ogrencinin soyadi"); ogrenci1.soyadi=input.next();

    System.out.println("ders kodu:"); ogrenci1.setDersKodu(input.nextInt());
    System.out.println("ders notu:"); ogrenci1.setDersNotu(input.nextInt());

    System.out.println("ogrenci1 ders kodu:"+ogrenci1.getDersKodu());
    System.out.println("ogrenci1 ders notu:"+ogrenci1.getDersNotu());

  }
}