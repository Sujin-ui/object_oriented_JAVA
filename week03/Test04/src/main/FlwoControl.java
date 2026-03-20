package main;
// java.util 패키지의 Scanner 클래스를 사용하겠다.
import java.util.Scanner;

public class FlwoControl {
    public static void main(String[] args){
        // scanner 열기 (생성)
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); // 올바른 메서드 이름
        System.out.println(name);    // System 오타 수정

        System.out.println("score: ");
        // int score = sc.nextLine(); int 타입을 제공 저장은 str타입이라 에러
        String strScore = sc.nextLine();
        //문자열을 통해 정수를 생성하는 메소드
        //Intrger.parseInt(문자열) -> 문자열을 정수형으로 생성해주는 메소드
        int score = Integer.parseInt(strScore);

        //조건문은 순서가 중요함
        if(score >= 90){
            System.out.println("합격 :  우수");
        }else if (score >=80){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }

        int rank = Integer.parseInt(sc.nextLine());
        String medal;
        switch (rank){
            case 1 : medal = "금"; break;
            case 2 : medal = "은"; break;
            case 3 : medal = "동"; break;
            default: medal = "참가상"; //else = defarlt 비슷
            System.out.println("순위권 외");
            break;
        }
        System.out.println(medal);

        //switch-case표현식 p.104
        // 기본형: medal = switch (){};
//        medal = switch (rank){
//            case 1 -> "금메달";
//            case 2 -> "은메달";
//            case 3 -> "동메달";
//            default -> {
//                System.out.println("순위권 외");
//                yield "참가상";  반환 (yield)
//            }
//        };
        medal = switch (rank){
            case 1 -> "금메달";
            case 2 -> "은메달";
            case 3 -> "동메달";
            default -> {
                System.out.println("순위권 외");
                yield "참가상";  //반환
            }
        };
        System.out.println(medal);

        //반복문 :
        // 명확한횟수를 통해 반복. (for문 추천)
        // 불명확한횟수 통해 반복. (while문 추천)
        // c언어 문법 배열 : String students[3];
        String[] students = new String[3]; //String[] 배열명 =  new String[크기]
        for(int i = 0; i < students.length; i++){ //students.length -> length 길이를 알아냄
            students[i] = sc.nextLine(); //입력 받는 for문
        }
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i] ); //입력받은걸 확인하는 for문
        }

        //향상된 for == foreach(p.222)
        //단순히 처음 부터 끝까지 접근
        // 인덱스 제어 불가능 함
        for(var stu : students){
            System.out.println(stu);
        }

        int energy = Integer.parseInt(sc.nextLine());

        // while : 조건을 먼저 따짐
        while (energy > 0 ){
            System.out.println("에너지 : " + energy);
            energy--;
        }

        // 일단 무족건 한번은 실행할때 사용함
        // CUI 프로그램에서 많이 사용.
        do {
            System.out.println("에너지 : " + energy);
            energy--;
        } while (energy > 0);

    // scanner 닫기
        sc.close();
    }
}
