

package apocalipse;


public enum Setor_Fornecedor {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construcao"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticio");
    
    
      protected  String texto;

    private Setor_Fornecedor(String texto) {
        this.texto = texto;
    }

    public static Setor_Fornecedor getTECNOLOGIA() {
        return TECNOLOGIA;
    }

    public static Setor_Fornecedor getMATERIAL_CONSTRUCAO() {
        return MATERIAL_CONSTRUCAO;
    }

    public static Setor_Fornecedor getMATERIA_PRIMA() {
        return MATERIA_PRIMA;
    }

    public static Setor_Fornecedor getALIMENTICIO() {
        return ALIMENTICIO;
    }

    public String getTexto() {
        return texto;
    }
      
      
   
}
