import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteador {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    Random random = new Random();
    List<Integer> acertos = new ArrayList<>();
    List<Integer> erros = new ArrayList<>();
    List<Integer> perto = new ArrayList<>();

    int numero = 0;
    int valorAleatorio = 0;
    int pontos = 0;
    int rejogar = 1;
    int pontoParcial = 0;
    int pontoTotal = 0;

    System.out.println("TESTE SUA SORTE!!!\n");
    System.out.println("Você irá inserir um número, caso seja igual ao número sorteado você ganhará 10 pontos.");
    System.out.println("Se for um número acima ou um número abaixo, você ganhará 5 pontos.");
    System.out.println("Caso o número seja diferente e não esteja próximo, VOCÊ PERDE!!!\n");
    System.out.println("Vamos jogar!!\n");
    System.out.println("Escolha o nível de dificuldade: ");
    System.out.println(" 1 - Fácil\n 2 - Normal\n 3 - Difícil\n 4 - Muito difícil");
    int dificuldade = inputUsuario.nextInt();


    while(rejogar == 1) {
      switch (dificuldade){
        case 1:
          System.out.println("Insira um número entre 0 e 5: ");
          numero = inputUsuario.nextInt();
          valorAleatorio = random.nextInt(5);


          if(numero > 5 || numero < 0){
            System.out.println("Por favor, escolha um número dentro do intervalo determinado!!!");
          } else if (numero == valorAleatorio + 1 || numero == valorAleatorio - 1){
            pontos = 5;
            pontoParcial += pontos;
            perto.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você chegou muito perto!!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");

          } else if(numero != valorAleatorio) {
            erros.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("Infelizmente você errou, mais sorte da próxima vez!");
          } else if (numero == valorAleatorio) {
            pontos = 10;
            pontoParcial += pontos;
            acertos.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você acertou!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          }
          break;
        case 2:
          System.out.println("Insira um número entre 0 e 20: ");
          numero = inputUsuario.nextInt();
          valorAleatorio = random.nextInt(20);

          if(numero > 20 || numero < 0){
            System.out.println("Por favor, escolha um número dentro do intervalo determinado!!!");
          } else if (numero == valorAleatorio + 1 || numero == valorAleatorio - 1){
            pontos = 5;
            pontoParcial += pontos;
            perto.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você chegou muito perto!!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          } else if(numero != valorAleatorio) {
            erros.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("Infelizmente você errou, mais sorte da próxima vez!");
          } else if (numero == valorAleatorio) {
            pontos = 10;
            pontoParcial += pontos;
            acertos.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você acertou!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          }
          break;
        case 3:
          System.out.println("Insira um número entre 0 e 50: ");
          numero = inputUsuario.nextInt();
          valorAleatorio = random.nextInt(50);

          if(numero > 50 || numero < 0){
            System.out.println("Por favor, escolha um número dentro do intervalo determinado!!!");
          } else if (numero == valorAleatorio + 1 || numero == valorAleatorio - 1){
            pontos = 5;
            pontoParcial += pontos;
            perto.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você chegou muito perto!!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          } else if(numero != valorAleatorio) {
            erros.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("Infelizmente você errou, mais sorte da próxima vez!");
          } else if (numero == valorAleatorio) {
            pontos = 10;
            pontoParcial += pontos;
            acertos.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você acertou!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          }
          break;
        case 4:
          System.out.println("Insira um número entre 0 e 100: ");
          numero = inputUsuario.nextInt();
          valorAleatorio = random.nextInt(100);

          if(numero > 100 || numero < 0){
            System.out.println("Por favor, escolha um número dentro do intervalo determinado!!!");
          } else if (numero == valorAleatorio + 1 || numero == valorAleatorio - 1){
            pontos = 5;
            pontoParcial += pontos;
            perto.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você chegou muito perto!!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          } else if(numero != valorAleatorio) {
            erros.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("Infelizmente você errou, mais sorte da próxima vez!");
          } else if (numero == valorAleatorio) {
            pontos = 10;
            pontoParcial += pontos;
            acertos.add(numero);
            System.out.println("O número digitado foi: " + numero);
            System.out.println("O número sorteado foi: "+ valorAleatorio);
            System.out.println("PARABÉNS você acertou!");
            System.out.println("Você ganhou " + pontos + " pontos!!!");
          }
          break;
        default:
          System.out.println("A opção escolhida é inválida!!!");
          return;
      }
      System.out.println("\nDeseja jogar novamente: 1 para SIM e 0 para NÃO");
      rejogar = inputUsuario.nextInt();
    }
      pontoTotal += pontoParcial;
      System.out.println("Sua pontuação total foi: " + pontoTotal + " pontos");
      System.out.println("Números que você acertou: " + acertos);
      System.out.println("Números que você chegou perto: " + perto);
      System.out.println("Números que você errou: " + erros);
  }
}
