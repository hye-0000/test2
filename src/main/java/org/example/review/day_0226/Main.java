package org.example.review.day_0226;

class Main {
    public static void main(String[] args) {
        전사 a전사1 = new 전사();

        a전사1.a왼손무기 = new 칼();
        a전사1.공격();
        // 출력 => 전사가 왼손으로 칼(을)를 사용합니다.

        전사 a전사2 = new 전사();
        a전사2.a왼손무기 = new 창();
        a전사2.a오른손무기 = new 도끼();
        a전사2.공격();
        // 출력 => 전사가 왼손으로 창(을)를 사용합니다.
        // 출력 => 전사가 오른손으로 도끼(을)를 사용합니다.
    }
}

class 전사{
    무기 a왼손무기;
    무기 a오른손무기;
    void 공격(){
        if(a왼손무기 != null){
            a왼손무기.작동("왼손");
        }
        if(a오른손무기 != null){
            a오른손무기.작동("오른손");
        }
    }
}

class 무기{

    void 작동(String 손){}
}
class 칼 extends 무기{
    void 작동(String 손){
        System.out.println("전사가" + 손 + "으로 칼(을)를 사용합니다.");
    }
}
class 창 extends 무기{
    void 작동(String 손){
        System.out.println("전사가" + 손 + "창(을)를 사용합니다.");
    }
}
class 도끼 extends 무기{
    void 작동(String 손){
        System.out.println("전사가" + 손 + "도끼(을)를 사용합니다.");
    }
}

//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        a전사.a무기1 = new 칼();
//        a전사.공격();
//        // 출력 => 전사가 칼로 공격합니다.
//
//        a전사.a무기1 = new 활();
//        a전사.공격();
//        // 출력 => 전사가 활로 공격합니다.
//
//        a전사.a무기2 = new 칼();
//        a전사.공격();
//        // 출력 => 전사가 활로 공격합니다.
//        // 출력 => 전사가 칼로 공격합니다.
//    }
//}
//
//class 전사{
//    무기 a무기1;
//    무기 a무기2;
//    void 공격(){
//        if(a무기1 != null){
//            a무기1.작동();
//        }
//        if(a무기2 != null){
//            a무기1.작동();
//        }
//    }
//}
//class 무기{
//    void 작동(){}
//}
//class 활 extends 무기{
//    void 작동(){
//        System.out.println("전사가 활로 공격합니다");
//    }
//}
//class 칼 extends 무기{
//    void 작동(){
//        System.out.println("전사가 칼로 공격합니다");
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//        a전사.공격();
//        // 출력 => 아직 무기가 없습니다.
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 => 칼로 공격합니다.
//    }
//}
//
//class 전사{
//    무기 a무기;
//    void 공격(){
//        if(a무기 == null){
//            System.out.println("아직 무기가 없습니다");
//        }
//        else{
//            a무기.작동();
//        }
//    }
//}
//class 무기{
//    void 작동(){}
//}
//class 칼 extends 무기{
//    void 작동() {
//        System.out.println("칼로 공격합니다");
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.나이 = 30;
//        a전사.이름 = "카니";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 카니가 칼로 공격합니다.
//    }
//}
//
//class 전사 {
//    // 인스턴스 변수
//    String 이름;
//    // 인스턴스 변수
//    int 나이;
//    // 인스턴스 변수
//    무기 a무기;
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//    void 공격(){
//        a무기.사용자 = 이름;
//        a무기.작동();
//    }
//}
//
//abstract class 무기{
//    String 사용자;
//    abstract void 작동();
//}
//class 활 extends 무기{
//    void 작동() {
//        System.out.println( 사용자 + "(이)가 활로 공격합니다");
//    }
//}
//class 칼 extends 무기{
//    void 작동() {
//        System.out.println( 사용자 + "(이)가 칼로 공격합니다");
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();
//    }
//}
//
//class 사람 {
//    // 클래스안에 변수를 정의 할 수 있다.
//    int 나이;
//    팔 a왼팔;
//}
//
//class 팔{}

//public class Main{
//    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.달리기_속력 = 20;
//        a사람.달리다();
//        // 사람이 20km/h로 달립니다.
//        a사람.달리다();
//        // 사람이 20km/h로 달립니다.
//
//        a사람.달리기_속력 = 50;
//        a사람.달리다();
//        // 사람이 50km/h로 달립니다.
//    }
//}
//
//class 사람{
//    int 달리기_속력;
//    void 달리다(){
//        System.out.println("사람이" + 달리기_속력 + "km/h로 달립니다");
//    }
//}

//public class Main{
//    public static void main(String[] args) {
//        //객체에서 바로 꺼내와서 사용한다 -> static
//        int i = 로봇.get정수();
//        boolean b = 로봇.get논리();
//        //사람 리모콘을 준다는 뜻
//        사람 a사람 = 로봇.get사람();
//        사람 a사람2 = 로봇.get사람2();
//        사람 a사람3 = 로봇.get사람3();
//        사람 a사람4 = 로봇.get사람4();
//        사람 a사람5 = 로봇.get사람5(123, false);
//        //리턴타입이 없음
//        로봇.get사람6(123, false);
//    }
//}
//
//class 로봇{
//    static int get정수(){
//        return 1;
//    }
//    static boolean get논리(){
//        return true;
//    }
//
//    //이 함수는 당신에게 사람 리모콘을 줄것이다
//    static 사람 get사람(){
//        //쓰레기 리모콘
//        return null;
//    }
//
//    static 사람 get사람2(){
//        //진짜 작동하는 리모콘
//        return new 사람();
//    }
//    static 사람 get사람3(){
//        사람 a사람;
//        a사람 = null;
//        return a사람;
//    }
//    static 사람 get사람4(){
//        사람 a사람 = new 사람();
//        return a사람;
//    }
//    static 사람 get사람5(int 숫자, boolean 참){
//        사람 a사람 = new 사람();
//        return a사람;
//    }
//    static void get사람6(int 숫자, boolean 참){
//    }
//}

//class 사람{}

//public class Main {
//    public static void main(String[] args) {
//        전사 a전사 = new 전사();
//        a전사.이름 = "카니";
//        a전사.나이 = 22;
//        a전사.a무기 = new 칼();
//        a전사.공격();
//
//        a전사.이름 = "초코";
//        a전사.a무기 = new 활();
//        a전사.공격();
//    }
//}
//
//class 전사{
//    String 이름;
//    int 나이;
//    무기 a무기;
//    void 공격(){
//        a무기.작동(이름);
//    }
//}
//abstract class 무기{
//    abstract void 작동(String 사용자);
//}
//class 칼 extends 무기{
//    void 작동(String 사용자){
//        System.out.println(사용자 + "(이)가 칼로 공격합니다");
//    }
//}
//class 활 extends 무기{
//    void 작동(String 사용자){
//        System.out.println(사용자 + "(이)가 활로 공격합니다");
//    }
//}