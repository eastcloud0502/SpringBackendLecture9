package org.example.Head03_OOP.topic06_Enum.example03;

public class EnumSwitchTest {
    public enum OrderStatus {
        ORDERD, READY, DELIVERD
    }

    public static void printStatus(OrderStatus status) {
        switch (status) {
            case ORDERD:
                System.out.println("주문됨");
                break;
            case READY:
                System.out.println("준비 완료");
                break;
            case DELIVERD:
                System.out.println("배송됨");
                break;
        }
    }

    public static void main(String[] args) {
        printStatus(OrderStatus.DELIVERD);
    }
}
