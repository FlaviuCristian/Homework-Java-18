package GenericCalculator;

public interface Operator <compute extends Number>{

    compute sum(double x, double y);
    compute divide(double x, double y);
    compute multiply(double x, double y);
    compute subtract(double x, double y);
}
