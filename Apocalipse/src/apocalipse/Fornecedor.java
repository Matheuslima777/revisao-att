
package apocalipse;


public class Fornecedor extends Juridica{
    private Setor_Fornecedor setor;
    private Produto produto;

    public Fornecedor(Setor_Fornecedor setor, Produto produto, String cnpj, String inscricaoestadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoestadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }

    public Setor_Fornecedor getSetor() {
        return setor;
    }

    public void setSetor(Setor_Fornecedor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n SETOR: " + setor.texto +
                "\n PRODUTO: " + produto ;
    }


    
}
