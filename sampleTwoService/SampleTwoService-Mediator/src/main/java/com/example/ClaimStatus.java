package com.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class ClaimStatus extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		System.out.println("------Inside ClaimStatus-------");
		ruleValidation(context);
		return true;
	}
	public MessageContext ruleValidation(MessageContext context){
		System.out.println("Inside RuleValidation====================>");
		KieServices ks = KieServices.Factory.get();
		System.out.println(ks);
 	    KieContainer kContainer = ks.getKieClasspathContainer();
 	   System.out.println(kContainer);
 	  //kContainer.
 	    KieSession kSession = kContainer.newKieSession("ksession-rules");
 	   System.out.println(kSession);
		return context;
	}
}




