package staticex;

public class Student3 {
    private static int serialNum;
    public String studentName;
    public int studentID;

    public Student3(){
        serialNum += 100;
        studentID = serialNum;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}