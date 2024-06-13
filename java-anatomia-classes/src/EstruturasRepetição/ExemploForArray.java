package EstruturasRepetição;

public class ExemploForArray {
    public static void main(String[] args) {
        //Array
        //em arrays o indice inicia em ZERO
        String alunos [] = {"FELIPE","JONAS","JULIA","MARCOS"};
            
        for(int x= 0; x < alunos.length;x ++ ){
            System.out.println("O aluno no indice x ="+ x + " é "+ alunos[x]);
        } 
        System.out.println("");
        //for/each
        //forma abreviada 
        for(String aluno: alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }
   

}

