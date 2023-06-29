
package apocalipse;


public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    protected String texto;
    protected char caractere;

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
}
