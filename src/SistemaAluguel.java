public class SistemaAluguel {

    public void calcularAluguel(Veiculo veiculo, int dias) {

        double total = veiculo.calcularAluguel(dias);

        System.out.println(veiculo.getTipo() + ": " + veiculo.getModelo());
        System.out.println("Total do aluguel: R$ " + total);
        System.out.println("[LOG] Aluguel processado com sucesso.\n");
    }
}