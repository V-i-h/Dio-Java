package Operadores;

public class OperadorUnario {
 
    public static void main(String[] args) {
        
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
 
     }
    
}
