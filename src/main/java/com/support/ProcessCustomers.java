package com.support;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class ProcessCustomers implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		return RetrieveCustomersFromDB.retrieve(eventContext.getMessage().getInvocationProperty("counter"));
		
	}

}
