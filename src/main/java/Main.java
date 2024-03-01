import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String nameCourse = "Pós Graudação na Descomplica - Engenharia de Software";
    System.out.println(nameCourse);

    System.out.println("Qual o seu nome?");
    String studentName;
    Scanner student = new Scanner(System.in);
    studentName = student.next();

    System.out.println("Seja bem vindo(a), " + studentName + "!");

    System.out.println("Qual a sua idade?");
    int studentAge;
    Scanner age = new Scanner(System.in);
    studentAge = age.nextInt();

    if (studentAge >= 18 && studentAge <= 22) {
      System.out.println("Que legal, começou bem cedo, né?");
    } else if (studentAge < 18) {
      System.out.println("Eita, começou novo ainda, hein?");
    } else {
      System.out.println("Que legal, parabéns pela conquista!");
    }

    System.out.println("O que você deseja fazer?");
    System.out.println("1 - Conferir sua média");
    System.out.println("2 - Conferir as próximas matérias");
    System.out.println("3 - Trocar de curso");
    System.out.println("4 - Sair");

    int choice;
    Scanner menu = new Scanner(System.in);
    choice = menu.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Você selecionou a opção 1: Conferir sua média.");
        System.out.println("Insira a sua primeira nota:");

        int gradeOne;
        int gradeTwo;
        int gradeThree;

        Scanner gradeInformedOne = new Scanner(System.in);
        gradeOne = gradeInformedOne.nextInt();

        System.out.println("Insira a sua segunda nota:");

        Scanner gradeInformedTwo = new Scanner(System.in);
        gradeTwo = gradeInformedTwo.nextInt();

        System.out.println("Insira a sua terceira nota:");

        Scanner gradeInformedThree = new Scanner(System.in);
        gradeThree = gradeInformedThree.nextInt();

        int average = (gradeOne + gradeTwo + gradeThree) / 3;

        if (average >= 7) {
          System.out.println("Sua média foi de " + average + " e você foi aprovado!");
        } else {
          System.out.println("Sua média foi de " + average + " e você foi reprovado.");
        }

        break;
      case 2:
        System.out.println("Você selecionou a opção 2: Conferir as próximas matérias.");
        System.out.println("As próximas matérias do seu curso são:");
        break;
      case 3:
        System.out.println("Você selecionou a opção 3: Trocar de curso.");
        System.out.println("Para qual dos cursos você deseja trocar?");
        break;
      case 4:
        System.out.println("Você selecionou a opção 4: Sair.");
        System.out.println("Até mais!");
        break;
      default:
        System.out.println("Opção inválida, selecione um número dentro das opções mostradas.");
        break;
    }
  }
}