package Main;

import static spark.Spark.*;
import com.google.gson.Gson;

import java.util.LinkedList;

import Models.Vehiculo;
import Models.Automovil;
import Models.Motocicleta;

/**
 *
 * @author 104622020680 - Juan Esteban Alarcon Lasso 
 */
public class Main {

    public static void main(String[] args) {
        
        /*
        * Esto nos sirve para generar un formato json para retornar la data del array
        * sin tener que acomodarla bonita de manera manual
        */
        Gson gson = new Gson();
        
        LinkedList <Vehiculo> automoviles = new LinkedList<>();
        LinkedList <Vehiculo> motos = new LinkedList<>();
        
        // Automovil creado por defecto
        Automovil auto = new Automovil(4, "Mazda", "3", "ZYX987", "12:40", "03:59");
        automoviles.add(auto);
        
        Motocicleta moto = new Motocicleta("Honda", "CBR600", "XYZ789", 600, "02:00", "05:40");
        motos.add(moto);
        
        // Definir endpoints
        // Listado de automovile
        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });
        
        // Guardar automovil
        // endpoint GET para agregar un automóvil
        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas/:horaIngreso/:horaSalida", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params("horaIngreso");
            String horaSalida = req.params("horaSalida");
            
            // No olvidar convertir en integer los string numericos que llegan por url
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));

            // Crear un nuevo automóvil y agregarlo al parqueadero
            Automovil nuevoAuto = new Automovil(numeroPuertas, marca, modelo, placa, horaIngreso, horaSalida);
            automoviles.add(nuevoAuto);

            return gson.toJson(nuevoAuto);
        });
        
        // Listado de motos
        get("/motos", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });
        
        // Guardar moto
        // endpoint GET para agregar una moto
        get("/agregarMoto/:marca/:modelo/:placa/:cilindrada/:horaIngreso/:horaSalida", (req, res) -> {
            
            // Añadimos esto para retornar en formato Json
            res.type("application/json");

            // Obtener parámetros de la URL
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            String horaIngreso = req.params("horaIngreso");
            String horaSalida = req.params("horaSalida");
            
            int cilindrada = Integer.parseInt(req.params(":cilindrada"));

            // Crear una nueva moto y agregarlo al parqueadero
            Motocicleta nuevaMoto = new Motocicleta(marca, modelo, placa, cilindrada, horaIngreso, horaSalida);
            motos.add(nuevaMoto);

            return gson.toJson(nuevaMoto);
        });
        
        
        
    }
}