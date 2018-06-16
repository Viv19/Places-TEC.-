package placestec;
import placestec.gestionDestino;
public class gestionSitiosInteres {
//CLASE PARA BUSCAR Y MOSTRAR LOS SITIOS DE INTERÉS DE UN DESTINO
    
    
   // API_KEY = 'AIzaSyB6pqdb7fL7E7ymHrcA0JlcOweLylkQLTQ';
    
    
    //ATRIBUTOS PERTENECIENTES A LA CLASE
    public  sitio sitiosInteres; 
    private int radio;
    public gestionDestino gestionD = new gestionDestino();
    
    //MÉTODOS DE LA CLASE
    public void buscarSitios(){
        //MÉTODO QUE VA CONECTADO CON EL API PARA ENCONTRAR LOS SITIOS DE INTERÉS 
        //DE UN DESTINO DE ACUERDO AL RADIO INGRESADO POR EL USUARIO
        //AL ENCONTRAR UN DESTINOS CREARÁ OBTJETOS DE SITIO Y LOS INGRESARÁ A LA ESTRUCTURA
        //if(){ //IF QUE VA CONECTADO CON EL RADIO BUTTON, EL USUARIO PUEDE SELECCIONAR UNA O VARIAS OPCIONES
        //sitiosInteres = new sitio("", 0, "", "", "", destino destino); //LLENAR CON LOS DATOS ENCONTRADOS
        //INGRESAR A LA ESTRUCTURA
    }
    
    //MÉTODO PARA MOSTRAR TODOS LOS SITIOS ENCONTRADOS A PARTIR DE UN DESTINO, +
    //SU RADIO INGRESADO POR EL USUARIO Y LA ESCOGENCIA DE LUGAR/LUGARES PREFERIDOS
    public sitio mostrarSitios(){
        //RECORRE LA ESTRUCTURA, RETORNA Y VISUALIZA LOS SITIOS DE INTERÉS ENCONTRADOS
        return sitiosInteres;
    }
}
