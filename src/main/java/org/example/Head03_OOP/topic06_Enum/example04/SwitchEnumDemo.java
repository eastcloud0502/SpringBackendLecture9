package org.example.Head03_OOP.topic06_Enum.example04;

public class SwitchEnumDemo {
    public static void main(String[] args) {
        PaymentMethod method = PaymentMethod.CRYPTO_PAYMENT;

        // switch-case로 enum처리
        switch (method) {
            case CREDIT_CARD:
                System.out.println("신용카드 결제 선택: " + method.getDisplayName());
                break;
            case ACCOUNT_TRANSFER:
                System.out.println("계좌이체 결제 선택: " + method.getDisplayName());
                break;
            case MOBILE_PAYMENT:
                System.out.println("모바일 결제 선택: " + method.getDisplayName());
                break;
            case CRYPTO_PAYMENT:
                System.out.println("가상화폐 결제 선택: " + method.getDisplayName());
                break;
        }
    }
}
