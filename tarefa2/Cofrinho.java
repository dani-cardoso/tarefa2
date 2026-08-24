public class Cofrinho
{
    private Pessoa dono;
    private int qt50;
    private int qt25;
    private int qt10;
    
    public Cofrinho (Pessoa umaPessoa){
        dono = umaPessoa;
    }
    public Cofrinho (String umNome, int umaIdade){
        dono = new Pessoa(umNome, umaIdade);
    }
    public void setDono (Pessoa novoDono){
        dono = novoDono;
    }
    public Pessoa getDono(){
        return dono;
    }
    public void deposita50c (){
        qt50 = qt50 + 1;
    }
    public void deposita25c(){
        qt25 = qt25 + 1;
    }
    public void deposita10c(){
        qt10 = qt10 + 1;
    }
    public double calculoTotal(){
        double total;
        total = qt50+0.5+qt25*0.25+qt10*0.10;
        return total;
    }
    public String informaTotal(){
        return dono.getNome()+ "tem um total de "+calculoTotal()+"reais";
    }
}
