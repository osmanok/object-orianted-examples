package paket1;

class insan{
  int boy;
  int kilo;
  int yas;
  public insan(){//constructor budur
    System.out.println("Bir insan objesi olusturuldu");
  }
  public insan(int yas, int kilo, int boy){//polymorphism
    this.yas=yas;
    this.kilo=kilo;
    this.boy=boy;
  }
}

public class bir{
  public static void main(String[] args){ 
    insan ali=new insan(23,80,190);

    System.out.println("yasi"+ali.yas+"kilosu"+ali.kilo+"boyu"+ali.boy);
  }
}