package tr.com.mcay.deepandshallowcopy;

import tr.com.mcay.accessmodifier.AccessModifier;


public class Main2 {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        Student std1 = new Student("Murat", "Kaya", 70);
        Student std2 = new Student();
        Student std3 = new Student("Mehmet Ali","Bilgin",23);
        String tempName = std1.getName();
        std2.setName(tempName);
        String tempSurname = std1.getSurname();
        std2.setSurname(tempSurname);
//        int tempMidTerm = std1.getMidtermGrade();
//        std2.setMidtermGrade(tempMidTerm);
//        int tempFinal = std1.getFinalGrade();
//        std2.setFinalGrade(tempFinal);
        System.out.println(std1.getName());
        System.out.println(std2.getName()); // deep copy
        std2.setName("Selim");
        String namestd2=std2.getName();
        std3.setName(namestd2);
        System.out.println(std1.getName());
        System.out.println(std2.getName()); // changing in std2 won’t        affect std1. deep copy
        System.out.println(std3.getName());
    }
}


