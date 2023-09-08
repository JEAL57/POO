package pkg060923;

import exercise.Persona;

public class Main {

    public static void main(String[] args) {
        
        int limitObjet = 3;
        Persona[] arrayPerson = new Persona[limitObjet];
        
        //Instancia
        arrayPerson[0] = new Persona("Juanes", "5716", "Colombia");
        arrayPerson[1] = new Persona("Axel", "1747", "Venezuela");
        
        for(Persona persona : arrayPerson){
            System.out.println("Name:"+ persona.getName());
            System.out.println("ID:"+ persona.getId());
            System.out.println("Country:"+ persona.getCountry());
        }
    }
}
