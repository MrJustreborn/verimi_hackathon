/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ecsec.verimi.hackathon.mediamerkt;

import de.skidentity.common.server.velocity.TemplateHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.velocity.VelocityContext;

/**
 *
 * @author Tobias Wich
 */
@WebServlet(name = "Success", urlPatterns = {"/mediamarkt/success"})
public class Success extends HttpServlet {

    private TemplateHelper th;
    @Inject
    public void setTemplateHelper(TemplateHelper th) {
	this.th = th;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String pdf = request.getParameter("base64Data");
	if (pdf == null) {
	    response.sendError(404, "No PDF received from signature server.");
	} else {
	    byte[] rawPdf = Base64.getDecoder().decode(pdf);
	    PdfDownload.currentPdf = rawPdf;

	    VelocityContext ctx = new VelocityContext();
	    th.eval("credit-check", ctx, request.getLocale(), response.getWriter());
	}
    }

}
