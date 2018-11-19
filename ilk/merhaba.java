package ilk;

public class  merhaba{
  public static void main(String arg[]){
    System.out.println("merhaba dunya");

    calisan ali = new calisan();
    ali.boy=180;
    ali.kilo=80;
    ali.yas=22;
    ali.maas=2000;

    System.out.println("alinin yasi " + ali.yas + "alinin kilosu " + ali.kilo + "alinin boyu" + ali.boy);

    ali.yemek();

    System.out.println(ali.kilo);

    ali.zam(10);

    System.out.println(ali.maas);
  }
} 