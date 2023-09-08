package pkg060923;

import exercise.Persona;

public class Main {

    public static void main(String[] args) {
        
        int limitObjet = 3;
        Persona[] arrayPerson = new Persona[limitObjet];
        
        //Instancia | Generar un ciclo para guardar estos datos en los limites q el programa defina ingresando todo por teclado
        arrayPerson[0] = new Persona("Juanes", "5716", "Colombia");
        
        
        for(Persona persona : arrayPerson){
            System.out.println("Name:"+ persona.getName());
            System.out.println("ID:"+ persona.getId());
            System.out.println("Country:"+ persona.getCountry());
        }
    }
}
