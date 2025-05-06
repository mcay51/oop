package tr.com.mcay.inheritance;

public class Kopek extends Hayvan {
    public Kopek(String name, String cins, int age) {
        super(name, cins, age);
    }
    @Override
    public void hayvanSesi(String ses){
       super.hayvanSesi("Köpek Sesi :"+ses);
    }
}
