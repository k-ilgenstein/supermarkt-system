package supermarkt;

public class Runner {

	public static void main(String[] args) {

		// Warenregal erstellen
		Warenregal warenregal = new Warenregal();

		// Waren hinzufügen
		warenregal.wareHinzufuegen(new Ware("Pullover", 25.0));
		warenregal.wareHinzufuegen(new Ware("Schuhe", 40.0));
		warenregal.wareHinzufuegen(new Ware("Jeans", 50.0));

		// Ausgabe der im Regal befindlichen Waren
		warenregal.warenAusgeben();
	}

}