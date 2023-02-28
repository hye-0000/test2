package org.example.lec0228;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<NumData> noDatum = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int no = sc.nextInt();

            noDatum.add(new NumData(0, no));
        }

        sc.close();

        List<NumData> sortedNoDatum = noDatum
                .stream()
                .sorted(Comparator.comparingInt(NumData::getNo))
                .collect(Collectors.toList());

        for (int i = 0; i < sortedNoDatum.size(); i++) {
            sortedNoDatum.get(i).setId(i);
        }

        String output = noDatum
                .stream()
                .map(e -> e.getId() + "")
                .collect(Collectors.joining(" "));

        System.out.println(output);
    }
}

class NumData {
    private int id;
    private int no;

    public NumData(int id, int no) {
        this.id = id;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "NoData{" +
                "id=" + id +
                ", no=" + no +
                '}';
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        List<Info> list = new ArrayList<>();
//        for(int i = 0; i < cnt; i++){
//            int id = i;
//            int data = sc.nextInt();
//            list.add(new Info(id, data));
//        }
//        sc.close();
//
//        list = list
//                .stream()
//                .sorted((e2, e1) -> e2.getNum() - e1.getNum())
//                .collect(Collectors.toList());
//
//        for(Info lists : list){
//            System.out.print(lists.getIdx());
//        }
////        List<Device> devices = new ArrayList<>(){};
////
////        for(int i = 0; i < cnt; i++){
////            int id = sc.nextInt();
////            int gas = sc.nextInt();
////            devices.add(new Device(id, gas));
////        }
////
////        sc.close();;
////
////        devices = devices
////                .stream()
////                .sorted((e2, e1) -> e2.getId() - e1.getId())
////                .collect(Collectors.toList());
////
////        for(Device device: devices){
////            System.out.printf("%d %d\n", device.getId(), device.getGas());
////        }
////        System.out.println(devices);
//
////        HashMap<String, Object> p1 = new HashMap<>();
////        p1.put("이름", "홍길동");
////        p1.put("나이", 25);
////        p1.put("키", 170.5);
//
////        HashMap<String, Object> p1 = new HashMap<>(){{
////            put("이름", "홍길동");
////            put("나이", 25);
////            put("키", 170.5);
////        }};
//
////        HashMap<String, Object> p2 = new HashMap<>();
////        p2.put("이름", "홍길동");
////        p2.put("나이", 25);
////        p2.put("키", 170.5);
//
////        Scanner sc = new Scanner(System.in);
////        int[] arr = new int[20];
////        int index  = 0;
////
////        while(true){
////            System.out.print("숫자를 입력해주세요(-1 입력시 종료) : ");
////            int a = sc.nextInt(); // 숫자 입력 받기
////            //arr[i] = a;
////            arr[index] = a;
////            index++;
////            if (a == -1) {
////                System.out.println("입력을 종료합니다");
////                break;
////            }
////        }
////
////        //Arrays.sort(arr);
////        for(int i: arr){
////            System.out.print(i);
////        }
////        List<Integer> arr = new ArrayList<>();
////        Scanner sc = new Scanner(System.in);
////        while (true){
////            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
////            int num = sc.nextInt();
////            if (num == -1) {
////                System.out.println("입력을 종료합니다.");
////                break;
////            }
////            arr.add(num);
////        }
////        Collections.sort(arr);
////        System.out.println(arr.toString());
//
////        Scanner sc = new Scanner(System.in);
////
////        List<Integer> numbers = new ArrayList<>();
////
////        while (true) {
////            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
////            int num = sc.nextInt();
////
////            if (num == -1) {
////                System.out.println("입력을 종료합니다.");
////                break;
////            }
////
////            numbers.add(num);
////        }
////
////        String str = numbers
////                .stream()
////                .sorted()
////                .map(e -> "" + e)
////                .collect(Collectors.joining(", "));
////
////        System.out.printf("입력한 숫자(오름차순) : %s\n", str);
////        System.out.println("프로그램을 종료합니다.");
////
////        sc.close();
//    }
//}
//
//class Info{
//    private int idx;
//    private int num;
//
//    Info(int idx, int num) {
//        this.idx = idx;
//        this.num = num;
//    }
//
//    public int getIdx() {
//        return idx;
//    }
//
//    public int getNum() {
//        return num;
//    }
//}
//
////class Device{
////    public Device(int id, int gas) {
////        this.id = id;
////        this.gas = gas;
////    }
////
////    private int id;
////    private int gas;
////
////    public int getId() {
////        return id;
////    }
////
////    public int getGas() {
////        return gas;
////    }
//    //    Device(int id, int gas){
////        this.id = id;
////        this.gas = gas;
////    }
////}
