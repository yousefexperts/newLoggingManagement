

package com.experts.core.biller.statemachine.api.gigaspace.db.daos;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.AccountData;
import org.openspaces.events.adapter.SpaceDataEvent;




public class OrderEventProcessor {

    private long workDuration = 100;

    private IAccountDataDAO accountDataDAO;
    
    public void setAccountDataDAO(IAccountDataDAO accountDataDAO) {
		this.accountDataDAO = accountDataDAO;
	}

    public void setWorkDuration(long workDuration) {
        this.workDuration = workDuration;
    }


    @SpaceDataEvent
    public OrderEvent processOrderEvent(OrderEvent orderEvent) {
        // sleep to simluate some work
        try {
            Thread.sleep(workDuration);
        } catch (InterruptedException e) {
            // do nothing
        }
        System.out.println("---[Processor: Processing orderEvent:"+orderEvent+" ]---");
        
        //	read the accountData with exclusive read making it invisible to other processor threads, block until found
        AccountData accountData = accountDataDAO.getAccountData(orderEvent.getUserName());
            	
        if (accountData != null) {
        	System.out.println("---[Processor: Found accountData matching the orderEvent: "+accountData+ "]---");	
        
        	if (orderEvent.getOperation() == OrderEvent.BUY_OPERATION) { 
        		//	orderEvent operation is buy
        		
        		if (accountData.getBalance() >= orderEvent.getPrice()){	
        			//	balance is enough to buy
        			accountData.setBalance(accountData.getBalance()-orderEvent.getPrice());
        			orderEvent.setStatus("Processed");
        			System.out.println("---[Processor: OrderEvent PROCESSED successfully!]---");
        			//	update the accountData object with the new balance 
        			accountDataDAO.updateAccountData(accountData);
        		}
        		else {
        			//	balance insufficient
        			orderEvent.setStatus("InsufficientFunds");
        			System.out.println("---[Processor: OrderEvent rejected due to INSUFFICIENT FUNDS]---");
        		}
        	}
        	else {
        		//	orderEvent operation is sell
        		accountData.setBalance(accountData.getBalance()+orderEvent.getPrice());
        		orderEvent.setStatus("Processed");
        		System.out.println("---[Processor: OrderEvent PROCESSED successfully!]---");
        		//	update the accountData object with the new balance 
        		accountDataDAO.updateAccountData(accountData);
        	}
        }

        //  orderID is declared as primary key and as auto-generated. 
    	//	It must be null before writing an operation.
    	orderEvent.setOrderID(null);       
        
    	return orderEvent;
    }

    /** Prints out the OrderEvent object passed as a parameter. Usually invoked
        when using OpenSpaces remoting. */
    public void sayData(OrderEvent orderEvent) {
        System.out.println("+++[Saying: "+orderEvent);
    }
}
