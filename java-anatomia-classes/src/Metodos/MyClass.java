package Operadores.Metodos;

public class MyClass {
    public double somar (int num1, int num2){
    //LOGICA - FINALIDADE DO MÉTODO
            return ... ;

 }
    public void imprimir(String texto){
    //LOGICA- FINALIDADE DO MÉTODO
    //AQUI NÃO PRECISA DE RETURN
    //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO

}
//Throws Exception:indica que o método ao ser utilizado
// poderá gerar uma exceção
public double dividir(int dividendo,int divisor) throws Exception{}

//este método não pode ser visto por outras classes no projeto
private void metodoPrivado(){}

//Alguns equívocos estruturais
public void validar (){
    // este métdo deveria retornar algum valor
    //no caso boolean (true ou false)

}
public void calcularEnviar(){
    // um método deve representar uma única responsabilidade

}
public void gravarCliente(String nome, String cpf){
    //este método tem a finalidade de gravar 
    //informações de um cliente, por que não criar
    //um objeto cliente e passar como parâmetro?
    //veja abaixo
}
public void gravarCliente(Cliente cliente){}
//ou
public void gravar(Cliente cliente){}
}
