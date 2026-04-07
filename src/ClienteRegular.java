public class ClienteRegular  extends Cliente{

    public ClienteRegular() {
    }

    public ClienteRegular(String nombre, int identificacion, double valorCompra) {
        super(nombre, identificacion, valorCompra);
    }

    @Override
    public String toString() {
        return "ClienteRegular{" +
                "nombre='" + nombre + '\'' +
                ", Identificacion=" + Identificacion +
                ", valorCompra=" + valorCompra +
                '}';
    }
}


