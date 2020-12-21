package Lesson5;

public class Electrocar extends car{
    private String batteryModel;
    private double batteryCapacity;
    Electrocar(String model, String color, String year, int dors){
        super(model,color,year,dors);

        this.batteryModel = batteryModel;
        this.batteryCapacity = batteryCapacity;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public  void start (){
        if (batteryCapacity > 0){

        }
    }
}
