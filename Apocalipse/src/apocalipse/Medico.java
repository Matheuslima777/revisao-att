
package apocalipse;

import java.time.LocalDate;


public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor_Funcionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, datanascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public double getSalarioFinal() {
       return salario;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n CRM: " + crm ;
    }
    
    
}
