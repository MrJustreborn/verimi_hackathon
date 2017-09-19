/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ecsec.verimi.hackathon.sp;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.VerimiAPIApi;
import io.swagger.client.model.BasketResponse;
import io.swagger.client.model.DataField;
import io.swagger.client.model.DataTransferRequest;
import io.swagger.client.model.ScopeData;
import io.swagger.client.model.TokenSuccessfulResponse;
import java.io.IOException;
import javax.transaction.Transaction;
import me.figo.FigoException;
import me.figo.FigoSession;
import me.figo.models.Account;

/**
 *
 * @author René Lottes
 */
public class TestClass {
    private static VerimiAPIApi client;

    public static void main(String args[]) throws FigoException, IOException, ApiException {
//	ApiClient apiclient = new ApiClient();
//	apiclient.setUsername("dipptest@coretransform.com");
//	apiclient.setPassword("ABcd12!! ");
//	
	client = new VerimiAPIApi();//apiclient);
//	TokenSuccessfulResponse token = client.tokenUsingGET("", "", "", "");
	
	
	
	
	BasketResponse resp = client.getBasket();
	System.out.println(resp.getBasketId());
	ScopeData d = new ScopeData();
	DataField data = new DataField();
	data.setName("test");
	data.setValue("test-value");
	d.addDataItem(data);
	resp.addDataScopesItem(d);
	
	DataTransferRequest trans = new DataTransferRequest();
	trans.addDataScopesItem(d);
	client.transferData(trans);
	
	ApiResponse<BasketResponse> r = client.getBasketWithHttpInfo();
	System.out.println(r.getHeaders());
	System.out.println(r.getData().getDataScopes());
    }
}
