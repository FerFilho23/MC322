package mc322.lab03;

public class AquarioLombriga{
   int lombrigaTamanho, aquarioTamanho;
   int posCabecaLombriga;
   int posCaudaLombriga;
   String representacaoString;

   public AquarioLombriga(int tamanho_lombriga, int tamanho_aquario, int posLombriga){ //Construtor
      this.lombrigaTamanho = tamanho_lombriga;
      this.aquarioTamanho = tamanho_aquario;

      if (lombrigaTamanho > aquarioTamanho) {   //Lombriga excede o tamanho do aquario
         aquarioTamanho = lombrigaTamanho;
      }
      
      if(posLombriga + lombrigaTamanho -1 > aquarioTamanho){    //Lombriga não pode ser colocada na posição especificada
         posLombriga -= (posLombriga + lombrigaTamanho - 1) - aquarioTamanho;
      }

      if (lombrigaTamanho == 1) {
         this.posCaudaLombriga = posLombriga;
         this.posCabecaLombriga = posLombriga;
      }else{
         this.posCaudaLombriga = posLombriga;
         this.posCabecaLombriga = posLombriga + lombrigaTamanho - 1;    //Comeca virada para a direita
      }
      
      this.representacaoString = "";
   }

   public void crescer() {
      if (posCabecaLombriga >= posCaudaLombriga && posCaudaLombriga > 1) {  //Lombriga virada para a direita c/ espaço para crescimento 
         posCaudaLombriga--;

      } else if (posCabecaLombriga <= posCaudaLombriga && posCaudaLombriga < aquarioTamanho) { //Lombriga virada para a esquerda c/ espaço para crescimento 
         posCaudaLombriga++;
      }
   }

   public void mover () {
      if (posCabecaLombriga >= posCaudaLombriga && posCabecaLombriga < aquarioTamanho) { //Lombriga virada para a direita c/ espaço para se mover
         posCabecaLombriga++;
         posCaudaLombriga++;

      }else if(posCabecaLombriga <= posCaudaLombriga && posCabecaLombriga > 1){
         posCabecaLombriga--;
         posCaudaLombriga--;
      }
   }

   public void virar () {
      int aux;
      aux = posCabecaLombriga;
      posCabecaLombriga = posCaudaLombriga;
      posCaudaLombriga = aux;
   }

   public void apresenta () {
      representacaoString = "";
      for (int i = 1; i <= aquarioTamanho; i++) {
         if ((i >= posCaudaLombriga && i <= posCabecaLombriga) || (i >= posCabecaLombriga && i <= posCaudaLombriga)) {
            if (i == posCabecaLombriga) {
               representacaoString += 'O';
            }else {
               representacaoString += '@';
            }
         }else{         
            representacaoString += '#';
         }
      }
      System.out.println(representacaoString);
   }
}