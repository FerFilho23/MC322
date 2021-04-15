package mc322.lab03;

public class Animacao {
    String passo;
    AquarioLombriga lombriga;


    public Animacao(String animacao) {
        int AA = Integer.parseInt(animacao.substring(0, 2));
        int LL = Integer.parseInt(animacao.substring(2, 4));
        int PP = Integer.parseInt(animacao.substring(4, 6));
        
        this.lombriga = new AquarioLombriga(LL, AA, PP);

        this.passo = animacao.substring(6);
    }

    public void apresenta() {
        lombriga.apresenta();
    }

    public void passo() {
        switch (passo.charAt(0)) {
            case 'M':
                lombriga.mover();
                lombriga.apresenta();
                break;
            
            case 'V':
                lombriga.virar();
                lombriga.apresenta();
                break;

            case 'C':
                lombriga.crescer();
                lombriga.apresenta();
                break;

            default:
                return;
        }

        passo = passo.substring(1);
    }
}
