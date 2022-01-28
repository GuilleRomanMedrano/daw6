package daw_6;

public class DatosAlumno {
	private String nombre;
	private String apellidos;
	private String dni;
	private String asignatura;
	private String tarea;
	
	/*
	 * Constructor por defecto
	 * 
	 * 
	 */
	public DatosAlumno() {
		super();
	}

	/*
	 * Constructor con parámetros
	 * @param nombre nombre del alumno
	 * @param apellidos apellidos del alumno
	 * @param dni dni del alumno
	 * @param asignatura asignatura de la tarea
	 * @param tarea nombre de la tarea
	 */
	public DatosAlumno(String nombre, String apellidos, String dni, String asignatura, String tarea) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.asignatura = asignatura;
		this.tarea = tarea;
	}

	/*
	 * Devuelve el nombre del alumno
	 * @return nombre nombre del alumno.
	 */
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*
	 * Devuelve los apellidos del alumno
	 *
	 * @return apellidos apellidos del alumno
	 */

	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/*
	 * Devuelve el dni del alumno
	 * @return dni dni del alumno
	 */
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	/*
	 * Devuelve la asignatura de la tarea
	 * @return asignatura nombre de la asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	/*
	 * Devuelve nombre de tarea
	 * @return tarea nombre de la tarea
	 */
	public String getTarea() {
		return tarea;
	}


	public void setTarea(String tarea) {
		this.tarea = tarea;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
