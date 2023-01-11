package Chapter5.classpart;

public class Student {
    // 멤버 변수
    int studentID; // 학번
    String studentName; // 학생 이름
    int grade; // 학년
    String address; // 주소

    public String getStudentName(){
        return studentName;
    }

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static void main(String[] args){
        Student studentJang = new Student();
        studentJang.studentName = "장준태";

        System.out.println(studentJang.studentName);
        System.out.println(studentJang.getStudentName());
    }
}