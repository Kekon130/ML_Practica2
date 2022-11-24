public class Alumno {

    private String nombre;
    private String apellido;
    private String dni;
    private int notaMedia;

    public Alumno() {
        nombre = "Eva";
        apellido = "Nose";
        dni = "A ti que te importa";
        notaMedia = 8;
    }

    public Alumno(String nombre, String apellido, String dni, int notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.notaMedia = notaMedia;
    }

    public void imprimirAlumno(){
        System.out.println("Hola me llamo " + this.nombre + " " + this.apellido + " con dni " + this.dni + " y mi nota media es " + this.notaMedia);
    }
}
