public class Empleado {
    protected String Nombre;
    protected String Edad;

    public Empleado() {
    }

    public Empleado(String edad, String nombre) {
        this.Edad = edad;
        this.Nombre = nombre;
    }

    public double CalcularSalario(double pago) {
        pago = 2.0;
        return 2.0;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getEdad() {
        return this.Edad;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setEdad(String edad) {
        this.Edad = edad;
    }

    public String toString() {
        return "Empleado{Nombre='" + this.Nombre + "', Edad='" + this.Edad + "'}";
    }
}
