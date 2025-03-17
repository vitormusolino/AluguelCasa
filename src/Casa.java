public class Casa {
    private int numeroCasa;
    private boolean aluguelCasa;

    public Casa(int numeroCasa){
        this.numeroCasa = numeroCasa;
        this.aluguelCasa = false;
    }

    public void alugarCasa(int numeroCasa){
        if(this.numeroCasa == numeroCasa){
            if (aluguelCasa){
                System.out.println("Essa casa ja está alugada. Tente alugar outra casa!");
            }else {
                aluguelCasa = true;
                System.out.println("A casa número " + numeroCasa + " está alugada para você!");
            }
        }
    }

    public boolean isAlugada() {
        return aluguelCasa;
    }

    @Override
    public String toString() {
        if(aluguelCasa){
           return "Casa número " + numeroCasa + " no momento está: ALUGADA";
        }else {
            return "Casa número " + numeroCasa + " no momento está: LIVRE";
        }
    }
}

