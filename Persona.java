public class Persona {
    //Todas las personas pueden hacer muchas cosas, las personas tienen nombre, edad
    //etc, asi que vamos a simular algunas actividades mediante metodos.

    //Una buena practica es declarar variables en la parte mas alta del codigo

    int edad = 20;

    void mayorDeEdad(){
       if (edad > 18){
           System.out.println("Eres un mayor de edad :D");
       }else{
           System.out.println("Eres un menor de edad :c");


       }
    }

    void descansar(boolean estaCansado){
        if(estaCansado){
            System.out.println("Vete a dormir u.u ");
        }else{
            System.out.println("Sigue practicando codigo >: ");
        }

    }
}
