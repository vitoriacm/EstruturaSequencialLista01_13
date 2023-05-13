import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira sua altura");
        double altura = InserirAltura(teclado);

        double homem = (72.7 * altura) - 58;
        double mulher = (62.1 * altura) - 44.7;

        teclado.close();

        System.out.printf("Peso ideal homem %.2f , Peso ideal mulher %.2f ", homem, mulher);

    }

    private static double InserirAltura(Scanner teclado) {
        double altura = teclado.nextDouble();
        return altura;
    }
}
