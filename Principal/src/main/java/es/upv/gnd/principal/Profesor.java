package es.upv.gnd.principal;

/* al utilizar extends es una herencia, por eso cre un constructor y llamo al constructor "padre"*/
public class Profesor extends Persona{
    public Profesor (String nombre, int edad){ /*creo constructor*/

        super(nombre, edad);/*llamo constructor persona*/
        this.asignatura = asignatura;
    }

    public void mostrar(){
        System.out.println("Me llamo "+this.nombre+" y doy" +
                " la asignatura "+this.asignatura);
    }
}
