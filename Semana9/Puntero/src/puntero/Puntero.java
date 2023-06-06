package puntero;


public class Puntero {


    public static void main(String[] args) {
        
        Persona personaA;
        Persona personaB;
        
        personaA = new Persona("Ana",22);
        personaB = new Persona("Juan",25);
        System.out.println("PersonaA:" + personaA);
        System.out.println("PersonaB:" + personaB);
        
        Persona personaC;
        personaC = new Persona("Kevin",22);
        System.out.println("PersonaC" + personaC);
        
        personaC = personaA;
        System.out.println("PersonaC" + personaC);
        
        personaA.cambiarDatos("Doris",33);
        personaA.mostrarDatos();
        
    }
    
}
