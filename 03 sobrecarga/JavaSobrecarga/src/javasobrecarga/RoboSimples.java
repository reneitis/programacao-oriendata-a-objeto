
package javasobrecarga;


public class RoboSimples {
        private String nomeRobo;
    private int posicaoAtualX;
    private int posicaoAtualY;
    private char direcaoAtual;
    
    RoboSimples(String nomeRobo, int posicaoAtualX,int posicaoAtualY,char direcaoAtual ){
        this.nomeRobo = nomeRobo ;
        this.posicaoAtualX = posicaoAtualX; //sem o this a variavel nao recebe o atributo, o nome ja foi declarado ele so estar referenciando
        this.posicaoAtualY = posicaoAtualY;
        this.direcaoAtual = direcaoAtual;
    }
    
     RoboSimples(String nomeRobo){
       this.nomeRobo = nomeRobo;
       this.posicaoAtualX =0;
       this.posicaoAtualY =0;
       this.direcaoAtual ='N';
    }
     
     RoboSimples(){
        String nomeRobo = "";
        int posicaoAtualX =0;
        int posicaoAtualY =0;
        char direcaoAtual = 'N';
    }
     
     public void move(int passos){
         if(direcaoAtual == 'N') posicaoAtualY = posicaoAtualY + passos ;
         if(direcaoAtual == 'S') posicaoAtualY = posicaoAtualY - passos ;
         if(direcaoAtual == 'E') posicaoAtualX = posicaoAtualX + passos ;
         if(direcaoAtual == 'O') posicaoAtualX = posicaoAtualX - passos ;
     }
     
    
      public void move(){
         if(direcaoAtual == 'N') posicaoAtualY = posicaoAtualY + 1 ;
         if(direcaoAtual == 'S') posicaoAtualY = posicaoAtualY - 1 ;
         if(direcaoAtual == 'E') posicaoAtualX = posicaoAtualX + 1 ;
         if(direcaoAtual == 'O') posicaoAtualX = posicaoAtualX - 1 ;
     }
     
       public void mudaDirecao(char novaDirecao){
         direcaoAtual = novaDirecao;
     }
       
       public String toString(){
           String posicao = "Nome do Robô:" + nomeRobo + " \n " ;
           posicao = posicao + "Posição do Robô:" + posicaoAtualX + "," + posicaoAtualY  + " \n  ."; 
           posicao = posicao +  "Direção atual do Robô :"  + direcaoAtual ;  
           return posicao;
     }
}

