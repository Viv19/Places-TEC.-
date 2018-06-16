package placestec;

    //EN ESTA CLASE ES POSIBLE GESTIONAR LOS DESTINOS MEDIANTE CONSULTAS, VISUALIZACIÓN
    //ELIMINACIÓN Y MODIFICACIÓN

public class gestionDestino{
    
    //ATRIBUTO PARA ALMACENAR UN DESTINO 
    public destino destino;
    
    //MÉTODOS DE LA GESTIÓN DE DESTINOS CON LA UTILIZACIÓN DEL API
    public void BuscarDestino(String dato){
        //BUSCA EL DESTINO CON EL API POR MEDIO DE DIRECCIÓN O COORDENADAS
        destino = new destino(0, 0, "", "", "", ""); //VAN LOS DATOS ENCONTRADOS. 
        //AL ENCONTRAR EL DESTINO DEBEN APARECER LOS DATOS ENCONTRADOS JUNTO CON 
        //INGRESADOS POR EL USUARIO, ES DECIR, FECHAS, MODO DE DESLAZAMIENTO Y EL 
        //DATO QUE USÓ PARA ENCONTRAR EL DESTINO CON EL API
        //***SE INGRESA EN LA ESTRUCTURA***
        
    }
    
    //MÉTODOS DE LA GESTIÓN DE DESTINOS CON LA UTILIZACIÓN DE LAS ESTRUCTURAS
    public destino consultarDestinosGuardados(String dato){
        //REALIZA LA BÚSQUEDA DE DESTINOS GUARDADOS POR MEDIO DE LA DIRECCIÓN, LATITUD O LONGITUD 
        if(dato.equals(destino.getDireccion())|| dato.equals(destino.getLatitud())
        || dato.equals(destino.getLongitud())){
            System.out.println("Destino encontrado "+destino); //FALTA CONECTAR CON LA ESTRUCTURA
            return destino; //EN CASO QUE LO ENCONTRARA
        }
        else{
            System.out.println("Destino no encontrado por medio de su dirección.");
            return destino; //EN CASO QUE NO LO ENCONTRARA RETORNAR TODOS 
        }
        
    }
    public boolean eliminarDestino(String dato){
        //MÉTODO PARA ELIMINAR UN DESTINO, REALIZA LA BÚSQUEDA POR MEDIO DE LA DIRECCIÓN, LATITUD O LONGITUD
        //SI LO ENCUENTRA LO ELIMINA Y RETORNA TRUE
        if(dato.equals(destino.getDireccion())|| dato.equals(destino.getLatitud())
        || dato.equals(destino.getLongitud())){
            System.out.println("Destino encontrado "+destino); //FALTA CONECTAR CON LA ESTRUCTURA
            //ELIMINAR EL DESTINO
            return true;
        }
        else{
            System.out.println("Destino no encontrado.");
            return false;
        }
    }
    public boolean modificarDestino(destino dato){
        //MÉTODO PARA MODIFICAR LOS DESTINOS GUARDADOS. REALIZA LA BÚSQUEDA DEL DESTINO 
        //QUE DESEA MODIFICAR POR MEDIO DE LA DIRECCIÓN, LATITUD O LONGITUD. 
        //RETORNA TRUE SI LO ENCUENTRA Y LO MODIFICA, SINO RETORNARÁ FALSE
        if(dato.equals(destino.getDireccion())|| dato.equals(destino.getLatitud())
            || dato.equals(destino.getLongitud())){
                System.out.println("Destino encontrado "+destino); //FALTA CONECTAR CON LA ESTRUCTURA
                //MODIFICAR EL DESTINO. LOS DATOS ANTERIORES DEBEN MOSTRARSE EN LA INTERFAZ
                return true;
            }
        else{
            System.out.println("Destino no encontrado.");
            return false;
        }
    }
    public void infoDestino(){
        System.out.println(destino.datosDestino());
    }
}