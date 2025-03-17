public class Pessoa {
    private String nome;
    private int idade;

    private double divida;

    public Pessoa(String nome, int idade, double divida){
        this.nome = nome;
        this.idade = idade;
        this.divida = divida;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getDivida() {
        return divida;
    }

    public void consultarDivida(){
        if(divida > 1000){
            System.out.println("Pessoa com divida grande.");
        } else if(divida > 0 && divida <= 500) {
            System.out.println("Pessoa com divida pequena");
        } else{
            System.out.println("Pessoa sem dívidas");
        }
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
}
