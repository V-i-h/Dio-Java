package Operadores;

public class TipoVariavel {
        public static void main(String[] args) throws Exception {
          
    
         ////////////Declaração de Variáveis////////////////////
         //Tipo de dados + nome da variável + valor atribuído.
         
         int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
    
         int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", valor = 2021.
         System.out.println(anoFabricacao);
         double salarioMinimo = 2500; //tipo "double", nome "salarioMinimo", valor = 2.500.
         long cpf = 98765432109L;
         float pi = 3.14F;
        
        
         System.out.println("Hello World");
    
         anoFabricacao = 2022;//colocando outro valor na varivavel 
         System.out.println(anoFabricacao);
    
    
         //Constanste
         //Não permite alteração quando a variável tem >>> final <<<< 
         //Variável deve ser escrita sempre com caixa alta >>>VALOR_DE_PI<<<<
         final double VALOR_DE_PI = 3.14; 
        
            }
    
}
