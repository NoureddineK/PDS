
public class Texte extends Objet{
	private String texte ;
	
	public Texte(String texte){
		this.setO(texte);
	}

	public Objet getO() {
		return this;
	}

	public void setO(String texte) {
		this.texte = texte;
	}
	
	@Override
	public String toString() {
		return  '"' + texte + '"';
	}

}
