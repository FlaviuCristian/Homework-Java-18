public class Phone {
    private String brandName;
    public String color;
    int batteryLife;

    public Phone(String brandName, String color, int batteryLife) {
        this.brandName = brandName;
        this.color = color;
        this.batteryLife = batteryLife;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) { return color; }

    public int getBatteryLife() { return batteryLife;}

    public int setBatteryLife(int batteryLife) {return batteryLife;}


}

