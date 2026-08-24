package tarefa3;

import java.util.Scanner;

public class TesteTarefa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== DADOS DO CLIENTE ===");
        System.out.print("Nome do Cliente: ");
        String nomeCliente = teclado.nextLine();
        System.out.print("CPF do Cliente: ");
        String cpfCliente = teclado.nextLine();
        Cliente meuCliente = new Cliente(nomeCliente, cpfCliente);

        System.out.println("\n=== DADOS DO COMPUTADOR ===");
        System.out.print("Marca do Computador: ");
        String marcaComp = teclado.nextLine();
        System.out.print("Processador: ");
        String procComp = teclado.nextLine();
        System.out.print("Memória RAM (GB): ");
        int ramComp = teclado.nextInt();
        teclado.nextLine(); 
        Computador meuComputador = new Computador(marcaComp, procComp, ramComp);

        // 3. Dados do Monitor
        System.out.println("\n=== DADOS DO MONITOR ===");
        System.out.print("Marca do Monitor: ");
        String marcaMon = teclado.nextLine();
        System.out.print("Polegadas do Monitor: ");
        double polegadasMonitor = teclado.nextDouble();
        teclado.nextLine(); 
        Monitor meuMonitor = new Monitor(marcaMon, polegadasMonitor);

        // 4. Criando o Pedido e fazendo a ASSOCIAÇÃO
        System.out.println("\n=== GERANDO PEDIDO ===");
        System.out.print("Digite o número do pedido: ");
        int numPed = teclado.nextInt();
        
        // Aqui passamos os 3 objetos criados anteriormente para dentro do Pedido
        Pedido novoPedido = new Pedido(numPed, meuCliente, meuComputador, meuMonitor);

        // Exibe o relatório unificado
        novoPedido.exibirPedido();

        teclado.close();
    }
}
