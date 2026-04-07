public class Cliente {
    protected String nombre;
    protected int Identificacion;
    protected double valorCompra;


    public Cliente() {
    }

    public Cliente(String nombre, int identificacion, double valorCompra) {
        this.nombre = nombre;
        Identificacion = identificacion;
        this.valorCompra = valorCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", Identificacion=" + Identificacion +
                ", valorCompra=" + valorCompra +
                '}';
    }

    public double calcularValorCompra(double valorCompra){
        return valorCompra;
    }
}

