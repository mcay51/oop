package tr.com.mcay.oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student();
        Student student2 = new Student("Zeynep","ÇAY",8,new ArrayList<>());
        Student student3 = new Student("Küçük Mehmet Ali");

        System.out.println(student2.toString());
        System.out.println(student3.toString());
        String[][] dizi=new String[4][3];
        dizi[0][0]="Zeynep";
        dizi[0][1]="ÇAY";
        dizi[0][2]="8";
        dizi[1][0]="Mehmet Ali";
        dizi[1][1]="Bilgin";
        dizi[1][2]="22";
        dizi[2][0]="Burhan";
        dizi[2][1]="Ertan";
        dizi[2][2]="18";
        dizi[3][0]="Mustafa";
        dizi[3][1]="ÇAY";
        dizi[3][2]="45";

        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi[i].length;j++){
                System.out.print(dizi[i][j]+"\t");
            }

        }
        System.out.println("\n");
        List list = new ArrayList();
        list.add(student);
        list.add(student2);
        list.add(dizi);
        list.add("Işıl ÇAY");
        list.add(25800);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        List<Integer> notList=new ArrayList();
        notList.add(80);
        notList.add(45);
        notList.add(70);
       Integer ogrenciNotu = student.notHesapla(notList);
        System.out.println( "Öğrenci Notu: "+ogrenciNotu);
        student.notHesapla2(notList);

        System.out.println("Integer Donenstudent.notHesapla(notList));
    }


}