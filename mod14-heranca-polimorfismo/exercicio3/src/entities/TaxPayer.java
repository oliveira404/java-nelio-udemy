package entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public abstract Double tax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(String.format("%s: $ %.2f", name, tax())).toString();
    }
}


