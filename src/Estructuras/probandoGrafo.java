/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.Grafo;
import static Interfaz.Inicio.Ventana;
import placestec.destino;

/**
 *
 * @author Daniela
 */
public class probandoGrafo {
//CLASE CREADA PARA PRUEBAS DE CONEXIÓN ENTRE INTERFAZ Y CÓDIGO, NO POSEE EL API
    //NOMBRO AL GRAFO
    Grafo grafo;
            
    //NOMBRO LOS OBJETOS DE DESTINO
    destino destino1;
    destino destino2;
    destino destino3;
    destino destino4;
    destino destino5;
    destino destino6;
    
    
   public Grafo creandoGrafo(){
        grafo = new Grafo(); //GRAFO DE DESTINOS
       //DESTINOS PERTENECIENTES AL GRAFO
        destino1 = Ventana.formandoDestinos();
        destino2 = new destino(55555, -3333, "COL", "Motoneta", "28 de junio", "03 de febrero");
        destino3 = new destino(00000, -0000, "EEUU", "Triciclo", "05 de marzo", "04 de julio");
        destino4 = new destino(99999, -4444, "GT", "Bicicleta", "08 de agosto", "01 de enero");
        destino5 = new destino(77777, -4444, "MX", "Caminando", "10 de febrero", "03 de diciembre");
        destino6 = new destino(44444, -2222, "VZ", "Avión", "05 de setiembre", "19 de mayo");

        //Prueba en grafo conexo

//        g.agregarVertice(3);
//        g.agregarVertice(4);
//        g.agregarVertice(5);
//
//        g.agregarArista(1,1,0);
//        g.agregarArista(1,2,0);
//        g.agregarArista(1,4,0);
//        g.agregarArista(2,1,0);
//        g.agregarArista(2,2,0);
//        g.agregarArista(2,3,0);
//        g.agregarArista(2,5,0);
//        g.agregarArista(3,2,0);
//        g.agregarArista(3,4,0);
//        g.agregarArista(4,1,0);
//        g.agregarArista(4,3,0);
//        g.agregarArista(4,5,0);
//        g.agregarArista(5,2,0);
//        g.agregarArista(5,4,0);
//
//        g.eliminarVertice(2);
//        g.eliminarArista(4,5);

        //Prueba en grafo NO conexo
        
       grafo.agregarVertice(1, destino1);
       grafo.agregarVertice(2, destino2);
       grafo.agregarVertice(3, destino3);
        grafo.agregarVertice(4, destino4);
        grafo.agregarVertice(5, destino5);
        grafo.agregarVertice(6, destino6);

        grafo.agregarArista(1, 2, 0);
        grafo.agregarArista(1, 3, 0);
        grafo.agregarArista(2, 1, 0);
        grafo.agregarArista(2, 4, 0);
        grafo.agregarArista(3, 1, 0);
        grafo.agregarArista(3, 4, 0);
        grafo.agregarArista(4, 2, 0);
        grafo.agregarArista(4, 3, 0);
        grafo.agregarArista(5, 6, 0);
        grafo.agregarArista(6, 5, 0);

        grafo.imprimeGrafo();
        grafo.recorridoProfundidad(1);
        grafo.recorridoAnchura(1);   
        return grafo;
}
   public String fechaDestino(){ //METODO QUE DESDE EL GRAFO TOMA LOS DATOS DEL DESTINO QUE SE MUESTRA EN LA RUTA
       return Ventana.formandoDestinos().destinoFecha();
   }
   public String lugarDestino(){
       return Ventana.formandoDestinos().getDireccion();
   }
}
