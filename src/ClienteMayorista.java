public class ClienteMayorista extends Cliente{
    private int cantidadProductos;

    public ClienteMayorista() {
    }

    public ClienteMayorista(String nombre, int identificacion, double valorCompra, int cantidadProductos) {
        super(nombre, identificacion, valorCompra);
        this.cantidadProductos = cantidadProductos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public String toString() {
        return "ClienteMayorista{" +
                "cantidadProductos=" + cantidadProductos +
                '}';
    }
}


