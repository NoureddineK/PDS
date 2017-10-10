import java.util.ArrayList;

public class Sujet {
	private Entite e;
	private ArrayList<Descripteur> listDesc;
	
	public Sujet (Entite e , ArrayList<Descripteur> listDesc){
		this.setE(e);
		if (!listDesc.isEmpty()){
		this.setListDesc(listDesc);
		}
		
	}

	public Entite getE() {
		return e;
	}

	public void setE(Entite e) {
		this.e = e;
	}

	public ArrayList<Descripteur> getListDesc() {
		return listDesc;
	}

	public void setListDesc(ArrayList<Descripteur> listDesc) {
		if (!listDesc.isEmpty()){
		this.listDesc = listDesc;
	}}
}
