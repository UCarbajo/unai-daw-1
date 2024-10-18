package herencia;

public class Alumno extends Persona{
	
	private String numAlumno;

	
	
	public Alumno(String nombre, String apellidos, String dni, String email, String numeroTelefono, String numAlumno) {
		super(nombre, apellidos, dni, email, numeroTelefono);
		this.numAlumno = numAlumno;
	}

	public String getNumAlumno() {
		return numAlumno;
	}

	public void setNumAlumno(String numAlumno) {
		this.numAlumno = numAlumno;
	}
}
