import java.util.ArrayList;

public class Descripteur {
	private Entite e;
	private ArrayList<Objet> listObjet;
	
	public Descripteur (Entite e , ArrayList<Objet> listObjet){
		this.setE(e);
		if (!listObjet.isEmpty()){
		this.setListObjet(listObjet);
		}
		
	}

	public Entite getE() {
		return e;
	}

	public void setE(Entite e) {
		this.e = e;
	}

	public ArrayList<Objet> getListObjet() {
		return listObjet;
	}

	public void setListObjet(ArrayList<Objet> listObjet) {
		if (!listObjet.isEmpty()){
			this.listObjet=listObjet;
			}
	}
}
