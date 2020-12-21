package Lesson7;

public class KeybordBytton extends Keoboard {
        private String delailBytton;

        KeybordBytton(String name, int price, String color, String delailBytton){
            super(name, price, color);
            this.delailBytton = delailBytton;
        }

    public String getDelailBytton() {
        return delailBytton;
    }

    public void setDelailBytton(String delailBytton) {
        this.delailBytton = delailBytton;
    }

    @Override
    public void element() {
        System.out.println("f");
    }

}
