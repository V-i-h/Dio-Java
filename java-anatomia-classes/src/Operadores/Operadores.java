package Operadores;

import java.sql.Date;

public class Operadores {
    
    public static void main(String[] args) {

         //Operador de atribuição (=) 
         //Exemplos:
         String nome = "GLEYSON";
         int idade = 22 ; 
         double peso = 68.5 ;
         char sexo = 'M';
         boolean doadorOrgao = false;

         //Operadores aritméticos adição (+), subtração (-), multiplicação (*) e divisão (/)
        
         double soma = 10.5 + 15.7;
         int subtracao = 113 - 25;
         int  multiplicacao = 20 * 7;
         int divisao = 15 / 3;
         int modulo = 18 % 3 ;
         double resultado1 = (10*7) +(20/4);
       
         //Operador de adição (+), quando utilizado em variáveis de tipo
         //texto, realizará a "concatenação de textos ".
         String nomeCompleto = "LINGUAGEM" + "JAVA";
        
         System.out.println(nomeCompleto);
          
   
         String concatenacao = "?";
   
         System.out.println("1* "+concatenacao);
   
         concatenacao = 1+1+1+"1";
   
         System.out.println("2* "+concatenacao);
   
         concatenacao = 1+"1"+1+"1";
   
         System.out.println("3* "+concatenacao);
   
         concatenacao = "1"+1+1+1;
   
         System.out.println("4* "+concatenacao);
   
         concatenacao = "1"+(1+1+1);
         System.out.println("5* "+concatenacao);
   

     /////////Operador Unários/////////////
     //Operador unário de valor positivo (+)
     //Operador unário de valor negativo(-)
     //Operador unário de incremento de valor (++)
     //Operador unário de decremento de valor (--)
     //Operador unário lógico de negação (!)
       
     int numero = 5 ;
     numero = -numero;//operador unário de valor negativo 
     System.out.println(numero);

     numero = + numero * -1;//operador unário de valor positivo
     System.out.println(numero);

     //System.out.println(++ numero);
     //System.out.println(numero);

     System.out.println(numero --);
     System.out.println(numero);
     

     boolean variavel = true;
     // System.out.println(!variavel);//operador de negação
     // System.out.println(variavel);

     variavel = !variavel;// invertendo o valor da variável
     System.out.println(variavel);


     ////////////Operador Ternário /////
     //Operador ternário ?:

     int a , b ;
     a = 6;
     b = 6;
     
     String resultado = a == b ? "verdadeiro": "falso";
     int resultado2 = a == b ? 1 : 0 ;

     System.out.println(resultado);
     System.out.println(resultado2);

}
}