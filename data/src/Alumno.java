public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int grado;

    Alumno(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = Integer.parseInt(edad);  // Convierte String edad a int
    }

    // Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {  // Cambia String a int en el return type
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
