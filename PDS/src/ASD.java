import java.util.ArrayList;
import java.util.Iterator;

public class ASD {
	static public class Document {

		private ArrayList<Sujet> listSujet;

		public Document(ArrayList<Sujet> listSujet) {
			if (!listSujet.isEmpty()) {
				this.setListSujet(listSujet);
			}
		}

		public Document() {
			listSujet = new ArrayList<Sujet>();

		}

		public ArrayList<Sujet> getListSujet() {
			return listSujet;
		}

		public void setListSujet(ArrayList<Sujet> listSujet) {
			if (!listSujet.isEmpty()) {
				this.listSujet = listSujet;
			}
		}

		public String toNtriples() {
			String res = "";
			Iterator<Sujet> itS = listSujet.iterator();
			while (itS.hasNext()) {
				Sujet s = itS.next();
//				res += s.getE().toString();
				Iterator<Descripteur> itD = s.getListDesc().iterator();
				while (itD.hasNext()) {
					Descripteur d = itD.next();
//					res += d.getE().toString();
					Iterator<Objet> itO = d.getListObjet().iterator();
					while (itO.hasNext()) {
						Objet o = itO.next();
						res += s.getE().toString() + d.getE().toString() +o.getO().toString() + " . \n";
						
					}
				
				}
				

			}
			return res;
		}
		// …
	}
}
