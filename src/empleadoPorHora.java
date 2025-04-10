public class empleadoPorHora extends Empleado {
    private double PagoHoras;
    private int HorasTrabajadas;

    public empleadoPorHora() {
    }

    public empleadoPorHora(String edad, String nombre) {
        super(edad, nombre);
    }

    public double getPagoHoras() {
        return this.PagoHoras;
    }

    public int getHorasTrabajadas() {
        return this.HorasTrabajadas;
    }

    public void setPagoHoras(double pagoHoras) {
        this.PagoHoras = pagoHoras;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.HorasTrabajadas = horasTrabajadas;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "EmpleadoPorHoras{PagoHoras=" + this.PagoHoras + ", HorasTrabajadas=" + this.HorasTrabajadas + "}";
    }
}