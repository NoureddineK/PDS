
public class Entite extends Objet {
	private String entite;
	
	public Entite(String entite){
		this.setO(entite);
	}

	public Entite getO() {
		return this;
	}

	public void setO(String entite) {
		this.entite = entite;
	}
	
	@Override
	public String toString() {
		return "<" + entite + ">";
	}
}
