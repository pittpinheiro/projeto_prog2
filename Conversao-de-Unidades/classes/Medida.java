package classes;

import java.util.Scanner;

public class Medida extends Unidade {

    public Medida(float medida_Atual){
        super(medida_Atual);
    }

    public static Medida setValor(Scanner scanner){
        Medida.clear_terminal();
        float valor = Medida.lerValor(scanner, "Adicione o valor a ser convertido: \n", false);
        return new Medida(valor);

    }

    public void Metros_para_Centimetros() {
        float atual = getTempAtual();
        float convertido = atual * 100;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f centímetros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Metros_para_Milimetros() {
        float atual = getTempAtual();
        float convertido = atual * 1000;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f milímetros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Metros_para_Polegadas() {
        float atual = getTempAtual();
        float convertido = atual * 39.3701f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f polegadas.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Metros_para_Pes() {
        float atual = getTempAtual();
        float convertido = atual * 3.28084f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f metros equivalem a %.2f pés.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Centimetros_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 100;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f centímetros equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Milimetros_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 1000;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f milímetros equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Polegadas_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 39.3701f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f polegadas equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }

    public void Pes_para_Metros() {
        float atual = getTempAtual();
        float convertido = atual / 3.28084f;
        setTemp_Convertida(convertido);
        System.out.printf("Conversão: %.2f pés equivalem a %.2f metros.%n", atual, convertido);
        System.out.println("Conversão realizada: Celsius para Fahrenheit.");
    }
    

    public static void Menu(Scanner scanner) {
        Medida.clear_terminal();
        System.out.println("\n=== CONVERSOR DE MEDIDAS ===");
        System.out.println("Selecione o tipo de conversão:");
        System.out.println("--------------------------------");
        System.out.println("1. Metros - Centímetros");
        System.out.println("2. Metros - Milímetros");
        System.out.println("3. Metros - Polegadas");
        System.out.println("4. Metros - Pés");
        System.out.println("--------------------------------");
        System.out.println("5. Centímetros - Metros");
        System.out.println("6. Milímetros - Metros");
        System.out.println("7. Polegadas - Metros");
        System.out.println("8. Pés - Metros");
        System.out.println("--------------------------------");
        System.out.println("0. Voltar ao menu principal");
        System.out.print("\nDigite a opção desejada: ");

        String input = scanner.nextLine();
        Medida medida;

        switch (input) {
            case "1":
            medida = Medida.setValor(scanner);
            medida.Metros_para_Centimetros();
            break;
            case "2":
            medida = Medida.setValor(scanner);
            medida.Metros_para_Milimetros();
            break;
            case "3":
            medida = Medida.setValor(scanner);
            medida.Metros_para_Polegadas();
            break;
            case "4":
            medida = Medida.setValor(scanner);
            medida.Metros_para_Pes();
            break;
            case "5":
            medida = Medida.setValor(scanner);
            medida.Centimetros_para_Metros();
            break;
            case "6":
            medida = Medida.setValor(scanner);
            medida.Milimetros_para_Metros();
            break;
            case "7":
            medida = Medida.setValor(scanner);
            medida.Polegadas_para_Metros();
            break;
            case "8":
            medida = Medida.setValor(scanner);
            medida.Pes_para_Metros();
            break;
            case "0":
            // Voltar ao menu principal
            break;
            default:
            System.out.println("Opção inválida.");
        }
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    



    
}
