import java.util.Scanner;

public class tambolme{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("bir sayi giriniz");
    int sayi=input.nextInt();

    for(int i=1; i<=sayi; i++){
      if(i%3==0){
        System.out.print(i+",");
      }
    }

    System.out.print("\n");
  }
}