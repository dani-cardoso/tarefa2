package tarefa3;
public class Monitor{
    private String marca;
    private double polegadas;
public Monitor(String marca, double polegadas) {
    this.marca = marca;
    this.polegadas = polegadas; 
}
public void exibirDados(){
    System.out.println("Monitor: "+ marca + " - " + polegadas + " polegadas");
}
}