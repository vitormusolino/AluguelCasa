import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa(1);
        Casa casa2 = new Casa(2);
        Casa casa3 = new Casa(3);

        System.out.println(casa1.isAlugada());
        casa1.alugarCasa(1);
        System.out.println(casa1.isAlugada());

        ArrayList<Casa> listaCasas = new ArrayList<>();
        listaCasas.add(casa1);
        listaCasas.add(casa2);
        listaCasas.add(casa3);
        System.out.println(listaCasas);
    }
}
