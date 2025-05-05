package tr.com.mcay.accessmodifierfarklıpaket;

import tr.com.mcay.accessmodifier.AccessModifier;

public class AccessModifierErisim {
    public void accessModifierErisim() {
        AccessModifier modifier = new AccessModifier();
        modifier.privateMethodErisimi(); // erişebiliyorum çünkü public
        modifier.publicMethod(); // erişebiliyorum çünkü public
        // modifier.protectedMethod(); // erişemiyorum çünkü aynı  aynı paket içinden ve kalıtım yoluyla alt sınıftan erişim sağlanabilir
       // modifier.defaultMethod(); // erişemiyorum çünkü sadece aynı paket içinden erişim sağlanabilir


    }
}
