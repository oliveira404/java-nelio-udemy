package entities;

public class Individual extends TaxPayer {

    private Double healthSpending;

    public Individual(String name, Double anualIncome, Double healthSpending) {
        super(name, anualIncome);
        this.healthSpending = healthSpending;
    }


    @Override
    public Double tax() {
        double porcentagemAnualIncome = 0;
        double porcentagemHealthSpending = 0;

        double resultado = 0;

        if(getAnualIncome() < 20000.00) {
            porcentagemAnualIncome = (15.0 / 100) * getAnualIncome();
            porcentagemHealthSpending = (50.0 / 100) * getHealthSpending();
            resultado = porcentagemAnualIncome - porcentagemHealthSpending;
        } else {
            porcentagemAnualIncome = (25.0 / 100) * getAnualIncome();
            porcentagemHealthSpending = (50.0 / 100) * getHealthSpending();
            resultado = porcentagemAnualIncome - porcentagemHealthSpending;
        }

        return resultado;
    }
    /*@Override
    protected Double tax() {
        return 100.0;
    }*/

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

}




/*
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde.
 * Os dados de pessoa jurídica são nome, renda anual e número de funcionários.
 *
 * As regras para cálculo de imposto são as seguintes:




 */