package domain.db;

import java.util.ArrayList;

import domain.model.Dier;

public class DierDB {
	private ArrayList<Dier> dieren = new ArrayList<Dier>();

	public DierDB() {
		this.voegToe(new Dier("Lex", "hond", 2));
		this.voegToe(new Dier("Nijn", "kat", 5));
		this.voegToe(new Dier("Bruintje", "kip", 1));
	}

	public void voegToe(Dier dier) {
		dieren.add(dier);
	}
	
	public void verwijder (String naam) {
		dieren.remove(new Dier(naam));
	}

	public ArrayList<Dier> getAlle() {
		return dieren;
	}

	public Dier getMeestHongerigeDier () {
		Dier meestHongerige = dieren.get(0);
		for (int i=1; i<dieren.size(); i++) {
			if (dieren.get(i).getVoedsel() > meestHongerige.getVoedsel())
				meestHongerige = dieren.get(i);
		}
		return meestHongerige;
	}

}
