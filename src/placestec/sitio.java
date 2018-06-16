package placestec;
import placestec.gestionDestino.*;
//CLASE CON TODA LA INFORMACIÓN DE UN SITIO DE INTERÉS
public class sitio{
    //ATRIBUTOS DE UN SITIO DE INTERÉS PERTENECIENTE A UN DESTINO
   // private ATRIBUTO DE LA IMAGEN. NO SÉ QUE TIPO DE ATRIBUTO LLEVA LA IMAGEN
    private String ID;
    private int telefono;
    private String rating;
    private String horario;
    private String website;
    private destino destinoPerteneciente; 
   
    //CONSTRUCTOR DE LA CLASE, ES NECESARIO PARA LOGRAR CREAR UN SITIO DE INTERÉS
    public sitio(String ID, int telefono, String rating, String horario, String website, destino destino){
        this.ID = ID;
        this.telefono = telefono;
        this.rating = rating;
        this.horario = horario;
        this.website = website;
        this.destinoPerteneciente = destino;
    }
    //SETTER DE LOS ATRIBUTOS PERTENECIENTES A LA CLASE
    public void setID(String ID){
        this.ID = ID;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public void setWebsite(String website){
        this.website = website;
    }
    //GETTER DE LOS ATRIBUTOS PERTENECIENTES A LA CLASE
    public String getID(){
        return this.ID;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getRating(){
        return this.rating;
    }
    public String getHorario(){
        return this.horario;
    }
    public String getWebsite(){
        return this.website;
    }
    public destino destinoPertenenciente(){
        return this.destinoPerteneciente;
    }
    public String datosSitio(){
        return "Información del sitio de interés. ID: "+getID()+
        ", teléfono: "+getTelefono()+", rating: "+getHorario()+", website: "
        +getWebsite()+".";
    }
}