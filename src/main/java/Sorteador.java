import java.util.Scanner;
import java.util.Random;

public class Sorteador {
  public static void main(String[] args) {

    Random gerador = new Random();
    int x = gerador.nextInt(100);

    Scanner entrada = new Scanner(System.in);
    System.out.println("Bem vindo(a) ao sorteador de números! Escolha um número entre 0 e 100 e tente a sorte!");

    int numero = entrada.nextInt();

    if (numero == x) {
      System.out.println("Parabéns, você acertou!");
    } else {
      System.out.println("Que pena, você errou! O número sorteado foi: " + x);
    }
  }
}