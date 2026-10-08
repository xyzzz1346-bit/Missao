public class Main {

    public static void main(String[] args) {

        SistemaAluguel sistema = new SistemaAluguel();

        Veiculo carro = new Carro("Toyota Corolla");
        Veiculo moto = new moto("Honda CB 500");

        sistema.calcularAluguel(carro, 5);
        sistema.calcularAluguel(moto, 5);
    }
}