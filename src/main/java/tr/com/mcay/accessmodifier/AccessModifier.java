package tr.com.mcay.accessmodifier;

public class AccessModifier {
    public int publicVariable=100;
    protected int protectedVariable;
    int defaultVariable;
    private int privateVariable;

    public static void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

     void defaultMethod() {

        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    public void privateMethodErisimi(){
        System.out.println("Private metoda Sadece Aynı Sınıftan erişim sağlanabilir privateMethodErisimi");
        privateMethod();
    }

    public int getPublicVariable() {
        return publicVariable;
    }

    public void setPrivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }
}
