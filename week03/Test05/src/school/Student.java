package school;
import school.resource.Food; // 권장
//import school.resource.*; resource패키지 모두 사용
public class Student {
    String id;              //~
    public  String name;    //+
    public  int grade;      //+
    public  String address; //+

    public void showInfo()
    //반환하는 타입이있어야함
    //java는 메소드 시작할때 소문자
    {
        Food food;
        System.out.println("나의 학번 :"+id);
    }
}
