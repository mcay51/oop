package tr.com.mcay.inheritance;

public class Main {
    public static void main(String[] args) {
        Hayvan kedi =new Kedi("pembiş","Tekir",1);
        Hayvan kopek=new Kopek("sarı","Golden",2);
        Kedi kedi2 = new Kedi("maviş","british",0);
        kedi.hayvanSesi("Miyav Miyav");
        kedi2.kediSesi("Miyav");
        kedi2.hayvanSesi("Miyav Miyav");
        kopek.hayvanSesi("Hav Hav");
        kedi.hareketEt("Kedi ");
    }
}
