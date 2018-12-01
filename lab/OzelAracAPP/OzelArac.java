package paket1;

public class OzelArac{
  private boolean camlarAcilabilir;
  private boolean kapilarAcilabilir;
  private boolean motorKontrol;

  OzelArac(boolean motorKontrol){
    private boolean motorDegerleriniKontrolEt(boolean motorKontrol){
      if(motorKontrol){
        System.out.println("motor degerleri kontrol edildi");
        return true;
      }
      else{
        System.out.println("Arabanin motor degerleri kontrolu yapilmadi");
        return false;
      }
    }
  }

  protected boolean arabayiCalistir(){
    if(this.motorKontrol){
      System.out.println("Arabayi calistirmak icin gerekli tetikleme yapildi");
      System.out.println("Araba basarali sekilde calistirildi");
      return true;
    }
    else{
      System.out.println("Motor degerleri kontrol edilmedigi icin arac calistirilmadi");
      return false;
    }
  }

  protected void setcamlarAcilabilir(boolean camlarAcilabilir){
    if(motorKontrol){
      this.camlarAcilabilir=camlarAcilabilir;
    }
    else{
      System.out.println("Motor calistirilmadi");
    }
  }
  protected void setkapilarAcilabilir(boolean kapilarAcilabilir){
    if(motorKontrol){
      this.kapilarAcilabilir=kapilarAcilabilir;
    }
    else{
      System.out.println("Motor calistirilmadi");
    }
  }

  public boolean getcamlarAcilabilir(){
    return this.camlarAcilabilir;
  }
  public boolean getkapilarAcilabilir(){
    return this.kapilarAcilabilir;
  }
}