package tarefa3;

public class Computador {
    private String marca;
    private String processador;
    private int memoriaRAM; // em GB

    public Computador(String marca, String processador, int memoriaRAM) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

 
    public void exibirDados() {
        System.out.println("Computador " + marca + " | Proc: " + processador + " | RAM: " + memoriaRAM + "GB");
    }
}
