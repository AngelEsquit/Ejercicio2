public class Habitacion {
    private int numHabitacion;
    private int nivelHabitacion;
    private int capacidad;
    private int precioNoche;
    private Boolean asignada = false;

    public void setAsignada(Boolean asignada) {
        this.asignada = asignada;
    }

    public Boolean getAsignada() {
        return asignada;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNivelHabitacion(int nivelHabitacion) {
        this.nivelHabitacion = nivelHabitacion;
    }
    
    public int getNivelHabitacion() {
        return nivelHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }
}
