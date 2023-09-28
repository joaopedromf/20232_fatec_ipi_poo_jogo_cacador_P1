import java.util.Random;
public class Jogo {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var personagem = new Personagem("John");
    int personagens = 1;
    int mortos = 0;
    while(personagens != mortos){
      int oQueFazer = gerador.nextInt(3); //[0..3[
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          break;
        case 1:
        personagem.comer();
          break;
        case 2:
        personagem.dormir();
        break;
      }
      mortos = mortos + personagem.morrer();
      personagem.exibirEstado();    
      System.out.println("********************");
      Thread.sleep(100);
    }
  }
}
