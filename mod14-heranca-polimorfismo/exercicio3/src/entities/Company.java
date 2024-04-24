package entities;

public class Company extends TaxPayer {
    private Integer employeeNumbers;

    @Override
    public Double tax() {

        double porcentagemAnualIncome = 0;

        if(getEmployeeNumbers() > 10) {
            porcentagemAnualIncome = (14.0 / 100) * getAnualIncome();

        } else {
            porcentagemAnualIncome = (16.0 / 100) * getAnualIncome();

        }

        return porcentagemAnualIncome;
    }

    public Integer getEmployeeNumbers() {
        return employeeNumbers;
    }


    public Company(String name, Double anualIncome, Integer employeeNumbers) {
        super(name, anualIncome);
        this.employeeNumbers = employeeNumbers;
    }

}
