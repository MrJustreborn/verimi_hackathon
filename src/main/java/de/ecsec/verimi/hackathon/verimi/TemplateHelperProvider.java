/****************************************************************************
 * Copyright (C) 2017 ecsec GmbH.
 * All rights reserved.
 * Contact: ecsec GmbH (info@ecsec.de)
 *
 * This file is part of SkIDentity.
 *
 * This file may be used in accordance with the terms and conditions
 * contained in a signed written agreement between you and ecsec GmbH.
 *
 ***************************************************************************/

package de.ecsec.verimi.hackathon.verimi;

import de.skidentity.common.server.velocity.TemplateHelper;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.apache.velocity.app.VelocityEngine;


/**
 *
 * @author Tobias Wich
 */
@ApplicationScoped
public class TemplateHelperProvider {

    private TemplateHelper th;

    @Inject
    public void initTemplateHelper(VelocityEngine ve) {
	th = new TemplateHelper("/templates", "i18n", ve);
    }

    @Produces
    public TemplateHelper getHelper() {
	return th;
    }

}
