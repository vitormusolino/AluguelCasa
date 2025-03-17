public class Casa {
    private int numeroCasa;
    private boolean aluguelCasa;
    private Pessoa pessoaAlugada;

    public Casa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
        this.aluguelCasa = false;
        this.pessoaAlugada = null;
    }

    // O método agora recebe uma pessoa
    public void alugarCasa(Pessoa pessoa) {
        if (aluguelCasa) {
            System.out.println(pessoa.getNome()+ " essa casa já está alugada. Tente outra casa.");
        } else {
            // Verificar se a pessoa tem dívida maior que 500
            System.out.println("Verificando dívida da pessoa " + pessoa.getNome() + ": " + pessoa.getDivida());
            if (pessoa.getDivida() > 500) {
                System.out.println("A pessoa " + pessoa.getNome() + " tem uma dívida muito grande para alugar essa casa.");
            } else {
                // Alugar a casa para a pessoa
                aluguelCasa = true;
                pessoaAlugada = pessoa;
                System.out.println("A casa número " + numeroCasa + " foi alugada para " + pessoa.getNome());
            }
        }
    }

    public boolean isAlugada() {
        return aluguelCasa;
    }

    @Override
    public String toString() {
        if (aluguelCasa) {
            return "Casa número " + numeroCasa + " está ALUGADA para " + pessoaAlugada.getNome();
        } else {
            return "Casa número " + numeroCasa + " está LIVRE";
        }
    }
}
