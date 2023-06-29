
package apocalipse;


public enum Setor_Funcionario {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    OPERACOES("Operacoes");
    
    
    protected String texto;

    private Setor_Funcionario(String texto) {
        this.texto = texto;
    }

    public static Setor_Funcionario getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor_Funcionario getSAUDE() {
        return SAUDE;
    }

    public static Setor_Funcionario getJURIDICO() {
        return JURIDICO;
    }

    public static Setor_Funcionario getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public static Setor_Funcionario getOPERACOES() {
        return OPERACOES;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
