public class Samsung extends Phone {
    public Model model;

    public Samsung(String brandName, String color, int batteryLife, Model model) {
        super(brandName, color, batteryLife);
        this.model = model;
    }

    public Model getModel(Model model) {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return " Producator" + "("+super.getBrandName()+")" + ", " + "Model"  + "(" + model + ")" + ", "
                + "color" + "(" + super.getColor() + ")" + ", " +
                "Batterylife" + "(" + super.getBatteryLife()  + "h" + ")";

    }
}

