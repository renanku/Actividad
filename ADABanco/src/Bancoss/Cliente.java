package Bancoss;
public class Cliente {
    private String nombre;
    private int edad;
    private String genero;
    private String transaccion;
    private String Turno;

    public Cliente(String nombre, int edad, String genero, String transaccion,String Turno) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.transaccion = transaccion;
        this.Turno = Turno;
    }

    public String gettransaccion() {
        return transaccion;
    }

    public void settransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public String getTurno() {
		return Turno;
	}

	public void setTurno(String turno) {
		Turno = turno;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
