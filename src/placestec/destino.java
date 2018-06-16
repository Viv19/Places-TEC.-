package placestec;
public class destino extends gestionDestino{
    //DECLARACIÓN DE ATRIBUTOS QUE CREAN AL DESTINO
    //INFORMACIÓN DEL DESTINO
    private int latitud;
    private int longitud;
    private String direccion;
    private String modoDesplazamiento;
    private String fechaVisita;
    private String fechaLlegada;
    public sitio sitio = null;
    
    //MÉTODO CONSTRUCTOR DE LA CLASE, NECESARIO PARA LA CREACIÓN DE UN DESTINO
    public destino(int latitud, int longitud, String direccion, 
        String modoDesplazamiento, String fechaVisita, String fechaLlegada){
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion = direccion;
        this.modoDesplazamiento = modoDesplazamiento;
        this.fechaVisita = fechaVisita;
        this.fechaLlegada = fechaLlegada;
    }
    
    //SETTER PARA TODOS LOS ATRIBUTOS DE LA CLASE
    public void setLatitud(int latitud){
        this.latitud = latitud;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setModoDesplazamiento(String modoDesplazamiento){
        this.modoDesplazamiento = modoDesplazamiento;
    }
    public void setFechaVisita(String fechaVisita){
        this.fechaVisita = fechaVisita;
    }
    public void setFechaLlegada(String fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }
    public void setSitio(sitio sitio){
        this.sitio = sitio;
    }
    
    //GETTER PARA TODOS LOS ATRIBUTOS DE LA CLASE
    public int getLatitud(){
        return this.latitud;
    }
    public int getLongitud(){
        return this.longitud;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getModoDesplazamiento(){
        return this.modoDesplazamiento;
    }
    public String getFechaVisita(){
        return this.fechaVisita;
    }
    public String getFechaLlegada(){
        return this.fechaLlegada;
    }
    public sitio getSitio(){
        return this.sitio;
    }
    public String datosDestino(){
        return "Cord: "+getLatitud()+", "+getLongitud()+
        ", direc: "+getDireccion()+", desplazamiento: "+getModoDesplazamiento()
        +", visita: "+getFechaVisita()+", llegada: "+getFechaLlegada()+".";
    }
    public String destinoFecha(){
        return" Llegada "+fechaLlegada;
    }
    public String datosDestinoConSitio(){
        return "Coordenadas: "+getLatitud()+", "+getLongitud()+
        ", dirección: "+getDireccion()+", modo de desplazamiento: "+getModoDesplazamiento()
        +", fecha de visita: "+getFechaVisita()+", fecha de llegada: "+getFechaLlegada()+"."
        +sitio.datosSitio();
    }
}