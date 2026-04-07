public class ClienteFrecuente extends Cliente {
    private int numeroCompras;

    public ClienteFrecuente() {
    }

    public ClienteFrecuente(String nombre, int identificacion, double valorCompra, int numeroCompras) {
        super(nombre, identificacion, valorCompra);
        this.numeroCompras = numeroCompras;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    @Override
    public String toString() {
        return super.toString() + "ClienteFrecuente{" +
                "numeroCompras=" + numeroCompras +
                '}';
    }
}
