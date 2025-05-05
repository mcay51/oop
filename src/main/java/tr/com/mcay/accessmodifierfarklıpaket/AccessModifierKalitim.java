package tr.com.mcay.accessmodifierfarklıpaket;

import tr.com.mcay.accessmodifier.AccessModifier;

public class AccessModifierKalitim extends AccessModifier {
    public void accessModifier() {

        publicMethod(); //erişebilirim çünkü public
        protectedMethod(); // erişebilirim çünkü kalıtım aldığım için ve protected olduğu için
        privateMethodErisimi(); // erişebilirim çünkü public
       // privateMethod(); // erişemem çünkü private buna üstteki privateMethodErisimi() methodu privateMethod() methodunu çağırıyor bu şekilde dolaylı çalıştırdık
       //  defaultMethod(); // erişim sağlayamıyoruz çünkü sadece aynı paket içinden erişim sağlanabilir

    }
}
