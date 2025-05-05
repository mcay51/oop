package tr.com.mcay.oop;

import java.util.List;

public class Student {
    public String name; // class attribute  veya  instance attribute veya field
    private String surname;
    // double ,float,byte,short,long,char,boolean,int --> primative tipler
    private int age;
    private List<Integer> notlar;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", notlar=" + notlar +
                '}';
    }
// private Integer age;

    public Student(String name, String surname, int age, List<Integer> notlar) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.notlar = notlar;
    }
    public Student(String name){
        this.name = name;
    }
    public Student() {
        this.name="Mehmet Ali";
        this.surname="Bilgin";
        this.age=22;
    }
    public Integer notHesapla(List<Integer> notlar) {
        Integer not=0;
        for(Integer i : notlar){
            not = not+i;
        }
        not=not/notlar.size();
        System.out.println("Ortalama : "+not);
        return not;
    }
    public void notHesapla2(List<Integer> notlar) {
        Integer not=0;
        for(Integer i : notlar){
            not = not+i;
        }
        not=not/notlar.size();
        System.out.println("Ortalama : "+not);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

/*    public Integer getInteger() {
        return age;
    }

    public void setInteger(Integer age) {
        this.age = age;
    }*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
