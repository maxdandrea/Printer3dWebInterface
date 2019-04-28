/**
 * Classe Adapter per la connessione all'API
 */
package connector;

import model.InterfacciaGrafica;
import model.Printer3d;

/**
 * @author Massimiliano D'Andrea
 * 
 */
public class Printer3dConnector {
	
	public Printer3d printer3d;
	public InterfacciaGrafica interfaccia;
	
	public Printer3dConnector() {
		this.printer3d=new Printer3d();
		this.interfaccia=new InterfacciaGrafica();
		this.update();
	}
	
	public void update() {
		this.printer3d.setNome("Stampante n.19");
		this.printer3d.setTempUgello(arrotondaUnaCifra(getRandomDouble (10.0,220.0)));
		this.printer3d.setTempAmbiente(arrotondaUnaCifra(getRandomDouble (-10.0,60.0)));
		this.printer3d.setVibrazioniRMS(arrotondaUnaCifra(getRandomDouble (0.0,9.9)));
		this.printer3d.setTempoFineStampa(getRandomInt(0,3600));
		this.interfaccia.statoStringa=composizioneStringaStato();
		this.printer3d.setVentolaON(getRandomBool());
		this.interfaccia.imgAllarmi=getImgAllarmi();
		this.interfaccia.imgVentola=getImgVentola();
		this.interfaccia.stileBottonePausa=getStileBottonePausa();
		this.interfaccia.stileBottoneVentola=getStileBottoneVentola();
	}
	
	private boolean getRandomBool() {
		if (Math.random()>0.5) 
			return true;
		else
		return false;
	}

	/**
	 * Metodo per la composizione della stringa di stato dell'interfaccia
	 * @return Errore,Pausa,Pronto alla stampa oppure In stampa: x ore e yy minuti
	 */
	private String composizioneStringaStato() {
		String stato="";
		if (printer3d.isInStampa() && printer3d.getTempoFineStampa()>0) {
			int ore=0,minuti=printer3d.getTempoFineStampa();
			ore=minuti/60;
			minuti=minuti%60;
			stato="In stampa: "+Integer.toString(ore)+" ore e "+Integer.toString(minuti)+" minuti rimanenti";
		}
		else if(printer3d.isInStampa() && printer3d.getTempoFineStampa()==0) {
			stato="Pronto alla stampa";
		}
		else if(!printer3d.isInStampa() && printer3d.getStato()<0) {
			//DA IMPLEMENTARE:Assegno a stato la stringa di errore...
			//DA IMPLEMENTARE:Chiamo funzione...
			stato="Errore";	
		}
		else if(!printer3d.isInStampa() && printer3d.getStato()>=0) {
		//Assegno a stato la stringa di errore...
		//Chiamo funzione...
		stato="Pausa";	
		}
		
		return stato;			
	}

	private String getStileBottoneVentola() {
		return "";
	}

	private String getStileBottonePausa() {
		return "";
	}

	private String getImgVentola() {
		if (printer3d.isVentolaON()) {
			return "./immagini/fanInterfaceOn.png";
		}
		else {
			return "./immagini/fanInterfaceOff.png";
		}
	}

	private String getImgAllarmi() {
		if (printer3d.getTempAmbiente()>50) {
			return "./immagini/allarmiInterfaceTemperatura.png";
		}
		else if (printer3d.getTempUgello()>180){
			return "./immagini/allarmiInterfaceUgello.png";
		}
		else if (printer3d.getVibrazioniRMS()>2.2) {
			return "./immagini/allarmiInterfaceVibrazioni.png";
		}
		else {
			return "./immagini/allarmiInterfaceOk.png";
		}
	}
	
	
	
	/**
	 * Genero un numero double casuale per i test
	 * @param min valore double minimo restituito
	 * @param max valore double massimo restituito
	 * @return valore double casuale tra il min e il max passati
	 */
	private double getRandomDouble (double min,double max) {
		double result=0.0;
		if (max>min) {
		result=Math.random()*(max-min)+min;
		}
		return result;
	}
	
	private int getRandomInt (int min,int max) {
		int result=0;
		if (max>min) {
		result=(int) (Math.random()*(max-min)+min);
		}
		return result;
	}
	
	

	private double arrotondaUnaCifra(double val) {
		return Math.round(val*10)/10.0;
	}
}
