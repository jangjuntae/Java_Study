package staticex;

public class StudentTest6 {
    public static void main(String[] args) {
        Student3 studentLee = new Student3();
        studentLee.setStudentName("이준희");
        System.out.println(studentLee.studentName + "의 학번은 : " +studentLee.studentID);

        Student3 studentSon = new Student3();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.studentName + "의 학번은 : " + studentSon.studentID);
    }
}
