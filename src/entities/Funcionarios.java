package entities;

public class Funcionarios {

    // ATRIBUTOS
    private String name;
    private String email;
    private Double salario;
    // ATRIBUTOS

    // CONSTRUTORES
    public Funcionarios(String name, String email, Double salario) {
        this.name = name;
        this.email = email;
        this.salario = salario;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    // ENCAPSULAMENTO



    
}
