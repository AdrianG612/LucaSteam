package model;

public enum Plataforma {
	WII("Wii"),
	NES("NES"),
	GB("GB"),
	DS("DS"),
	X360("X360"),
	PS3("PS3"),
	PS2("PS2"),
	SNES("SNES"),
	GBA("GBA"),
	PS4("PS4"),
	TRESDS("3DS"),
	PSP("PSP"),
	PS("PS"),
	WIIU("Wii U"),
	GC("GameCube"),
	XB("XBox"),
	N64("Nintendo 64"),
	XONE("Xbox ONE"),
	GEN("Genesis"),
	PC("PC");
	
	private final String nombre;

	private Plataforma(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
<<<<<<< HEAD
	
	public static Plataforma asignarEnumDesdeString(String plataformaCSV) {
		for(Plataforma p:Plataforma.values()) 
			if(p.name().equalsIgnoreCase(plataformaCSV)) 
				return p;
			
		return null;
	}
	
=======
>>>>>>> origin/daniel
}
