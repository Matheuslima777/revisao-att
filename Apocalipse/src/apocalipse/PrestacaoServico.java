
package apocalipse;

import java.time.LocalDate;


public class PrestacaoServico extends Juridica {
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoestadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoestadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n INICIO DO CONTRATO: " + Util.formatarData(contratoInicio) +
                "FINA DO CONTRATO: " + Util.formatarData(contratoFim) ;
    }
    
    
    
}
