import java.util.Scanner;

public class Main11 {
  public static void main (String[] args) {
  
    Scanner scanner = new Scanner(System.in);

     double saldo = 200.00;
     double saque;
     double deposito;

    System.out.println("Aperte a tecla l para ver seu saldo \n Aperte a tecla g para fazer um saque \n Aperte a tecla u para fazer um deposito");
   
    String tecla = scanner.nextLine();

    if (tecla.equals( "l")) {
      System.out.println("seu saldo é " + saldo);
    } else if (tecla.equals("g")) {
        System.out.print("qual o valor do saque?");
        saque = scanner.nextDouble();
        scanner.nextLine();
       if (saque <= saldo) {
        System.out.println("3\n2 \n 1\nsaque completo");
        saldo -= saque;
       } else {
        System.out.println("você não pode sacar mais do que tem");
       }
    } else if (tecla.equals("u")) {
        System.out.print("qual o valor do deposito?");
        deposito = scanner.nextDouble();
      scanner.nextLine();
        System.out.println("3\n2\n\n1\nsaque concluido");
        saldo += deposito;
    } else {
        System.out.println("comando não reconhecido");
    }
    scanner.close();
  }
}