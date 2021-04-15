package mc322.lab03;

public class AppLab03 {
    public static void main(String[] args) {
        String animacaoString = "080403MCMVM";
        int qntdPassos = animacaoString.length() - 6;
        
        Animacao animacao = new Animacao(animacaoString);

        animacao.apresenta();
        for (int i = 0; i < qntdPassos; i++) {
            animacao.passo();
        }
    }    
}
