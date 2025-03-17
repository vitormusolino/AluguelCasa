import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(1);
        Casa casa2 = new Casa(2);
        Casa casa3 = new Casa(3);

        Pessoa pessoa1 = new Pessoa("Vitor", 19, 200);
        Pessoa pessoa2 = new Pessoa("Alexandre", 17, 600);
        Pessoa pessoa3 = new Pessoa("Omar", 23, 400);


        casa1.alugarCasa(pessoa1);
        casa1.alugarCasa(pessoa3);
        casa3.alugarCasa(pessoa2);

        ArrayList<Casa> listaCasas = new ArrayList<>();
        listaCasas.add(casa1);
        listaCasas.add(casa2);
        listaCasas.add(casa3);
        System.out.println(listaCasas);
    }
}
