package tr.com.mcay.oop;

import tr.com.mcay.inheritance.Hayvan;

public class Kus extends Hayvan {
    public Kus(String name, String cins, int age) {
        super(name, cins, age);
        //hareketEt metodu protected tanımlı ve kalıtım yolu ile alt sınıf tarafından erişilebilir.
         hareketEt("Kuş ");
    }


}
