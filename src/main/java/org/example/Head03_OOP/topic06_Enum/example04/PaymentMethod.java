package org.example.Head03_OOP.topic06_Enum.example04;

public enum PaymentMethod {
    CREDIT_CARD("신용카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    MOBILE_PAYMENT("모바일결제"),
    CRYPTO_PAYMENT("가상화폐결제");

    private final String displayName;

    // 생정자: enum 상수마다 dispalyName 초기화
    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
