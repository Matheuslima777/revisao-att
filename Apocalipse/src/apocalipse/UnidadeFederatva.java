
package apocalipse;


public enum UnidadeFederatva {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao Paulo", " SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    protected String texto;
    protected String sigla;

    private UnidadeFederatva(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public static UnidadeFederatva getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederatva getSAO_PAULO() {
        return SAO_PAULO;
    }

    public static UnidadeFederatva getRIO_DE_JANEIRO() {
        return RIO_DE_JANEIRO;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
    
    
}
