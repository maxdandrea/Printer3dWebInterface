package webui;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connector.Printer3dConnector;
import controller.Printer3dCommander;
/**
 * Servlet implementation class Printer3DServlet
 */
@WebServlet("/Printer3DServlet")
public class Printer3dServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Printer3dConnector printer3dconnector = new Printer3dConnector();


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Printer3dServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	
	/**
	 * Procedura Unificata Request-Response
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// --------------------------------------------------------------
		// E' STATO PREMUTO UNO DEI BOTTONI DI COMANDO
		// recupero del bottone btnVisualizzaLista
		String inputComando = request.getParameter("btnComando");
		btnComando_Click(request, response, inputComando);
		

	// --------------------------------------------------------------
				// OUTPUT VERSO LA JSP
				// aggiorno il connector
				printer3dconnector.update();
		        
		    

				// invio dello stato stampante in output
				request.setAttribute("statoStampante", printer3dconnector);

				
				// passaggio di controllo alla view JSP (personaView.jsp)
				request.getRequestDispatcher("home.jsp").forward(request,response);
		
	} // end method processRequest

private void btnComando_Click(HttpServletRequest request,
		HttpServletResponse response, String inputComando)
		throws ServletException, IOException {
	if (inputComando == null) {
		inputComando = "";
	}
			

	
	switch (inputComando) {
		case "Pausa": {
			Printer3dCommander.Pausa();
			break;
		}

		case "Avvia": {
			Printer3dCommander.Avvia();
			break;
		}

		case "Ventola On": {
			Printer3dCommander.VentolaOn();
			break;
		}

		case "Ventola Off": {
			Printer3dCommander.VentolaOff();
			break;
		}

	}
	

}

}
