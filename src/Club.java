import java.util.List;

public class Club {

	private String nombre;
	private String fundacion;
	private List<Equipo> equipos;

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}


	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFundacion() {
		return this.fundacion;
	}
	public void setFundacion(String fundacion) {
		this.fundacion = fundacion;
	}
	public void generarEquipos(Equipo equipo){
		equipos.add(equipo);
		System.out.println("equipo agregado");
	}
}