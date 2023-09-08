package exercise;


public class Persona {
    //Atributos
    private String name;
    private String id;
    private String country;
    
    //Constructores
    //Sin parámetros
    public Persona(){
        
    }
    
    //Parametrizado
    public Persona(String name, String id, String country){
        this.name = name;
        this.id = id;
        this.country = country;
    }
    
    //Set y Get
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
