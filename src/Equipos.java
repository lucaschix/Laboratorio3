import java.util.List;

public class Equipo {

	private String nombres;
	private String deporte;
	private int hora;
	private List<Baquet> basquets;

	public List<Baquet> getBasquets() {
		return basquets;
	}

	public void setBasquets(List<Baquet> basquets) {
		this.basquets = basquets;
	}

	public List<Futbol> getFutbols() {
		return futbols;
	}

	public void setFutbols(List<Futbol> futbols) {
		this.futbols = futbols;
	}

	private List<Futbol> futbols;
	public String getNombres() {
		return this.nombres;
	}

	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDeporte() {
		return this.deporte;
	}

	/**
	 * 
	 * @param deporte
	 */
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public int getHora() {
		return this.hora;
	}

	/**
	 * 
	 * @param hora
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	public void getAttribute() {
		// TODO - implement Equipos.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Equipos.setAttribute
		throw new UnsupportedOperationException();
	}

	public void crearequipoFutbol( Futbol futbol){
		futbols.add(futbol);
		System.out.println("Equipo de futbol creado");
	}
	 public void crearequipoBasquetbol(Baquet basquet){
		basquets.add(basquet);
		System.out.println("Equipo de basquet creado");
	 }
}