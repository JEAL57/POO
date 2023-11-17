package Models;

/**
 *
 * @author 104622020680 - Juan Esteban Alarcon Lasso 
 */
    public class Vehiculo {
        private String marca;
        private String modelo;
        private String placa;

    // Constructores, getters y setters
    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    // Otros métodos específicos si es necesario
    
}