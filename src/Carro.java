public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularAluguel(int dias) {
        return dias * 120.0;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}