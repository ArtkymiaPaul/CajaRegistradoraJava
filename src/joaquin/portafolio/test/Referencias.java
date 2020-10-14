package joaquin.portafolio.test;

public class Referencias {
    public static  void main(String[] args){
        Persona persona = new Persona();
        persona.nombre = "Paul";
        persona.edad = 27;
        Persona otraPersona = persona;
        otraPersona.nombre = "Karol";
        otraPersona.edad = 20;

        Persona segundaPersona = new Persona();
        try {
            segundaPersona = persona.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        segundaPersona.nombre = "Pedro";

        System.out.println(persona.nombre);
        System.out.println(otraPersona.nombre);
        System.out.println(segundaPersona.nombre);
    }
}
