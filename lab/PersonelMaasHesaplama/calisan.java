package paket1;

public class calisan{
  String personel_ad;
  String personel_soyad;
  int cocuk_sayisi;
  float maas;

  float zam_hesapla(float maas){
    if(maas<1000){
      return ((maas/100)*3)+(42*cocuk_sayisi);
    }
    if(maas>=1000 || maas<=2500){
      return ((maas/100)*4)+(42*cocuk_sayisi);
    }
    if(maas>2500){
      return ((maas/100)*5)+(42*cocuk_sayisi);
    }
    else{
      System.out.println("Maas dogru girilmedi");
      return 0;
    }
  }

  float yil_hesapla(int yil, float maas){
    float gelecek_maas=maas;
    float zamxd;
    for(int i=0; i<yil; i++){
      zamxd=zam_hesapla(gelecek_maas);
      gelecek_maas=zamxd+gelecek_maas;
    }
    return gelecek_maas;
  }

}