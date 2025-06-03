package classes;

import java.util.Scanner;

public class Massa extends Unidade {

    public Massa(float medida_Atual){
        super(medida_Atual);
    }
    
    public static Massa setValor(Scanner scanner){
        Massa.clear_terminal();
        float valor = Massa.lerValor(scanner, "Adicione o valor a ser convertido: \n", false);
        return new Massa(valor);
    }

    public void Quilogramas_para_Gramas() {
        float atual = getTempAtual();
        float convertido = atual * 1000;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f Kg equivalem a %.2f g.%n", atual, convertido);
        System.out.println("Conversão realizada: Quilogramas para Gramas.");
    }

    public void Quilogramas_para_Libras() {
        float atual = getTempAtual();
        float convertido = atual * 2.20462f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f Kg equivalem a %.2f libras.%n", atual, convertido);
        System.out.println("Conversão realizada: Quilogramas para Libras.");
    }

    public void Gramas_para_Quilogramas() {
        float atual = getTempAtual();
        float convertido = atual / 1000;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f g equivalem a %.2f Kg.%n", atual, convertido);
        System.out.println("Conversão realizada: Gramas para Quilogramas.");
    }

    public void Libras_para_Quilogramas() {
        float atual = getTempAtual();
        float convertido = atual / 2.20462f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f libras equivalem a %.2f Kg.%n", atual, convertido);
        System.out.println("Conversão realizada: Libras para Quilogramas.");
    }

    public static void Menu(Scanner scanner) {
        Massa.clear_terminal();
        System.out.println("\n=== CONVERSOR DE MASSA ===");
        System.out.println("\n=== CONVERSOR DE MASSA ===");
        System.out.println("Selecione o tipo de conversão:");
        System.out.println("--------------------------------");
        System.out.println("1. Quilogramas - Gramas");
        System.out.println("2. Quilogramas - Libras");
        System.out.println("3. Gramas - Quilogramas");
        System.out.println("4. Libras - Quilogramas");
        System.out.println("--------------------------------");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("\nDigite a opção desejada: ");

        String input = scanner.nextLine();
        Massa massa;

        switch (input) {
            case "1":
            massa = Massa.setValor(scanner);
            massa.Quilogramas_para_Gramas();
            break;
            case "2":
            massa = Massa.setValor(scanner);
            massa.Quilogramas_para_Libras();
            break;
            case "3":
            massa = Massa.setValor(scanner);
            massa.Gramas_para_Quilogramas();
            break;
            case "4":
            massa = Massa.setValor(scanner);
            massa.Libras_para_Quilogramas();
            break;
            case "0":
            break;
            default:
            System.out.println("Opção inválida.");
        }

        // Pausa para o usuário visualizar o resultado
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }







}
