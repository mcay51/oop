package tr.com.mcay.accessmodifier;

public class Student
{
    private String name;
    private Integer grade1;
    private Integer grade2;
    private Integer quiz;
    private char gradeLetter;
    public Student(String name, Integer grade1, Integer
            grade2)
    {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }
    private void calculateGradeLetter()
    {
// gradeLetter = ...
// grade letter could be calculated here after
        //mean grade calculation
        gradeLetter = (char)(grade1 + grade2);
        System.out.println( "Grade letter is " +gradeLetter);
    }
    private float calculateGrade()
    {
        float grade = 0.4f * grade1 + 0.6f * grade2;
// float grade = 0.3f * grade1 + 0.3f * quiz + 0.4f * grade2;
// if an update is needed, it can be done in        this method
        calculateGradeLetter();
        return grade;
    }
    public float getGrade()
    {
        return calculateGrade();
    }
    public char getGradeLetter()
    {
        return gradeLetter;
    }
}
