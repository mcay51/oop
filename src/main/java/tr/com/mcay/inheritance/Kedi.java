package tr.com.mcay.inheritance;

public class Kedi extends Hayvan{
    public String yemek;
    public Kedi(String name, String cins, int age) {
        super(name, cins, age);
        this.yemek="Kedi Maması";
        System.out.println("Kedi Sınıfı Constuructor");
    }

    public void kediSesi(String ses){
        super.hayvanSesi("Üst Sınıf Kedi Sesi Metodu: "+ses);
        this.hayvanSesi("Alt Sınıf: "+ses);

    }

    @Override
    public void hayvanSesi(String ses){
        System.out.println(super.getAge()+" "+super.getName()+" "+super.getCins());
        System.out.println("Kedi Yemeği "+super.getYemek());
        System.out.println("Kedi Sesi Çıkart : "+ses);
    }

    public String getYemek() {
        return yemek;
    }

    public void setYemek(String yemek) {
        this.yemek = yemek;
    }
}
