

import java.util.ArrayList;


public class RDF {
	

	private ArrayList<Sujet> listSujet;

	public RDF(ArrayList<Sujet> listSujet){
		if (!listSujet.isEmpty()){
			this.setListSujet(listSujet);
		}
	}

	public ArrayList<Sujet> getListSujet() {
		return listSujet;
	}

	public void setListSujet(ArrayList<Sujet> listSujet) {
		if (!listSujet.isEmpty()){
			this.listSujet = listSujet;
		}
	}	
	
}
