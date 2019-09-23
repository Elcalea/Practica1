package es.upv.gnd.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>(); /*creo una lista llamada lista, no le doy tamaño a esta*/

        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");

        /**otra forma de hacerlo la lista es:
        *
        * String a[] = ("hola","mundo");
        *
        * */

        /** otra forma de hacer el bucle es:
        * -bucle compacto: no se le pueden aññadir elementos más alla de su tamaño
        *
        * for(String x: lista){
        * System.out.println(x);
        *}
         *
         *
         *OTRO BUCLE: solo va con java 8
         *
         * lista.forEach(System.out::println);
         *
         *
        * */


        for (int i = 0; i< lista.size(); i++){ /* lista.size es un método por eso ()*/

            System.out.println(lista.get(i)); /*get para sacar de la lista en este tipo de array*/

        }

        /*SEGUNDO EJERCICIO MAIN*/

        Principal r = new Principal();/*creo objeto de tipo principal (como la clase) y lo llamo r*/
        r.aleatorio();

        /*-----------------EJERCICIO PERSONA-------------------------------------------------------*/

        ArrayList<Persona> P = new ArrayList<>();
        p.add(new Persona( "andres", 45)); /*cre un objeto tipo Persona y le meto los atributos que quiero*/
        p.add(new Profesor(  nombre: "andres", edad: 45, asignatura: "IOT"))*/



    }

/*segundo ejercicio: hago una lista con números aleatorios y ordenarlos*/

    public void aleatorio(){ /*creo método nuevo*/


        ArrayList<Double> lista2 = new ArrayList<Double>();

        for( int a = 0; a< 10; a++){

            Random r = new Random();/*creo variable con número aleatorio*/
            lista2.add(r.nextDouble()); /*añado a la lista ese número mientras la recorre el bucle*/
        }
      Collections.sort(lista2); /* Para ordenar de menor a mayor*/
        System.out.println(lista2);
        /**
         * OTRA MANERA:
         *
         * lista2.sort((x,y) -> x.compareTo(y));
         */

        /**
         * public static void main(String[] args) {
         *
         *         //new Principal();
         *         ArrayList<Persona> p = new ArrayList<>();
         *         p.add(new Persona("Adrian", 23));
         *         p.add(new Persona("Otro mas",34));
         *         p.add(new Profesor("Andres", 45, "IOT" ));
         *         p.add(new Alumno("Alguien", 19, 3 ));
         *
         *         for(Persona x:p){
         *             x.mostrar();
         *         }
         */



        /*esto es un cambio para git*/
    }




}
