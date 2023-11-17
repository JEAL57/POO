package Models;

/**
 *
 * @author 104622020680 - Juan Esteban Alarcon Lasso 
 */
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private String horaIngreso;
    private String horaSalida;

    // Constructores, getters y setters    
    public Automovil(int numeroPuertas, String marca, String modelo, String placa, String horaIngreso, String horaSalida) {
        super(marca, modelo, placa);
        this.numeroPuertas = numeroPuertas;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    // Otros métodos específicos para automóviles

    
}