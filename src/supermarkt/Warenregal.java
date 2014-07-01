package supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Warenregal {
	private ArrayList<Ware> waren = new ArrayList<Ware>();

	public void wareHinzufuegen(Ware ware) {
		waren.add(ware);
	}

	public List<Ware> getWaren() {
		return waren;
	}

	public void warenAusgeben() {
		for (int i = 0; i < waren.size(); i++) {
			String ausgabe = waren.get(i).getName() + " "
					+ waren.get(i).getPreis();
			System.out.println(ausgabe);
		}
	}
}