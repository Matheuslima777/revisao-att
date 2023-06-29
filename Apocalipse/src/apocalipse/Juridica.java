
package apocalipse;


public abstract class Juridica extends Pessoa {
     protected String cnpj;
     protected String inscricaoestadual;

    public Juridica(String cnpj, String inscricaoestadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoestadual = inscricaoestadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoestadual() {
        return inscricaoestadual;
    }

    public void setInscricaoestadual(String inscricaoestadual) {
        this.inscricaoestadual = inscricaoestadual;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CNPJ: " + cnpj +
                "\n INSCRICAO ESTADUAL: " + inscricaoestadual ;
    }
     
     
     
}
