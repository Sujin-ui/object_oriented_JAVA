package main;

public class Variable {
    public static void main(String[] args){
        int binVal = 0b1111;
        int octVal = 017;
        int decVal = 15;
        int hexVal = 0xf;
        System.out.printf("%d %d %d %d\n", binVal, octVal, decVal, hexVal);

        char grade_1 = 49; // 2bit
        short grade_2 = 49; // 2bit

        System.out.println(grade_1); //'1' 문자열
        System.out.println(grade_2); // 49 정수형
        // 자료형+크기+해석방식에 따라 출력이 다름

        boolean isPass = true;
        if(isPass == false) {
            System.out.println("꺼져");
        }else{
            System.out.println("어서오세요");
        } //if문은 c언어랑 비슷함

        //p.57
        //단 지역변수에만 가능함!!
        var age =21;
        var height = 165.5f;
        System.out.println(age);
        System.out.println(height);

        //p59
        //final은 변수를 상수처럼 동작하게 만듬
        final int Max_Num = 100;
        final int Min_Num;
        // Max_Num = 10;
        // Min_Num = 0;  (가능하지만 테스트용)
        // System.out.println(Min_Num);

        //63p
        int a = 32;
        // int b = 1000000000000000;
        long b = 100_000_000_000_000_000L; //L를 붙임으로써 long타입 변환
        //float c =32.6;
        float c =32.6f; //F를 붙임으로써 float
        double d =32.6;

        b = a ; a = (int)b; // a(4bit)  b(8bit)
        c = a ; b = (int)c;

        //65p
        double e = (float)a + c ;
        //double e = a(int) + c(float) 둘중에 하나를 맞춤
        // double e = (double)(a(int) + c(float))

        //b = a+c
        b = (long)(a+c);
        b = a+(int)c;



    }
}
