package tr.com.mcay.inheritance;

public class Hayvan {
    private String name;
    private String cins;
    private int age;
    private String yemek;
    public Hayvan(String name, String cins, int age) {
        System.out.println("Hayvan Sınıfı Constuructor");
        this.name = name;
        this.cins = cins;
        this.age = age;
    }
    public void hayvanSesi(String ses){
            System.out.println("Hayvan Sesini Yazdır : "+ ses);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYemek() {
        return yemek;
    }

    public void setYemek(String yemek) {
        this.yemek = yemek;
    }
}
