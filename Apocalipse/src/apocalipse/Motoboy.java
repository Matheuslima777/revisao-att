
package apocalipse;

import java.time.LocalDate;


public class Motoboy extends Funcionario {
    private String carteiraHabilitacao;

    public Motoboy(String carteiraHabilitacao, String cpf, String rg, String matricula, Setor_Funcionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, datanascimento, nome, telefone, email, endereco);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n CARTEIRA DE HABILITACAO: " + carteiraHabilitacao ;
    }
    
    
}
