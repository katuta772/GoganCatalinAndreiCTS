package cts.s02.principii_clean_code.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctajObtinut;
	protected int nrProiecte;
	protected String[] denumireProiect;
	private static int pragAcceptare = 80;


	public static int getPrag() {
		return pragAcceptare;
	}
	public static void setPrag(int prag) {
		Aplicant.pragAcceptare = prag;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public int getPunctajObtinut() {
		return punctajObtinut;
	}
	public void setPunctajObtinut(int punctajObtinut) {
		this.punctajObtinut = punctajObtinut;
	}

	public void afisareStatus() {
		System.out.println("Aplicantul " + nume + " " + prenume +
				(punctajObtinut > pragAcceptare ? " " : " nu ") +
				"a fost acceptat.");
	}

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctajObtinut, int nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctajObtinut = punctajObtinut;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNrProiecte() {
		return nrProiecte;
	}
	public void setNrProiecte(int nrProiecte, String[] vector) {
		this.nrProiecte = nrProiecte;
		this.denumireProiect = new String[this.nrProiecte];
		for(int i=0;i<this.nrProiecte;i++){
			this.denumireProiect[i] = vector[i];
		}
	}

	public abstract void afisareSumaFinantare();

	protected void afisareSumaFinantare(String tipAplicant, int sumaFinantare){
		System.out.println(tipAplicant + getNume() + " " + getPrenume() + " primeste " + sumaFinantare + " Euro/zi in proiect.");
	}

}
