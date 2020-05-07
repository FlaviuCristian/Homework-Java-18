package GenericCalculator;

public class Operation implements Operator {

    @Override
    public Number sum(double x, double y) {
        return x+y;
    }

    @Override
    public Number divide(double x, double y) {
        return x / y;
    }

    @Override
    public Number multiply(double x, double y) {

        return x * y;
    }

    @Override
    public Number subtract(double x, double y) {

        return x - y;
    }
}