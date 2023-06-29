
package apocalipse;

import java.time.LocalDate;


public abstract class Funcionario extends Fisica implements Salariofinal {
    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor_Funcionario setor; 
    protected double salario; 

    public Funcionario(String cpf, String rg, String matricula, Setor_Funcionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, datanascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor_Funcionario getSetor() {
        return setor;
    }

    public void setSetor(Setor_Funcionario setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return super.toString() + 
                "\n CPF: " + cpf + 
                "\n RG" + rg + 
                "\n MATRICULA: " + matricula +
                "\n SETOR: " + setor.texto + 
                "\n SALARIO BASE: " + Util.formatarMonetario(salario) +
                "\n SALARIO FINAL: " + Util.formatarMonetario(getSalarioFinal());
    }
    
    
}
