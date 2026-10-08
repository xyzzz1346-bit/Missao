public class moto extends Veiculo {

    public moto(String modelo) {
        super(modelo);
    }

    @Override
    public double calcularAluguel(int dias) {
        return dias * 60.0;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}