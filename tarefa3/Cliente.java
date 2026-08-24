package tarefa3;
public class Cliente{
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public void exibirDados(){
        System.out.println("Cliente "+ nome + "CPF: " + cpf );
    }
}