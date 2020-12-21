package Lesson7;

public class KeyboardCertificate extends Keoboard {
    private String certificate;

    KeyboardCertificate(String name, int price, String color, String certificate){
        super(name, price, color);
        this.certificate = certificate;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }


    @Override
    public void element() {
        System.out.println("ds");
    }
}
