
package apocalipse;

import java.time.LocalDate;
import java.time.Period;


public abstract class Fisica extends Pessoa {
    
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate datanascimento;

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate datanascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.datanascimento = datanascimento;
    }
    
    public int getIdade(){
    return Period.between(datanascimento, LocalDate.now()).getYears();
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n GENERO: " + genero.texto + 
                "\n ESTADO CIVIL: " + estadoCivil + 
                "\n DATA DE NASCIMENTO: " + Util.formatarData(datanascimento)+
                "\n IDADE: " + getIdade() ;
    }
    
    
}
