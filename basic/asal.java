import java.util.Scanner;

public class asal{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    boolean asalmi=true;
    
    System.out.println("kacinci asal sayi");
    int sayi=input.nextInt();

    int denenensayi=2, sayac=0, sonasal=0;

    while(sayac<sayi){
      if(denenensayi==2){
        asalmi=true;
      }
      else{
        for(int i=2; i<denenensayi; i++){
          if(denenensayi%i==0){
            asalmi=false;
            break;
          }
          asalmi=true;
        }
      }
      if(asalmi){
        sonasal=denenensayi;
        sayac++;
      }
      denenensayi++;
    }
    System.out.println(sayi+".asal sayi="+sonasal);
  }
}