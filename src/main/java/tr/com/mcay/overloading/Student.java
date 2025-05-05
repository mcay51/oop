package tr.com.mcay.overloading;

public class Student {
    private String name;
    private int age;

    // Student Constructor overload edilmiştir. Çünkü ismi aynı parametre listesi farklı şekilde tanımlamalar yapılmıştır.
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student() {

    }
    public Student(String name){
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }

    public void setGrades(int midtermGrade, int finalGrade)
    {
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }
    public float calculateMeanGrade()
    {
        return midtermGrade * 0.4f + finalGrade * 0.6f;
// default mean grade calculation method
    }
    public float calculateMeanGrade(float finalRatio)
    {
        return midtermGrade * (1 - finalRatio) + finalGrade * finalRatio;
// mean grade calculation method with modification to final ratio
// overloading
    }
}
}
