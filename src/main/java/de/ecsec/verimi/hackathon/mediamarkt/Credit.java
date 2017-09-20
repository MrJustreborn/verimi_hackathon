/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ecsec.verimi.hackathon.mediamarkt;

import de.skidentity.common.server.velocity.TemplateHelper;
import java.io.IOException;
import java.io.Writer;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.velocity.VelocityContext;
import de.ecsec.verimi.hackathon.verimi.IdAdded;
import de.skidentity.common.attributes.AttributeExtractor;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Mike Prechtl
 */
@WebServlet(name = "Credit", urlPatterns = {"/mediamarkt/credit"})
public class Credit extends HttpServlet {

    private TemplateHelper th;
    @Inject
    public void setTemplateHelper(TemplateHelper th) {
	this.th = th;
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	Writer sw = response.getWriter();
	VelocityContext ctx = new VelocityContext();

	AttributeExtractor ex = IdAdded.currentAttributes;

	HttpSession sess = request.getSession(false);
	if (sess != null) {
	    ctx.put("ex", ex);
	    th.eval("mediamarkt-credit", ctx, request.getLocale(), sw);
	} else {
	    response.sendError(404, "No authentication performed.");
	}
    }

}
