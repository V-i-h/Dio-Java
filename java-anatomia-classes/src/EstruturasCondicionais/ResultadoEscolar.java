package EstruturasCondicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        // Condicional composta

          int nota = 8;
          
           if (nota >= 7)
            System.out.println("Aprovado!");
           else
            System.out.println("Reprovado!");
          
          
           //Condicional Encadeada
          
          int nota1 = 10;
          
          if (nota1 >= 7)
           System.out.println("Aprovado!");
          else if (nota1 >=5 && nota1 <7)
           System.out.println("Recuperação");
          else
           System.out.println("Reprovado!");
         

         // Condicional Ternária
         //Ex1:
         int nota2 = 5;

         String resultado = nota2 >= 7 ? "Aprovado" : "Reprovado";

         System.out.println(resultado);
          
         //Ex2:

         int nota3 = 8;

         String resultado1 = nota3 >= 7 ? "Aprovado" : nota3 >=5 && nota3 <7 ?"Recuperação": "Reprovado";

         System.out.println(resultado1);
    }
}
