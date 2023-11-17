package Models;

/**
 *
 * @author 104622020680 - Juan Esteban Alarcon Lasso 
 */
    public class Motocicleta extends Vehiculo {
        private int cilindrada;
        private String horaIngreso;
        private String horaSalida;

    // Constructores, getters y setters
    public Motocicleta(String marca, String modelo, String placa, int cilindrada, String horaIngreso, String horaSalida) {
        super(marca, modelo, placa);
        this.cilindrada = cilindrada;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }
    
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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
    
    // Otros métodos específicos para motocicletas

    

}