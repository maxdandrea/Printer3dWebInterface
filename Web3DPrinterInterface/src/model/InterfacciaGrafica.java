/**
 * 
 */
package model;

/**
 * @author Massimiliano D'Andrea
 * Classe di supporto alla grafica, da inviare alla JSP
 * Funziona anche da Adapter
 *
 */
public class InterfacciaGrafica {
	public Printer3d printer3d;
	public String statoStringa;
	public String imgAllarmi;
	public String idVentola;
	public String stileBottonePausa;
	public String stileBottoneVentola;


public InterfacciaGrafica() {
	printer3d=new Printer3d();
	statoStringa="Offline";
	imgAllarmi="./immagini/allarmiInterfaceOffline.png";
	idVentola="./immagini/fanInterfaceOff.png";
	stileBottonePausa="";
	stileBottoneVentola="";
}




}
