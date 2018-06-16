/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.LinkedList;
import placestec.destino;

/**
 *
 * @author Daniela
 */

public class NodoVertice {
    
    public int vertice;                    //Almacena el dato del vértice
    public boolean visitado;            //Indica si el vértice ha sido visitado o no
    public destino destino;             //CREO UN OBJETO DESTINO PARA QUE ME ALMACENE MI LUGAR DE DESTINO EN EL NODO
    public LinkedList<NodoGrafo> aristas;    //Almacena la lista de aristas del vértice

    public NodoVertice() {
        this.vertice = 0;
        this.destino = null;      //NO SE RECIBE UN VALOR PARA EL ATRIBUTO DE DESTINO
        this.visitado = false;
        this.aristas = new LinkedList<NodoGrafo>();
    }//fin del constructor Nodo

    public NodoVertice(int v, destino destino) {
        this.vertice = v;
        this.destino = destino;   //MI DESTINO ACTUAL (ERA NULL) AHORA ES EL OBJETO DESTINO QUE RECIBO
        this.visitado = false;
        this.aristas = new LinkedList<NodoGrafo>();
    }//fin del constructor Nodo
    
    public String datosNodo(){
        return "Valor del vértice "+this.vertice+", datos del destino: "+this.destino.datosDestino(); 
        //RETORNA  LOS DATOS DEL NODO, EL INT DE SU VÉRTICE Y LOS DATOS GUARDADOS EN EL DESTINO
        
    }
    public String aCadena() {
        return "|" + this.vertice + "|" + "|->";
    }//fin método aCadena
    
    
}
