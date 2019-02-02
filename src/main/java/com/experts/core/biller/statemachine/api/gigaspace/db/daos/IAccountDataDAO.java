

package com.experts.core.biller.statemachine.api.gigaspace.db.daos;


import com.experts.core.biller.statemachine.api.model.domain.jpa.settlement.AccountData;

public interface IAccountDataDAO {
	boolean isAccountFound(String userName);
	void updateAccountData(AccountData accountData);
	AccountData getAccountData(String userName);
	void save(AccountData accountData);
}
