import java.util.stream.Stream;

public enum Model {

    Note10("100"),
    Galaxy10("80"),
    Iphone_X("50"),
    Iphone_11("400");

    private String batteryLife;

    Model(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public static Stream<Model> stream(){
        return Stream.of(Model.values());
    }
}