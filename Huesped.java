public class Huesped {
    private String nombreHuesped;
    private String email;
    private int numPersonas;
    private int nivelHuesped;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public void setNivelHuesped(int nivelHuesped) {
        this.nivelHuesped = nivelHuesped;
    }

    public int getNivelHuesped() {
        return nivelHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }
}
