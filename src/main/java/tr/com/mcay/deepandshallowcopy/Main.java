package tr.com.mcay.deepandshallowcopy;

public class Main {
    public static void main(String[] args) {

        Student student2;
        Student student1=new Student("Mustafa","Cay",45);
        //sınıflarda bu şekilde eşitleme yapıldığında shallow copy yapılmış olur
        student2=student1;
        System.out.println("Student 1: "+student1.toString());
        System.out.println("Student 2: "+student2.toString());
        student1.setName("Mehmet Ali");
        student1.setSurname("Bilgin");
        student1.setAge(23);
        System.out.println("Student 1: "+student1.toString());
        System.out.println("Student 2: "+student2.toString());


// Sınıflarda Clonable implementasyonu ile deepcopy olayı gerçekleştirilebilir
        Student student3 = student1.clone();
        System.out.println("Student 3: "+student3.toString());

        System.out.println("Student 1: "+student1.toString());
        System.out.println("Student 2: "+student2.toString());
        System.out.println("Student 3: "+student3.toString());
System.out.println("Student 1 Hash Code "+student1.hashCode());
System.out.println("Student 2 Hash Code "+student2.hashCode());
System.out.println("Student 3 Hash Code "+student3.hashCode());
// Wrapper tiplerde (Integer,String, Double, Boolean,Float,Character,Long,Byte birbirine eşitleme işlemi gerçekleştiğinde deepcopy olayı gerçekleşmiş oluyor
        Integer a = 5;
        Integer b = 7;
        a = b;

        b++;
        System.out.println(a); // 7
        System.out.println(b); // 8

// a isn’t affected by b
        String s1 = "";
        String s2 = "str2";
        s1 = s2;
        System.out.println("s hashCode: "+s1.hashCode());
        System.out.println("s2 hashCode: "+s2.hashCode());
        s2 += "_";
        System.out.println(s1); // str2
        System.out.println(s2); // str2_
// s1 isn’t affected by s2

    }
}
