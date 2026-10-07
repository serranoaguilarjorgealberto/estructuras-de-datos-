/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed3s6_ejem3;

/**
 *
 * @author citla
 */
public class TipoDato <T> {
    T dato;
    public TipoDato(T dato){
        this.dato=dato;
    }
    public void MostrarDato(){
        System.out.println("el tipo de dato es" + dato.getClass().getName());
        System.out.println("el valor contenido es" + dato);
    }
}
