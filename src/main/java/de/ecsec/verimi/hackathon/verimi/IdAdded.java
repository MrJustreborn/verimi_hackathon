/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ecsec.verimi.hackathon.verimi;

import de.skidentity.cc.saml.filter.SAMLHelper;
import de.skidentity.common.attributes.AttributeExtractor;
import de.skidentity.common.server.velocity.TemplateHelper;
import java.io.IOException;
import java.io.Writer;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.velocity.VelocityContext;

/**
 *
 * @author Tobias Wich
 */
@WebServlet(name = "IdAdded", urlPatterns = {"/id-added"})
public class IdAdded extends HttpServlet {

    public static AttributeExtractor currentAttributes;

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
	Writer sw = response.getWriter();
	VelocityContext ctx = new VelocityContext();

	HttpSession sess = request.getSession(false);
	if (sess != null) {
	SAMLHelper helper = new SAMLHelper(sess);
	currentAttributes = new AttributeExtractor(helper.getAttributeList());

	ctx.put("ex", currentAttributes);
	th.eval("id-added", ctx, request.getLocale(), sw);
	} else {
	    response.sendError(404, "No authentication performed.");
	}
    }

}
