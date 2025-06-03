package classes;


public abstract class Unidade {
    private float temp_Atual;
    private float temp_Convertida = 0;

    public Unidade(float temp_Atual){
        this.temp_Atual = temp_Atual;
        
        
    }



    public void setTemp_Convertida(float temp_Convertida) {
        this.temp_Convertida = temp_Convertida;
    }



    public static void clear_terminal() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar o terminal.");
        }
    }




    protected static float lerValor(java.util.Scanner scanner, String mensagem, boolean cond) {
        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextFloat()) {
                float valor = scanner.nextFloat();
                scanner.nextLine(); // Limpa o buffer
                if (cond) { // Temperatura: aceita qualquer valor float
                    return valor;
                } else { // Medida: só aceita positivo
                    if (valor > 0) {
                        return valor;
                    } else {
                        System.out.println("\nValor inválido, digite um número positivo.");
                    }
                }
            } else {
                System.out.println("Valor inválido, tente novamente.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }




    public float getTempAtual() {
    return temp_Atual;
}

    public float getTempConvertida() {
    return temp_Convertida;
}
}