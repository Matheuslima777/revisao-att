
package apocalipse;

import java.time.LocalDate;
import java.time.Month;


public class Main {

  
    public static void main(String[] args) {
        
       PrestacaoServico prestacao = new PrestacaoServico(LocalDate.of(2017, Month.MARCH, 9), LocalDate.of(2019, Month.MARCH, 17), "1231231241", "213123123141", "Americanas", "2312-321313", "Americanas@gmail.com",
               new Endereco("Avenida sete", "156", "Prédio", "123123-3123", "salvador", UnidadeFederatva.BAHIA));
       
       Fornecedor fornecedor = new Fornecedor(Setor_Fornecedor.TECNOLOGIA, new Produto("PS5", "Tecnologia", 1100), "231231414", "131323123", "Amazon", "22131414", "Amazon@gmail.com",
               new Endereco("Caminho de areia", "231", "Predio", "23123", "Rio de janeiro", UnidadeFederatva.RIO_DE_JANEIRO));
    
    
    Medico medico = new Medico("2331131", "2313131", "131231414", "3221313231231", Setor_Funcionario.SAUDE, 1000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2001, Month.MARCH, 7), "Samara", "231313", "Samara@gmail.com", 
            new Endereco("Caminho de Areia", "1233", "Casa", "2313-3123", "Sao Paulo", UnidadeFederatva.SAO_PAULO));
    
    Diretor diretor = new Diretor("312321", "32123124", "31234242141", Setor_Funcionario.JURIDICO, 1000, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(1987, Month.MARCH, 9), "Matheus", "2334124124", "Matheus@gmail.com",
            new Endereco("Alphavile", "231", "Casa", "1231241", "Salvador", UnidadeFederatva.BAHIA));
    
    
        System.out.println(prestacao);
        System.out.println(fornecedor);
        
        diretor.admitir(diretor);
        diretor.admitir(medico);
        diretor.demitir(medico);
}
    
    
}
    