package tarefa3;


public class Pedido {
    private Cliente donoPedido;
    private Computador comPedido;
    private Monitor monitorPedido;
    private int numeroPedido;

    public Pedido(int numeroPedido, Cliente donoPedido, Computador comPedido, Monitor monitorPedido){
        this.numeroPedido = numeroPedido;
        this.donoPedido = donoPedido;
        this.monitorPedido = monitorPedido;
        this.comPedido = comPedido;
    }
    public void exibirPedido(){
        System.out.println("\n=================================");
        System.out.println("RESUMO DO PEDIDO Nº: " + numeroPedido);
        System.out.println("=================================");
        donoPedido.exibirDados();
        comPedido.exibirDados();
        monitorPedido.exibirDados();
        System.out.println("=================================\n");
    }
}
