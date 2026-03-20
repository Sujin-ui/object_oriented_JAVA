package main;

public class Operator {
    public  static void main(String[] args){
        int oprNum01 = 1;
        int oprNum02 = 1;
        int oprNum03 = 1;

        oprNum01 = -oprNum02;
        oprNum02 = +oprNum03;
        System.out.printf("%d, %d\n",oprNum01,oprNum02);

        //산술연산
        oprNum01 = 10 / 3;
        oprNum02 = 10 % 3;
        System.out.printf("%d, %d\n",oprNum01,oprNum02);

        //증감연산
        -- oprNum01 ;
        ++ oprNum02 ;
        System.out.printf("%d, %d\n",oprNum01,oprNum02);

        //관계(비교)연산 (결과 -> boolean)
        var result1 = oprNum01 == oprNum02;
        var result2 = oprNum01 != oprNum02;
        var message = "oprNum01 != oprNum02 = %b".formatted(result2);

        System.out.println(message);

        //논리연산
        boolean result3 = result1 && result2;
        boolean result4 = result1 || result2;
        boolean result5 = !result1;

        //비트연산
        byte bit1 = 0b00001010;
        byte bit2 = 0b00001100;
        System.out.println(bit1 & bit2); //0b1000 8
        System.out.println(bit1 | bit2); //0b1110 14
        System.out.println(bit1 ^ bit2); //0b0110
        System.out.println(~bit1);       //11110101

        byte bit3 = 0b0001; //1
        System.out.println(bit3 << 2); //0100
        System.out.println(8 >> 2);    //1000 -> 0100 -> 0010

        //비트연산 활용
        final int READY = 0b0001; //준비완료
        final int ERROR = 0b0010; //에러발생
        final int RUN = 0b0100;   // 가동중

        int currentStatus = 0b0011; // 현재상태
        boolean isError = (currentStatus&ERROR)!= 0;
    }
}
