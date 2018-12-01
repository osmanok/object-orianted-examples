package ogrenci;

class ogrenci{
  int ogr_no;
  String adi;
  String soyadi;
  private int ders_kodu;
  private int ders_notu;

  public void setDersKodu(int ders_kodu){
    this.ders_kodu=ders_kodu;
  }
  public int getDersKodu(){
    return this.ders_kodu;
  }

  public void setDersNotu(int ders_notu){
    this.ders_notu=ders_notu;
  }
  public int getDersNotu(){
    return this.ders_notu;
  }

}