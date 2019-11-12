class ogrenci{
int yas;String isim;
public ogrenci(String isim){
this.yas=yas;this.isim=isim;
}
}
public class KUYRUK
{
    int bas,son,esayisi;
  ogrenci[] d;
  int N;
  public KUYRUK(int N){
      son=0;bas=-1; esayisi=0;
  this.N=N;
  d=new ogrenci[N];
  }
  public boolean bosmu(){
  return son==-1;
  }
  public boolean dolumu(){
  return son==N;
  }
  public void ekle(ogrenci yeni){
  if(dolumu()){System.out.println("kuyruk dolu");}
  else {
    son=son+1;
  d[son-1]=yeni;

  esayisi++;
  }
      System.out.println("sonuc kuyruk="+yeni.isim+"     eleman;"+ esayisi);
  }
 public  ogrenci sil(){
  if(bosmu()){System.out.println("kuyruk bos"); return null;}
  else{ogrenci silinen=d[0];
      esayisi--; 
      for(int i=1;i<=son;i++){
          d[i-1]=d[i];}
  son=son-1;
  return silinen;
  }
  }
  
    public static void main(String[] args) {
     KUYRUK k=new KUYRUK(4);
     k.ekle(new ogrenci("ayse"));
     k.ekle(new ogrenci("tuna"));
     k.ekle(new ogrenci("didem"));
     k.ekle(new ogrenci("hasan"));
    System.out.println( k.sil().isim);

    }
 
}
