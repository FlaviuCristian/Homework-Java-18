public class Iphone extends Phone {
    public Model model;

    public Iphone(String brandName, String color, int batteryLife, Model model) {
        super(brandName, color ,batteryLife);
        this.model = model;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return " Producator" + "(" + super.getBrandName() + ")" + ", " + "Model" + "(" + model + ")" + ", "
                + "color" + "(" + super.getColor() + ")" + ", " +
                "Batterylife" + "(" + this.getBatteryLife()+"h" + ")";
    }
}