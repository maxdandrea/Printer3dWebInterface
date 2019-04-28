/**
 * 
 */
package model;

/**
 * @author Massimiliano D'Andrea
 *
 */
public class Printer3d {
	private String nome; 
	private int stato;
	private double tempUgello;
	private double tempAmbiente;
	private double vibrazioniRMS;
	private boolean ventolaON;
	private boolean inStampa;
	private int tempoFineStampa;
	


	public Printer3d() {
		nome="dal costruttore";
		stato=0;
		tempUgello=0.0;
		tempAmbiente=0.0;
		vibrazioniRMS=0.0;
		ventolaON=true;
		inStampa=true;
		tempoFineStampa=61;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		if (nome!=null) {
		this.nome = nome;
		}
		else {
			this.nome="non connesso";
		}
	}

	/**
	 * @return the status
	 */
	public int getStato() {
		return stato;
	}

	/**
	 * @param status the status to set
	 */
	public void setStato(int stato) {
		this.stato = stato;
	}
	
	/**
	 * @return the tempoFineStampa
	 */
	public int getTempoFineStampa() {
		return tempoFineStampa;
	}

	/**
	 * @param tempoFineStampa the tempoFineStampa to set
	 */
	public void setTempoFineStampa(int tempoFineStampa) {
		this.tempoFineStampa = tempoFineStampa;
	}
	

	/**
	 * @return the tempUgello
	 */
	public double getTempUgello() {
		return tempUgello;
	}

	/**
	 * @param tempUgello the tempUgello to set
	 */
	public void setTempUgello(double tempUgello) {
		this.tempUgello = tempUgello;
	}

	/**
	 * @return the tempAmbiente
	 */
	public double getTempAmbiente() {
		return tempAmbiente;
	}

	/**
	 * @param tempAmbiente the tempAmbiente to set
	 */
	public void setTempAmbiente(double tempAmbiente) {
		this.tempAmbiente = tempAmbiente;
	}

	/**
	 * @return the vibrazioniRMS
	 */
	public double getVibrazioniRMS() {
		return vibrazioniRMS;
	}

	/**
	 * @param vibrazioniRMS the vibrazioniRMS to set
	 */
	public void setVibrazioniRMS(double vibrazioniRMS) {
		this.vibrazioniRMS = vibrazioniRMS;
	}

	/**
	 * @return the ventolaON
	 */
	public boolean isVentolaON() {
		return ventolaON;
	}

	/**
	 * @param ventolaON the ventolaON to set
	 */
	public void setVentolaON(boolean ventolaON) {
		this.ventolaON = ventolaON;
	}

	/**
	 * @return the inStampa
	 */
	public boolean isInStampa() {
		return inStampa;
	}

	/**
	 * @param inStampa the inStampa to set
	 */
	public void setInStampa(boolean inStampa) {
		this.inStampa = inStampa;
	}
	

	

}
