package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액:" + discount + "원");

        if (true) System.out.println("if문에서 실행됨"); //코드가 한줄일때 {} 생략할수있다 단 생략하는걸 선호하지않는다. 코드 블록 사용하기
    }
}
