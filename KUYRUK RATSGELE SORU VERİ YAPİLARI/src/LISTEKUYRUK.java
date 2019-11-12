class banka{
String isim;int maas;
banka ileri;
public banka(String isim,int maas){
this.isim=isim;
this.maas=maas;
ileri=null;
}
}
public class LISTEKUYRUK {
    banka bas,son; int sayi;
  public LISTEKUYRUK (){
  bas=null;      son=null;  sayi=0;
  }
  public boolean bosmu(){
  return bas==null;
  }
  void ekle(banka yeni){
  if(bosmu()){
  bas=yeni;
  son=yeni;
  }
  else {
  son.ileri=yeni;
  son=yeni;
  sayi++;
  }
      System.out.print(yeni.isim+"  "+yeni.maas+"    ");
  }
 public banka sil(){
 banka sonuc=bas;
 if(bas!=null){sayi--;}
 bas=bas.ileri;
 if(bas==null){
 son=null;
 }
 return sonuc;
 }
 
    public static void main(String[] args) {
       LISTEKUYRUK b=new LISTEKUYRUK();
       b.ekle(new banka("doc ahmet",3451));
              b.ekle(new banka("doc memet",3452));
       b.ekle(new banka("doc hasan",3453));
       b.ekle(new banka("doc tuna",3454));
        System.out.println();
        b.sil() ;b.sil();  // b.sil();
        System.out.println(b.sil().isim+ "      " +b.sil().maas);

    }
 }
