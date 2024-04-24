package entities;

public final class OutsourcedEmployee extends Employee {

    private Double additionalCharge;


    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " - $ " + String.format("%.2f", payment()));
        return sb.toString();
    }
}
