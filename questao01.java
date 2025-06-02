questao01
///Questão01
import java.util.Scanner;

public class Main {

    public static double entradaDados(String entrada) {
        Scanner input = new Scanner(System.in);
        System.out.print(entrada);
        return input.nextDouble();
    }

    public static long fatorial(int n) {
        if (n < 0) return -1;
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- CALCULADORA COMPLETA ---");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Exponenciação");
            System.out.println("6. Divisão inteira");
            System.out.println("7. Resto da divisão");
            System.out.println("8. Fatorial");
            System.out.println("9. Arranjos");
            System.out.println("10. Permutação");
            System.out.println("11. Piso (floor)");
            System.out.println("12. Teto (ceil)");
            System.out.println("13. Raiz de grau N");
            System.out.println("14. Verificar número primo");
            System.out.println("15. Verificar quadrado perfeito");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    double a1 = entradaDados("Insira o primeiro número: ");
                    double b1 = entradaDados("Insira o segundo número: ");
                    System.out.println("Resultado: " + (a1 + b1));
                    break;
                case 2:
                    double a2 = entradaDados("Insira o primeiro número: ");
                    double b2 = entradaDados("Insira o segundo número: ");
                    System.out.println("Resultado: " + (a2 - b2));
                    break;
                case 3:
                    double a3 = entradaDados("Insira o primeiro número: ");
                    double b3 = entradaDados("Insira o segundo número: ");
                    System.out.println("Resultado: " + (a3 * b3));
                    break;
                case 4:
                    double a4 = entradaDados("Insira o primeiro número: ");
                    double b4 = entradaDados("Insira o segundo número: ");
                    if (b4 != 0)
                        System.out.println("Resultado: " + (a4 / b4));
                    else
                        System.out.println("Não é permitido dividir por 0.");
                    break;
                case 5:
                    double base = entradaDados("Insira a base: ");
                    double exp = entradaDados("Insira o expoente: ");
                    System.out.println("Resultado: " + Math.pow(base, exp));
                    break;
                case 6:
                    int a6 = (int) entradaDados("Insira o primeiro número: ");
                    int b6 = (int) entradaDados("Insira o segundo número: ");
                    if (b6 != 0)
                        System.out.println("Resultado: " + (a6 / b6));
                    else
                        System.out.println("Não é permitido dividir por 0.");
                    break;
                case 7:
                    int a7 = (int) entradaDados("Insira o primeiro número: ");
                    int b7 = (int) entradaDados("Insira o segundo número: ");
                    if (b7 != 0)
                        System.out.println("Resultado: " + (a7 % b7));
                    else
                        System.out.println("Não é permitido dividir por 0.");
                    break;
                case 8:
                    int n8 = (int) entradaDados("Insira o valor para fatorar: ");
                    System.out.println("Resultado: " + fatorial(n8));
                    break;
                case 9:
                    int n9 = (int) entradaDados("Insira o valor de n: ");
                    int p9 = (int) entradaDados("Insira o valor de p: ");
                    if (n9 >= p9)
                        System.out.println("Arranjo: " + fatorial(n9) / fatorial(n9 - p9));
                    else
                        System.out.println("N deve ser maior ou igual a p.");
                    break;
                case 10:
                    int n10 = (int) entradaDados("Insira o valor para permutar: ");
                    System.out.println("Permutação: " + fatorial(n10));
                    break;
                case 11:
                    double n11 = entradaDados("Insira o valor: ");
                    System.out.println("Piso: " + Math.floor(n11));
                    break;
                case 12:
                    double n12 = entradaDados("Insira o valor: ");
                    System.out.println("Teto: " + Math.ceil(n12));
                    break;
                case 13:
                    double a13 = entradaDados("Insira o número: ");
                    double b13 = entradaDados("Insira o grau da raiz: ");
                    if (a13 < 0 && b13 % 2 == 0)
                        System.out.println("Raiz par de número negativo não é permitida.");
                    else
                        System.out.println("Resultado: " + Math.pow(a13, 1.0 / b13));
                    break;
                case 14:
                    int n14 = (int) entradaDados("Insira o valor: ");
                    boolean primo = true;
                    if (n14 <= 1) primo = false;
                    for (int i = 2; i <= Math.sqrt(n14); i++) {
                        if (n14 % i == 0) {
                            primo = false;
                            break;
                        }
                    }
                    System.out.println(primo ? "É primo." : "Não é primo.");
                    break;
                case 15:
                    int n15 = (int) entradaDados("Insira um valor: ");
                    if (n15 < 0) {
                        System.out.println("Não é quadrado perfeito.");
                    } else {
                        int raiz = (int) Math.sqrt(n15);
                        if (raiz * raiz == n15)
                            System.out.println("É quadrado perfeito.");
                        else
                            System.out.println("Não é quadrado perfeito.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
