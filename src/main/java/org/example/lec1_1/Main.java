package org.example.lec1_1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += arr[i];
        }


        System.out.println(sum/arr.length);
//        int i = 1;
//        int cnt = 1;
//        while(cnt <= 10){
//            while(i <= 3){
//                System.out.println(i);
//                i++;
//            }
//            i = 1;
//            cnt++;
//        }
//        int num = -100;
//        int answer = 0;
//        while( num <= 25){
//            answer += num;
//            num++;
//        }
//        System.out.println(answer);

//        int dan = 9;
//        for(int i = 1; i <= 9; i++){
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//        System.out.println(dan + " * 1 =" + dan*1);
//        System.out.println(dan + " * 2 = " + dan*2);
//        System.out.println(dan + " * 3 = " + dan*3);
//        System.out.println(dan + " * 4 = " + dan*4);
//        System.out.println(dan + " * 5 = " + dan*5);
//        System.out.println(dan + " * 6 = " + dan*6);
//        System.out.println(dan + " * 7 = " + dan*7);
//        System.out.println(dan + " * 8 = " + dan*8);
//        System.out.println(dan + " * 9 = " + dan*9);

        // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    */
//        int age = 20; // 이 값을 바꿔가면서 실행해보세요.
//
//        System.out.println("당신의 나이는 " + age + "살 입니다.");
//
//        // 구현시작
//        if(age <= 19 || age >= 60) {
//            System.out.println("할인대상입니다.");
//        }else {
//            System.out.println("할인대상이 아닙니다");
//        }
//
//        if(age > 19 && age < 60) {
//            System.out.println("할인 대상이 아닙니다.");
//        }
//        else {
//            System.out.println("할인 대상입니다.");
//        }
//
//        if(age <= 19){
//            System.out.println("할인대상입니다.");
//        } else if (age >= 60) {
//            System.out.println("할인대상입니다.");
//        }else{
//            System.out.println("할인대상이 아닙니다.");
//        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.

//        if ( true ) {
//            System.out.println("참");
//        }
//
//        if ( false ) {
//            System.out.println("거짓");
//        }
//
//        int a = 10;
//
//        // `==` => 같다.
//        if ( a == 10 ) {
//            System.out.println("참");
//        }
//
//        // `!=` => 같지 않다.
//        if ( a != 10 ) {
//            System.out.println("거짓");
//        }
//
//        if ( a > 10 ) {
//            System.out.println("거짓");
//        }
//
//        if ( a >= 10 ) {
//            System.out.println("참");
//        }
//
//        int b = 10;
//
//        if ( a == b ) {
//            System.out.println("참");
//        }
//
//        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
//        boolean c = a != b;
//
//        if ( c ) {
//            System.out.println("거짓");
//        }
//
//        if ( c == false ) {
//            System.out.println("참");
//        }
//
//        // `!` => 반전
//        if ( !c ) {
//            System.out.println("참");
//        }
//
//        // `!` => 반전
//        if ( !(!c) ) {
//            System.out.println("거짓");
//        }
//
//        boolean d = true;
//
//        if ( c != d ) {
//            System.out.println("참");
//        }
//
//        if ( 20 > 2 && 10 > 3 && true != false && 10 != 10 ) {
//            System.out.println("거짓");
//        }
//
//        if ( 10 != 10 || 10 < 2 ) {
//            System.out.println("거짓");
//        }

    }
}