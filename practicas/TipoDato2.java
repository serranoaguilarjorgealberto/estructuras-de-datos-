/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed3s6_ejem3;

/**
 *
 * @author citla
 */
public class TipoDato2<T,U> { 
    T dato1;
    U dato2; 
    
    public TipoDato2(T dato1, U dato2 ){
        this.dato1=dato1;
        this.dato2=dato2;
    }
    public void MostrarDato(){
        System.out.println("resultado de tipo de dato2");
        System.out.println("tipo dato1" + dato1.getClass().getName());
        System.out.println("valor dato1" + dato1);
        System.out.println("tipo dato2" + dato2.getClass().getName());
        System.out.println("valor dato2" + dato2);
    }
}
