package _09exercicio_fixacao;

import java.util.Objects;

public class Funcionario implements Comparable<Funcionario>{

    private String name;
    private String email;
    private Double salary;

    public Funcionario() {
    }

    public Funcionario(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Funcionario funcionario) {
        return this.email.toUpperCase().compareTo(funcionario.email.toUpperCase());
    }
}
