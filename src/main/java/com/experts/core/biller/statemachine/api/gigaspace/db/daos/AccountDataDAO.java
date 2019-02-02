package com.experts.core.biller.statemachine.api.gigaspace.db.daos;

import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.AccountData;
import com.gigaspaces.client.ReadModifiers;
import com.gigaspaces.client.WriteModifiers;
import net.jini.core.lease.Lease;

import org.openspaces.core.GigaSpace;
import org.openspaces.core.context.GigaSpaceContext;





public class AccountDataDAO implements IAccountDataDAO {


	@GigaSpaceContext(name = "gigaSpace")
	private GigaSpace gigaSpace;
	

	public void setGigaSpace(GigaSpace gigaSpace) {
		this.gigaSpace = gigaSpace;
	}

	public boolean isAccountFound(String userName) {
		AccountData accountDataTemplate = new AccountData();
		accountDataTemplate.setUserName(userName);

		AccountData accountData = gigaSpace.read(accountDataTemplate, 0, ReadModifiers.DIRTY_READ);
		if (accountData != null)
			return true;
		else
			return false;
	}


	public AccountData getAccountData(String userName) {
		AccountData accountDataTemplate = new AccountData();
		accountDataTemplate.setUserName(userName);

		AccountData accountData = gigaSpace.read(accountDataTemplate, Long.MAX_VALUE, ReadModifiers.EXCLUSIVE_READ_LOCK);
		return accountData;
	}

	public void updateAccountData(AccountData accountData) {

		gigaSpace.write(accountData, Lease.FOREVER, Long.MAX_VALUE, WriteModifiers.PARTIAL_UPDATE.UPDATE_ONLY);
	}

	public void save(AccountData accountData) {
		gigaSpace.write(accountData);
	}
}
