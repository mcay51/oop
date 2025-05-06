package tr.com.mcay.accessmodifier;

public class Main extends AccessModifier{
    public static void main(String[] args) {
        publicMethod(); // başlangıçta static değilken bu şekilde yapılan çağrıda hata verir. çünkü static bir metod içinden static olmayan metod ve attribute çağrıeıs yapılamaz
        AccessModifier accessModifier = new AccessModifier();
        publicMethod();
        accessModifier.publicMethod();
        accessModifier.protectedMethod();
        accessModifier.defaultMethod();
       // accessModifier.privateMethod(); Burası hata verir sadece aynı sınıf içerisinden erişim sağlanabilir.
        accessModifier.privateMethodErisimi();
System.out.println("Access Modifier hem Soyutlama (Abstraction) hemde Encapsulation sağlar");
        Student student=new Student("Mehmet Ali Bilgin",90,95);
        float grade=student.getGrade();
        System.out.println( "Öğrencinin notu: "+grade);




    }
}
