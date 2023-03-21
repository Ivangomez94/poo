package pracexam;

public class demo {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Martin", "Gomez", "san123", new Mascota("doberman"));
        Mascota mascota1= new Mascota("caniche");

        System.out.println(persona1.getNombre());
        System.out.println(mascota1.getRaza());
        System.out.println(persona1.verRaza());


    }
}
