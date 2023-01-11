package Chapter5.reference;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid(){
        if (month == 2){
            if(day < 1 || day > 30){
                System.out.println("유효하지 않은 날짜입니다.");
                //return false;
            }
            else {
                System.out.println("유효한 날짜입니다.");
                //return true;
            }
        }
        else if(month == 1 || (2 < month && month< 13)){
            if(day < 1 || day > 30){
                System.out.println("유효하지 않은 날짜입니다.");
                //return false;
            }
            else {
                System.out.println("유효한 날짜입니다.");
                //return true;
            }
        }
        return true;
    }
}