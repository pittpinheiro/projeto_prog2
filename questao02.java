//questão02
///Questão 02
import java.util.Scanner;

public class Main {

    public static double entradaDados(String entrada) {
        Scanner input = new Scanner(System.in);
        System.out.print(entrada);
        return input.nextDouble();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ax² + bx + c = 0.");
        double a = entradaDados("Insira o a: ");
        double b = entradaDados("Insira o b: ");
        double c = entradaDados("Insira o c: ");

        if (a == 0) {
            System.out.println("a não pode ser igual a zero.");
            return;
        }
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há raízes.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Raiz única: " + raiz);
        }else{
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raízes reais: x1 = " + raiz1 + ", x2 = " + raiz2);
        }
    }
}