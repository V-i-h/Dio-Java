package Operadores;

public class OperadorRelacional {
    
    public static void main(String[] args) {
        /////Operadores Relacionais///////
        //== Igual a outra 
        //!= Diferente da outra
        //> Maior que a outra
        //>= Maior ou igual a outra 
        //< Menor que a outra
        //<= Menor ou igual a outra
         
        String  nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";
        //equals para objetos
        System.out.println(nomeUm.equals(nomeDois));
    
        //para números operadores relacionais
        int numero1 = 1 ;
        int numero2 = 2 ;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? "+ simNao);
    
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? "+ simNao);
    
        simNao = numero1 > numero2 ; 
        System.out.println("numeroUm é maior que o  numeroDois?" + simNao);
    
        }
    
}
