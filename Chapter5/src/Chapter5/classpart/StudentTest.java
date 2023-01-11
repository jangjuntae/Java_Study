package Chapter5.classpart;

public class StudentTest {
    public static void main(String[] args){
        Student studentJang = new Student();
        studentJang.studentName = "장준태";

        System.out.println(studentJang.studentName);
        System.out.println(studentJang.getStudentName());
    }
}
