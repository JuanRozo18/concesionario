public class EmpleadoDePlanta extends Empleado {
    private Double SalarioFijo;

    public EmpleadoDePlanta() {
    }

    public EmpleadoDePlanta(String edad, String nombre, Double salarioFijo) {
        super(edad, nombre);
        this.SalarioFijo = salarioFijo;
    }

    public Double getSalarioFijo() {
        return this.SalarioFijo;
    }

    public void setSalarioFijo(Double salarioFijo) {
        this.SalarioFijo = salarioFijo;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "EmpleadoDePlanta{SalarioFijo=" + this.SalarioFijo + "}";
    }
}
