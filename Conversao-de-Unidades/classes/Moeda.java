package classes;

import java.util.Scanner;

public class Moeda extends Unidade {

    public Moeda(float medida_Atual){
        super(medida_Atual);
    }

    public static Moeda setValor(Scanner scanner){
        Moeda.clear_terminal();
        float valor = Moeda.lerValor(scanner, "Adicione o valor a ser convertido: \n", false);
        return new Moeda(valor);
    }


    public void Real_para_Dolar() {
        float valorReal = getTempAtual();
        float valorDolar = valorReal * 0.167f; // 1 BRL = 0.167 USD
        setTemp_Convertida(valorDolar);
        System.out.printf("Conversão: %.2f reais equivalem a %.2f dólares.%n", valorReal, valorDolar);
        System.out.println("Conversão realizada: Real para Dólar.");
    }

    public void Dolar_para_Real() {
        float valorDolar = getTempAtual();
        float valorReal = valorDolar * 5.9941f; // 1 USD = 5.9941 BRL
        setTemp_Convertida(valorReal);
        System.out.printf("Conversão: %.2f dólares equivalem a %.2f reais.%n", valorDolar, valorReal);
        System.out.println("Conversão realizada: Dólar para Real.");
    }

    public void Real_para_Euro() {
        float valorReal = getTempAtual();
        float valorEuro = valorReal * 0.147f; // 1 BRL = 0.147 EUR
        setTemp_Convertida(valorEuro);
        System.out.printf("Conversão: %.2f reais equivalem a %.2f euros.%n", valorReal, valorEuro);
        System.out.println("Conversão realizada: Real para Euro.");
    }

    public void Euro_para_Real() {
        float valorEuro = getTempAtual();
        float valorReal = valorEuro * 6.8016f; // 1 EUR = 6.8016 BRL
        setTemp_Convertida(valorReal);
        System.out.printf("Conversão: %.2f euros equivalem a %.2f reais.%n", valorEuro, valorReal);
        System.out.println("Conversão realizada: Euro para Real.");
    }

    public void Real_para_Libra() {
        float valorReal = getTempAtual();
        float valorLibra = valorReal * 0.130f; // 1 BRL = 0.130 GBP
        setTemp_Convertida(valorLibra);
        System.out.printf("Conversão: %.2f reais equivalem a %.2f libras.%n", valorReal, valorLibra);
        System.out.println("Conversão realizada: Real para Libra.");
    }

    public void Libra_para_Real() {
        float valorLibra = getTempAtual();
        float valorReal = valorLibra * 7.7147f; // 1 GBP = 7.7147 BRL
        setTemp_Convertida(valorReal);
        System.out.printf("Conversão: %.2f libras equivalem a %.2f reais.%n", valorLibra, valorReal);
        System.out.println("Conversão realizada: Libra para Real.");
    }

    // Conversões entre moedas estrangeiras
    public void Dolar_para_Euro() {
        float valorDolar = getTempAtual();
        float valorEuro = valorDolar * 0.8815f; // 1 USD = 0.8815 EUR
        setTemp_Convertida(valorEuro);
        System.out.printf("Conversão: %.2f dólares equivalem a %.2f euros.%n", valorDolar, valorEuro);
        System.out.println("Conversão realizada: Dólar para Euro.");
    }

    public void Euro_para_Dolar() {
        float valorEuro = getTempAtual();
        float valorDolar = valorEuro * 1.1345f; // 1 EUR = 1.1345 USD
        setTemp_Convertida(valorDolar);
        System.out.printf("Conversão: %.2f euros equivalem a %.2f dólares.%n", valorEuro, valorDolar);
        System.out.println("Conversão realizada: Euro para Dólar.");
    }

    public void Dolar_para_Libra() {
        float valorDolar = getTempAtual();
        float valorLibra = valorDolar * 0.7785f; // 1 USD = 0.7785 GBP
        setTemp_Convertida(valorLibra);
        System.out.printf("Conversão: %.2f dólares equivalem a %.2f libras.%n", valorDolar, valorLibra);
        System.out.println("Conversão realizada: Dólar para Libra.");
    }

    public void Libra_para_Dolar() {
        float valorLibra = getTempAtual();
        float valorDolar = valorLibra * 1.2845f; // 1 GBP = 1.2845 USD
        setTemp_Convertida(valorDolar);
        System.out.printf("Conversão: %.2f libras equivalem a %.2f dólares.%n", valorLibra, valorDolar);
        System.out.println("Conversão realizada: Libra para Dólar.");
    }

    public void Euro_para_Libra() {
        float valorEuro = getTempAtual();
        float valorLibra = valorEuro * 0.8832f; // 1 EUR = 0.8832 GBP
        setTemp_Convertida(valorLibra);
        System.out.printf("Conversão: %.2f euros equivalem a %.2f libras.%n", valorEuro, valorLibra);
        System.out.println("Conversão realizada: Euro para Libra.");
    }

    public void Libra_para_Euro() {
        float valorLibra = getTempAtual();
        float valorEuro = valorLibra * 1.1322f; // 1 GBP = 1.1322 EUR
        setTemp_Convertida(valorEuro);
        System.out.printf("Conversão: %.2f libras equivalem a %.2f euros.%n", valorLibra, valorEuro);
        System.out.println("Conversão realizada: Libra para Euro.");
    }

public static void Menu(Scanner scanner) {
        Moeda.clear_terminal();
        System.out.println("\n=== CONVERSOR DE MOEDA ===");
        System.out.println("Selecione o tipo de conversão:");
        System.out.println("--------------------------------");
        System.out.println("1. Real -> Dólar");
        System.out.println("2. Dólar -> Real");
        System.out.println("3. Real -> Euro");
        System.out.println("4. Euro -> Real");
        System.out.println("5. Real -> Libra");
        System.out.println("6. Libra -> Real");
        System.out.println("7. Dólar -> Euro");
        System.out.println("8. Euro -> Dólar");
        System.out.println("9. Dólar -> Libra");
        System.out.println("10. Libra -> Dólar");
        System.out.println("11. Euro -> Libra");
        System.out.println("12. Libra -> Euro");
        System.out.println("--------------------------------");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("\nDigite a opção desejada: ");
        
        String input = scanner.nextLine();
        Moeda moeda;
        switch (input) {
            case "1":
                moeda = Moeda.setValor(scanner);
                moeda.Real_para_Dolar();
                break;
            case "2":
                moeda = Moeda.setValor(scanner);
                moeda.Dolar_para_Real();
                break;
            case "3":
                moeda = Moeda.setValor(scanner);
                moeda.Real_para_Euro();
                break;
            case "4":
                moeda = Moeda.setValor(scanner);
                moeda.Euro_para_Real();
                break;
            case "5":
                moeda = Moeda.setValor(scanner);
                moeda.Real_para_Libra();
                break;
            case "6":
                moeda = Moeda.setValor(scanner);
                moeda.Libra_para_Real();
                break;
            case "7":
                moeda = Moeda.setValor(scanner);
                moeda.Dolar_para_Euro();
                break;
            case "8":
                moeda = Moeda.setValor(scanner);
                moeda.Euro_para_Dolar();
                break;
            case "9":
                moeda = Moeda.setValor(scanner);
                moeda.Dolar_para_Libra();
                break;
            case "10":
                moeda = Moeda.setValor(scanner);
                moeda.Libra_para_Dolar();
                break;
            case "11":
                moeda = Moeda.setValor(scanner);
                moeda.Euro_para_Libra();
                break;
            case "12":
                moeda = Moeda.setValor(scanner);
                moeda.Libra_para_Euro();
                break;
            case "0":
                break;
            default:
                System.out.println("Opção inválida.");
        }
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }
    
}
