package org.example.Head03_OOP.example07;

class BusinessUser extends User{
    private String email;
    private String adress;

    public BusinessUser(String id, String name, String email, String adress) {
        super(id, name);
        this.email = email;
        this.adress = adress;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("이메일: " + email);
        System.out.println("주소: " + adress);
    }
}
