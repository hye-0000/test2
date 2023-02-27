package org.example.lec0227;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0;

        while ( true ) {
            System.out.printf("숫자 : ");

            try {
                // saa
                input = sc.nextInt(); // 대기, 숫자 하나 입력될 때 까지
                sc.nextLine(); // 버퍼를 비운다.
                break;
            }
            catch ( InputMismatchException e ) {
                sc.nextLine(); // 버퍼를 비운다.
                System.out.println("숫자를 입력해주세요.");
            }
        }

        System.out.printf("입력된 숫자 : %d\n", input);

        sc.close();
    }
}

//Object버전
//넣을때마다 형변환을 해줘야 함
//class Main {
//    public static void main(String[] args) {
//        Object저장소 a저장소1 = new Object저장소();
//
//        a저장소1.setData(30);
//        int a = (int)a저장소1.getData();
//
//        System.out.println(a);
//
//        Object저장소 a저장소2 = new Object저장소();
//
//        a저장소2.setData(5.5);
//        double b = (double)a저장소2.getData();
//
//        System.out.println(b);
//
//
//        Object저장소 a저장소3 = new Object저장소();
//
//        a저장소3.setData(new 사과());
//        사과 c = (사과)a저장소3.getData();
//
//        System.out.println(c);
//    }
//}
//
//class Object저장소 {
//    Object data;
//
//    Object getData() {
//        return data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class 사과 { }

//원본 코드
//class Main {
//    public static void main(String[] args) {
//        Int저장소 a저장소1 = new Int저장소();
//
//        a저장소1.setData(30);
//        int a = a저장소1.getData();
//
//        System.out.println(a);
//
//        Double저장소 a저장소2 = new Double저장소();
//
//        a저장소2.setData(5.5);
//        double b = a저장소2.getData();
//
//        System.out.println(b);
//
//
//        사과저장소 a저장소3 = new 사과저장소();
//
//        a저장소3.setData(new 사과());
//        사과 c = a저장소3.getData();
//
//        System.out.println(c);
//    }
//}
//
//class Int저장소 {
//    Object data;
//
//    int getData() {
//        return (int)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class Double저장소 {
//    Object data;
//
//    double getData() {
//        return (double)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class 사과 {
//}
//
//class 사과저장소 {
//    Object data;
//
//    사과 getData() {
//        return (사과)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";
//
//        int xCount = 0;
//
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i)=='x'){
//                xCount++;
//            }
//        }
//        System.out.println("xCount : " + xCount);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        System.out.println(수학.PI);
//        System.out.println(수학.더하기(10, 20));
//    }
//}
//class 수학 {
//    static double PI = 3.141592;
//    static int 더하기(int a, int b) {
//        return a + b;
//    }
//}

// 가정 : 우리는 오라클 자바 개발팀에 취업을 했습니다. 우리는 자바 10의 새로운 기능은 `저장소` 클래스를 만들어야 합니다.
// 문제 : `저장` 메서드를 1개로 줄여보세요.

//class Main {
//    public static void main(String[] args) {
//        저장소.저장(new 사과());
//        저장소.저장(new 사람());
//        저장소.저장("안녕"); // "안녕" 은 String 클래스의 객체이다.
//        저장소.저장(new String("안녕"));
//
//        // 정수 계열
//        byte b = 0; // 1바이트
//        char c = 1; // 2바이트
//        short s = 2; // 2바이트
//        int i = 3; // 4바이트
//        long l = 4; // 8바이트
//
//        // 실수 계열
//        // 4.1f => float 형 실수를 의미
//        float f = 3.14f; // 4바이트
//        // 3.141592 => double 형 실수를 의미
//        double d = 3.141592; // 8 바이트
//
//        // 논리 계열
//        boolean bl = false; // 1/8 바이트, 1비트
//
//        // int 형 변수 i의 값 `3`을 객체화 하는 방법
//        Integer iObj = new Integer(i);
//        // iObj 리모콘에 연결된 객체에는 3이라는 값이 있습니다.
//        // 객체 안에 3이있다고 생각하시면 됩니다.
//
//        저장소.저장(new Byte(b));
//        저장소.저장(new Short(s));
//        저장소.저장(new Character(c));
//        저장소.저장(new Integer(i));
//        저장소.저장(new Long(l));
//        저장소.저장(new Float(f));
//        저장소.저장(new Double(d));
//        저장소.저장(new Boolean(bl));
//    }
//}
//
//class 저장소 {
//    static void 저장(Object v) {
//        System.out.println("Object 값 : " + v);
//    }
//}
//
//class 생물 extends Object {}
//class 동물 extends 생물 {}
//
//class 식물 extends 생물 {}
//class 사람 extends 동물 {}
//class 사과 extends 식물 {}


// 기본형 변수의 경우 자동형변환을 이용하여 `저장 메서드`의 개수를 최대한 줄여보세요.

//class Main {
//    public static void main(String[] args) {
//        저장소.저장(10);
//        저장소.저장("안녕");
//        저장소.저장(new 사람());
//        저장소.저장(new 사과());
//        저장소.저장(5.5);
//        저장소.저장(false);
//        저장소.저장('a');
//
//        // 정수 계열
//        byte b = 0; // 1바이트
//        char c = 1; // 2바이트
//        short s = 2; // 2바이트
//        int i = 3; // 4바이트
//        long l = 4; // 8바이트
//
//        // 실수 계열
//        // 4.1f => float 형 실수를 의미
//        float f = 3.14f; // 4바이트
//        // 3.141592 => double 형 실수를 의미
//        double d = 3.141592; // 8 바이트
//
//        // 논리 계열
//        boolean bl = false; // 1/8 바이트, 1비트
//
//        저장소.저장(b);
//        저장소.저장(s);
//        저장소.저장(c);
//        저장소.저장(i);
//        저장소.저장(l);
//        저장소.저장(f);
//        저장소.저장(d);
//        저장소.저장(bl);
//    }
//}
//
//class 저장소 {
//    static void 저장(double v) {
//        System.out.println("double 값 : " + v);
//    }
//
//    static void 저장(boolean v) {
//        System.out.println("boolean 값 : " + v);
//    }
//
//    static void 저장(Object v) {
//        System.out.println("String 값 : " + v);
//    }
//}
//
//class 생물{}
//
//class 사람 extends 동물 {}
//
//class 동물 extends 생물 {}
//
//class 식물 extends 생물 {}
//
//class 사과 extends 식물 {}

// 내용 : 각각의 기본형 타입은 하나의 래퍼클래스를 가지고 있습니다. 래퍼클래스를 통해서 기본형 변수에 대한 자세한 정보를 알 수 있습니다.
// 문제 : 모든 기본형 타입에 대해서 래퍼클래스를 사용하여 최대값 최소값을 출력해보세요.

//class Main {
//    public static void main(String[] args) {
//        byte b;
//        System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
//        System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
//
//        char c;
//        System.out.println("char의 최소값 : " + Character.MIN_VALUE);
//        System.out.println("char의 최대값 : " + Character.MAX_VALUE);
//
//        short s;
//        System.out.println("short의 최소값 : " + Short.MIN_VALUE);
//        System.out.println("short의 최대값 : " + Short.MAX_VALUE);
//
//        int i;
//        System.out.println("int의 최소값 : " + Integer.MIN_VALUE);
//        System.out.println("int의 최대값 : " + Integer.MAX_VALUE);
//
//        long l;
//        System.out.println("long의 최소값: " + Long.MIN_VALUE);
//        System.out.println("long의 최대값: " + Long.MAX_VALUE);
//
//
//        float f;
//        System.out.println("float의 최소값 : " + Float.MIN_VALUE);
//        System.out.println("float의 최대값 : " + Float.MAX_VALUE);
//
//        double d;
//        System.out.println("double의 최소값 : " + Double.MIN_VALUE);
//        System.out.println("double의 최대값 : " + Double.MAX_VALUE);
//
//        boolean bl; // 1 bit
//        System.out.println("boolean flase : " + Boolean.FALSE);
//        System.out.println("boolean true : " + Boolean.TRUE);
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        // 자바에서의 상수  1 => 00000000 00000000 00000000 00000001
//        // 자바에서의 상수 1L => 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
//
//        int i = 1; // int 는 4바이트 즉 돌 32개 짜리
//        long l = (long)i; // long 은 8바이트 즉 돌 64개 짜리
//        // (int) => 110볼트를 220볼트로 변압하듯이 1을 `long 화` 하여 넣는다.
//
//        l = i; // 이 코드는 안전하기 때문에 자동형변환이 발생합니다.
//        //i = l; // 이 코드는 안전하지 않기 때문에 자동형변환이 불가능 합니다.
//
//        i = (int)l; // 수동형변환 => 위험에 대한 싸인
//
//        double d = 10.5;
//        float f;
//        f = (float)d;
//        d = (double)f;
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        저장소.저장(10);
//        저장소.저장("안녕");
//        저장소.저장(new 사람());
//        저장소.저장(new 사과());
//        저장소.저장(5.5);
//        저장소.저장(false);
//        저장소.저장('a');
//
//        // 정수 계열
//        byte b = 0; // 1바이트
//        char c = 1; // 2바이트
//        short s = 2; // 2바이트
//        int i = 3; // 4바이트
//        long l = 4; // 8바이트
//
//        // 실수 계열
//        // 4.1f => float 형 실수를 의미
//        float f = 3.14f; // 4바이트
//        // 3.141592 => double 형 실수를 의미
//        double d = 3.141592; // 8 바이트
//
//        // 논리 계열
//        boolean bl = false; // 1/8 바이트, 1비트
//
//        저장소.저장(b);
//        저장소.저장(s);
//        저장소.저장(c);
//        저장소.저장(i);
//        저장소.저장(l);
//        저장소.저장(f);
//        저장소.저장(d);
//        저장소.저장(bl);
//    }
//}
//
//class 저장소{
//    static void 저장(byte v){}
//    static void 저장(short v){}
//    static void 저장(char v){}
//    static void 저장(int v){}
//    static void 저장(long v){}
//    static void 저장(float v){}
//    static void 저장(double v){}
//    static void 저장(boolean v){}
//    static void 저장(String v){}
//    static void 저장(사람 v){}
//    static void 저장(사과 v){}
//}
//
//class 사람{}
//class 사과{}

// Object 클래스와 equals
//
//class Main {
//    public static void main(String[] args) {
//        사람 a사람1 = new 사람("홍길동", 22);
//        사람 a사람2 = new 사람("홍길동", 22);
//
//        if ( a사람1.equals("ㅋㅋ") )
//        {
//            System.out.println("거짓1");
//        }
//
//        if ( a사람1.equals(a사람2) )
//        {
//            System.out.println("참1");
//        }
//    }
//}
//
//class 사람 {
//    String 이름;
//    int 나이;
//    사람(String 이름, int 나이) {
//        this.이름 = 이름;
//        this.나이 = 나이;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        //o에 연결된 객체가 사람 class로 이루어져있는지 보는 검사식
//        //!(o instanceof 사람)해도 됨
//        if ( o instanceof 사람 == false ) {
//            return false;
//        }
//
//        //여기서 사람이면 아래 코드가 실행됨
//
//        사람 other = (사람)o;
//
//        if ( !이름.equals(other.이름) ) {
//            return false;
//        }
//
//        if ( this.나이 != other.나이 ) {
//            return false;
//        }
//
//        return true;
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Person p1 = new Person(13);
//        Person p2 = new Person(13);
//
//        System.out.println(p1);
//        System.out.println(p2);
//
//        //객체는 아무리 스펙이 같아도 이렇게 하면 다르다고 나옴 -> 있는 위치가 다르기 때문
//        System.out.println(p1 == p2);
//
//        //뭐가 같은지 정의를 해줘야 함
//        System.out.println(p1.equals(p2));
//
//        String s1 = "하하";   // 4byte
//        String s2 = "하하";   // 4byte
//        //이게 true인 이유
//        // -> String의 경우 한 번 사용하고 똑같은걸 다시 사용하면 "하하"를 다시 만들지 않고 기존의 하하를 재활용함
//        System.out.println(s1 == s2);   //true
//
//        String s3 = new String("하하");   //이렇게 생성하면 재활용 모드가 꺼짐
//        String s4 = new String("하하");
//
//        System.out.println(s3 == s4);   //false
//    }
//}
//
//class Person{
//    private int age;
//
//    public Person(int age){
//        this.age = age;
//    }
//}