package model;

public enum Genero {
	ACTION("Action"),
	SPORTS("Sports"),
	MISC("Misc"),
	ROLEPLAYING("Roleplaying"),
	SHOOTER("Shooter"),
	PLATFORM("Platform"),
	RACING("Racing"),
	PUZZLE("Puzzle"),
	SIMULATION("Simulation"),
	FIGHTING("Fighting"),
	ADVENTURE("Adventure"),
	STRATEGY("Strategy");
	
	private final String nombre;

	private Genero(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
}
