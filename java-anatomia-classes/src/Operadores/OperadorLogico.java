package Operadores;

public class OperadorLogico {
    
    public static void main(String[] args) {
        ////Operadores Lógicos////
        // Operador E ou and (&&)
        // Operador OU ou OR (||) 
        // Operador NÃO ou NOT (!)
   
        boolean condicao1 = true;
   
        boolean condicao2 = true;
           
        if(condicao1 && condicao2){
           System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){
           System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim");
        
        
   
       }
   
}
