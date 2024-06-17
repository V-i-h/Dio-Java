package EstruturasExcepcionais;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args){
        //Try/Catch
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

     //Imprimindo os dados obtidos pelo usuário 

        System.out.println("Olá, me chamo "+ nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho "+ idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();

        }
        catch(InputMismatchException e){
            System.out.println("O Campos idade e altura precisam ser numéricos");
        }
        }


    }
    
