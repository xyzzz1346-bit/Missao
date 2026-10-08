public abstract class Veiculo {

    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract double calcularAluguel(int dias);

    public abstract String getTipo();
}