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

import de.skidentity.common.server.cache.Memoizer;
import de.skidentity.common.server.velocity.VelocityEngineLoader;
import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.apache.velocity.app.VelocityEngine;


/**
 *
 * @author Tobias Wich
 */
@ApplicationScoped
public class VelocityEngineProvider {

    private Memoizer<VelocityEngine> mem;

    @PostConstruct
    public void init() {
	this.mem = new Memoizer<>(new VelocityEngineLoader());
    }

    @Produces
    @Nonnull
    public VelocityEngine getEngine() {
	return mem.get();
    }

}
