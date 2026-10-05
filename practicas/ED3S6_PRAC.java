package com.mycompany.ed3s6_prac;

/**
 *
 * @author Tesoem
 */
public class ED3S6_PRAC {

    public static void main(String[] args) {
        DetectaTipo<Integer, Integer> obj1= new DetectaTipo<>(5,3);
        DetectaTipo<Double, Double> obj2= new DetectaTipo<>(5.5,3.2);
        DetectaTipo<String , String> obj3= new DetectaTipo<>("Hola" , "Mundo");
        DetectaTipo<Float, Float> obj4= new DetectaTipo<>(5.5f,3.2f);
        DetectaTipo<Character, Character> obj5= new DetectaTipo<>('A','B'); 
         
    }
}