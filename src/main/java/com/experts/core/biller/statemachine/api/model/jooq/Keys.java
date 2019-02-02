/*
 * This file is generated by jOOQ.
 */
package com.experts.core.biller.statemachine.api.model.jooq;


import com.experts.core.biller.statemachine.api.model.jooq.tables.Authorities;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Authorities__;
import com.experts.core.biller.statemachine.api.model.jooq.tables.BillCreationHistory;
import com.experts.core.biller.statemachine.api.model.jooq.tables.BillPullRequest;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Billingcreation;
import com.experts.core.biller.statemachine.api.model.jooq.tables.CompletedState;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Customer;
import com.experts.core.biller.statemachine.api.model.jooq.tables.CustomerTracking;
import com.experts.core.biller.statemachine.api.model.jooq.tables.InitialState;
import com.experts.core.biller.statemachine.api.model.jooq.tables.InquiryBillCurrent;
import com.experts.core.biller.statemachine.api.model.jooq.tables.InquiryHistory;
import com.experts.core.biller.statemachine.api.model.jooq.tables.ModifiedEntity;
import com.experts.core.biller.statemachine.api.model.jooq.tables.PayState;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Payment;
import com.experts.core.biller.statemachine.api.model.jooq.tables.PaymentStatus;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Person;
import com.experts.core.biller.statemachine.api.model.jooq.tables.ProcessState;
import com.experts.core.biller.statemachine.api.model.jooq.tables.RolesAuth;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Tasks;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TasksVarible;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Transaction;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Transactionstatus;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxAccount;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxKullaniciRol;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxMenu;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxPage;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxRol;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxRolYetki;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxUser;
import com.experts.core.biller.statemachine.api.model.jooq.tables.TxYetki;
import com.experts.core.biller.statemachine.api.model.jooq.tables.UserAuthorities;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Users;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Users_;
import com.experts.core.biller.statemachine.api.model.jooq.tables.Users__;
import com.experts.core.biller.statemachine.api.model.jooq.tables.WaitingState;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.AuthoritiesRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.Authorities__Record;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.BillCreationHistoryRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.BillPullRequestRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.BillingcreationRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.CompletedStateRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.CustomerRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.CustomtrackingrevisionentityRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.InitialStateRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.InquiryBillCurrentRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.InquiryHistoryRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.ModifiedEntityRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.PayStateRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.PaymentRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.PaymentStatusRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.PersonRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.ProcessStateRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.RolesAuthRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TasksRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TasksVaribleRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TransactionRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TransactionstatusRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxAccountRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxKullaniciRolRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxMenuRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxPageRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxRolRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxRolYetkiRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxUserRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.TxYetkiRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.UserAuthoritiesRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.UsersRecord;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.Users_Record;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.Users__Record;
import com.experts.core.biller.statemachine.api.model.jooq.tables.records.WaitingStateRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthoritiesRecord, Long> IDENTITY_AUTHORITIES = Identities0.IDENTITY_AUTHORITIES;
    public static final Identity<Authorities__Record, Long> IDENTITY_AUTHORITIES__ = Identities0.IDENTITY_AUTHORITIES__;
    public static final Identity<UsersRecord, Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;
    public static final Identity<Users__Record, Long> IDENTITY_USERS__ = Identities0.IDENTITY_USERS__;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthoritiesRecord> AUTHORITIES_PKEY = UniqueKeys0.AUTHORITIES_PKEY;
    public static final UniqueKey<AuthoritiesRecord> UK_Q0U5F2CDLSHEC8TLH6818BHBK = UniqueKeys0.UK_Q0U5F2CDLSHEC8TLH6818BHBK;
    public static final UniqueKey<Authorities__Record> AUTHORITIES___PKEY = UniqueKeys0.AUTHORITIES___PKEY;
    public static final UniqueKey<Authorities__Record> UK_L880PICH4X4LVA4JWDQG5QTBR = UniqueKeys0.UK_L880PICH4X4LVA4JWDQG5QTBR;
    public static final UniqueKey<BillCreationHistoryRecord> BILL_CREATION_HISTORY_PKEY = UniqueKeys0.BILL_CREATION_HISTORY_PKEY;
    public static final UniqueKey<BillPullRequestRecord> BILL_PULL_REQUEST_PKEY = UniqueKeys0.BILL_PULL_REQUEST_PKEY;
    public static final UniqueKey<BillingcreationRecord> BILLINGCREATION_PKEY = UniqueKeys0.BILLINGCREATION_PKEY;
    public static final UniqueKey<CompletedStateRecord> COMPLETED_STATE_PKEY = UniqueKeys0.COMPLETED_STATE_PKEY;
    public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = UniqueKeys0.CUSTOMER_PKEY;
    public static final UniqueKey<CustomtrackingrevisionentityRecord> CUSTOMTRACKINGREVISIONENTITY_PKEY = UniqueKeys0.CUSTOMTRACKINGREVISIONENTITY_PKEY;
    public static final UniqueKey<InitialStateRecord> INITIAL_STATE_PKEY = UniqueKeys0.INITIAL_STATE_PKEY;
    public static final UniqueKey<InquiryBillCurrentRecord> INQUIRY_BILL_CURRENT_PKEY = UniqueKeys0.INQUIRY_BILL_CURRENT_PKEY;
    public static final UniqueKey<InquiryHistoryRecord> INQUIRY_HISTORY_PKEY = UniqueKeys0.INQUIRY_HISTORY_PKEY;
    public static final UniqueKey<ModifiedEntityRecord> MODIFIED_ENTITY_PKEY = UniqueKeys0.MODIFIED_ENTITY_PKEY;
    public static final UniqueKey<PayStateRecord> PAY_STATE_PKEY = UniqueKeys0.PAY_STATE_PKEY;
    public static final UniqueKey<PaymentRecord> PAYMENT_PKEY = UniqueKeys0.PAYMENT_PKEY;
    public static final UniqueKey<PaymentStatusRecord> PAYMENT_STATUS_PKEY = UniqueKeys0.PAYMENT_STATUS_PKEY;
    public static final UniqueKey<PersonRecord> PERSON_PKEY = UniqueKeys0.PERSON_PKEY;
    public static final UniqueKey<ProcessStateRecord> PROCESS_STATE_PKEY = UniqueKeys0.PROCESS_STATE_PKEY;
    public static final UniqueKey<RolesAuthRecord> ROLES_AUTH_PKEY = UniqueKeys0.ROLES_AUTH_PKEY;
    public static final UniqueKey<RolesAuthRecord> UK_SO8W80GEK2HHOIWQEUU6P8E6 = UniqueKeys0.UK_SO8W80GEK2HHOIWQEUU6P8E6;
    public static final UniqueKey<TasksRecord> TASKS_PKEY = UniqueKeys0.TASKS_PKEY;
    public static final UniqueKey<TasksVaribleRecord> TASKS_VARIBLE_PKEY = UniqueKeys0.TASKS_VARIBLE_PKEY;
    public static final UniqueKey<TransactionRecord> TRANSACTION_PKEY = UniqueKeys0.TRANSACTION_PKEY;
    public static final UniqueKey<TransactionstatusRecord> TRANSACTIONSTATUS_PKEY = UniqueKeys0.TRANSACTIONSTATUS_PKEY;
    public static final UniqueKey<TxAccountRecord> TX_ACCOUNT_PKEY = UniqueKeys0.TX_ACCOUNT_PKEY;
    public static final UniqueKey<TxKullaniciRolRecord> TX_KULLANICI_ROL_PKEY = UniqueKeys0.TX_KULLANICI_ROL_PKEY;
    public static final UniqueKey<TxMenuRecord> TX_MENU_PKEY = UniqueKeys0.TX_MENU_PKEY;
    public static final UniqueKey<TxPageRecord> TX_PAGE_PKEY = UniqueKeys0.TX_PAGE_PKEY;
    public static final UniqueKey<TxRolRecord> TX_ROL_PKEY = UniqueKeys0.TX_ROL_PKEY;
    public static final UniqueKey<TxRolYetkiRecord> TX_ROL_YETKI_PKEY = UniqueKeys0.TX_ROL_YETKI_PKEY;
    public static final UniqueKey<TxUserRecord> TX_USER_PKEY = UniqueKeys0.TX_USER_PKEY;
    public static final UniqueKey<TxUserRecord> UK_JG7S0YYCVJC2VYMM802F4K4F5 = UniqueKeys0.UK_JG7S0YYCVJC2VYMM802F4K4F5;
    public static final UniqueKey<TxUserRecord> UKQGCJWGWCP8I0G7B1E73NOA5WF = UniqueKeys0.UKQGCJWGWCP8I0G7B1E73NOA5WF;
    public static final UniqueKey<TxYetkiRecord> TX_YETKI_PKEY = UniqueKeys0.TX_YETKI_PKEY;
    public static final UniqueKey<UsersRecord> USERS_PKEY = UniqueKeys0.USERS_PKEY;
    public static final UniqueKey<UsersRecord> UK_3G1J96G94XPK3LPXL2QBL985X = UniqueKeys0.UK_3G1J96G94XPK3LPXL2QBL985X;
    public static final UniqueKey<Users_Record> USERS__PKEY = UniqueKeys0.USERS__PKEY;
    public static final UniqueKey<Users__Record> USERS___PKEY = UniqueKeys0.USERS___PKEY;
    public static final UniqueKey<Users__Record> UK_DTVPUO1FEI1VU7FC46LVPP39N = UniqueKeys0.UK_DTVPUO1FEI1VU7FC46LVPP39N;
    public static final UniqueKey<WaitingStateRecord> WAITING_STATE_PKEY = UniqueKeys0.WAITING_STATE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CompletedStateRecord, ProcessStateRecord> COMPLETED_STATE__FK38CS25K0I7EP323ILRQUM76Q = ForeignKeys0.COMPLETED_STATE__FK38CS25K0I7EP323ILRQUM76Q;
    public static final ForeignKey<ModifiedEntityRecord, CustomtrackingrevisionentityRecord> MODIFIED_ENTITY__FK401W1WJ7GYCETRYWNXRIN3FEG = ForeignKeys0.MODIFIED_ENTITY__FK401W1WJ7GYCETRYWNXRIN3FEG;
    public static final ForeignKey<PayStateRecord, InitialStateRecord> PAY_STATE__FKNXDQFFU9M3X1R6C4UQ15Y9PQB = ForeignKeys0.PAY_STATE__FKNXDQFFU9M3X1R6C4UQ15Y9PQB;
    public static final ForeignKey<PaymentRecord, TransactionRecord> PAYMENT__FKH1BB7AUFNADO7E3FEUJSQJ75Q = ForeignKeys0.PAYMENT__FKH1BB7AUFNADO7E3FEUJSQJ75Q;
    public static final ForeignKey<TasksVaribleRecord, TasksRecord> TASKS_VARIBLE__FK8H0F1B32O348T1FD09YQG4C92 = ForeignKeys0.TASKS_VARIBLE__FK8H0F1B32O348T1FD09YQG4C92;
    public static final ForeignKey<TransactionRecord, TransactionstatusRecord> TRANSACTION__FK4PIAQKVC5TVNEWT8B53YI687A = ForeignKeys0.TRANSACTION__FK4PIAQKVC5TVNEWT8B53YI687A;
    public static final ForeignKey<TxKullaniciRolRecord, TxRolRecord> TX_KULLANICI_ROL__FKJSJV5OO3OJOTN4B7FXMKHJK87 = ForeignKeys0.TX_KULLANICI_ROL__FKJSJV5OO3OJOTN4B7FXMKHJK87;
    public static final ForeignKey<TxKullaniciRolRecord, TxUserRecord> TX_KULLANICI_ROL__FKK3F8TSI5VN6W3QSRRK1YWG5QJ = ForeignKeys0.TX_KULLANICI_ROL__FKK3F8TSI5VN6W3QSRRK1YWG5QJ;
    public static final ForeignKey<TxMenuRecord, TxPageRecord> TX_MENU__FK7THA45RNUYC3K8TM8ODOP0LGI = ForeignKeys0.TX_MENU__FK7THA45RNUYC3K8TM8ODOP0LGI;
    public static final ForeignKey<TxMenuRecord, TxMenuRecord> TX_MENU__FKMFGJ0GN9Y8PNY1RD31OCGPWB7 = ForeignKeys0.TX_MENU__FKMFGJ0GN9Y8PNY1RD31OCGPWB7;
    public static final ForeignKey<TxRolYetkiRecord, TxRolRecord> TX_ROL_YETKI__FK86F9OLGXPYWSWCM7CTBOOBJDE = ForeignKeys0.TX_ROL_YETKI__FK86F9OLGXPYWSWCM7CTBOOBJDE;
    public static final ForeignKey<TxRolYetkiRecord, TxYetkiRecord> TX_ROL_YETKI__FK2WVPJW8UEJY8MM7H4Q6M6YKUX = ForeignKeys0.TX_ROL_YETKI__FK2WVPJW8UEJY8MM7H4Q6M6YKUX;
    public static final ForeignKey<TxYetkiRecord, TxMenuRecord> TX_YETKI__FKI36LTSB5IU3TK4YLVDJOGLS4A = ForeignKeys0.TX_YETKI__FKI36LTSB5IU3TK4YLVDJOGLS4A;
    public static final ForeignKey<UserAuthoritiesRecord, UsersRecord> USER_AUTHORITIES__FKHIIIB540JF74GKSGB87OOFNI = ForeignKeys0.USER_AUTHORITIES__FKHIIIB540JF74GKSGB87OOFNI;
    public static final ForeignKey<UserAuthoritiesRecord, AuthoritiesRecord> USER_AUTHORITIES__FK6Y0U41DO0GYNBGVLWNQNGJUDF = ForeignKeys0.USER_AUTHORITIES__FK6Y0U41DO0GYNBGVLWNQNGJUDF;
    public static final ForeignKey<WaitingStateRecord, ProcessStateRecord> WAITING_STATE__FKJ0M5FENAYWMS4X4C4IWMD8PXU = ForeignKeys0.WAITING_STATE__FKJ0M5FENAYWMS4X4C4IWMD8PXU;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AuthoritiesRecord, Long> IDENTITY_AUTHORITIES = Internal.createIdentity(Authorities.AUTHORITIES, Authorities.AUTHORITIES.ID);
        public static Identity<Authorities__Record, Long> IDENTITY_AUTHORITIES__ = Internal.createIdentity(Authorities__.AUTHORITIES__, Authorities__.AUTHORITIES__.ID);
        public static Identity<UsersRecord, Long> IDENTITY_USERS = Internal.createIdentity(Users.USERS, Users.USERS.ID);
        public static Identity<Users__Record, Long> IDENTITY_USERS__ = Internal.createIdentity(Users__.USERS__, Users__.USERS__.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AuthoritiesRecord> AUTHORITIES_PKEY = Internal.createUniqueKey(Authorities.AUTHORITIES, "authorities_pkey", Authorities.AUTHORITIES.ID);
        public static final UniqueKey<AuthoritiesRecord> UK_Q0U5F2CDLSHEC8TLH6818BHBK = Internal.createUniqueKey(Authorities.AUTHORITIES, "uk_q0u5f2cdlshec8tlh6818bhbk", Authorities.AUTHORITIES.AUTHORITY);
        public static final UniqueKey<Authorities__Record> AUTHORITIES___PKEY = Internal.createUniqueKey(Authorities__.AUTHORITIES__, "authorities___pkey", Authorities__.AUTHORITIES__.ID);
        public static final UniqueKey<Authorities__Record> UK_L880PICH4X4LVA4JWDQG5QTBR = Internal.createUniqueKey(Authorities__.AUTHORITIES__, "uk_l880pich4x4lva4jwdqg5qtbr", Authorities__.AUTHORITIES__.AUTHORITY);
        public static final UniqueKey<BillCreationHistoryRecord> BILL_CREATION_HISTORY_PKEY = Internal.createUniqueKey(BillCreationHistory.BILL_CREATION_HISTORY, "bill_creation_history_pkey", BillCreationHistory.BILL_CREATION_HISTORY.ID);
        public static final UniqueKey<BillPullRequestRecord> BILL_PULL_REQUEST_PKEY = Internal.createUniqueKey(BillPullRequest.BILL_PULL_REQUEST, "bill_pull_request_pkey", BillPullRequest.BILL_PULL_REQUEST.ID);
        public static final UniqueKey<BillingcreationRecord> BILLINGCREATION_PKEY = Internal.createUniqueKey(Billingcreation.BILLINGCREATION, "billingcreation_pkey", Billingcreation.BILLINGCREATION.ID);
        public static final UniqueKey<CompletedStateRecord> COMPLETED_STATE_PKEY = Internal.createUniqueKey(CompletedState.COMPLETED_STATE, "completed_state_pkey", CompletedState.COMPLETED_STATE.ID);
        public static final UniqueKey<CustomerRecord> CUSTOMER_PKEY = Internal.createUniqueKey(Customer.CUSTOMER, "customer_pkey", Customer.CUSTOMER.ID);
        public static final UniqueKey<CustomtrackingrevisionentityRecord> CUSTOMTRACKINGREVISIONENTITY_PKEY = Internal.createUniqueKey(CustomerTracking.CUSTOMER_TRACKING, "customtrackingrevisionentity_pkey", CustomerTracking.CUSTOMER_TRACKING.CUSTOMID);
        public static final UniqueKey<InitialStateRecord> INITIAL_STATE_PKEY = Internal.createUniqueKey(InitialState.INITIAL_STATE, "initial_state_pkey", InitialState.INITIAL_STATE.ID);
        public static final UniqueKey<InquiryBillCurrentRecord> INQUIRY_BILL_CURRENT_PKEY = Internal.createUniqueKey(InquiryBillCurrent.INQUIRY_BILL_CURRENT, "inquiry_bill_current_pkey", InquiryBillCurrent.INQUIRY_BILL_CURRENT.ID);
        public static final UniqueKey<InquiryHistoryRecord> INQUIRY_HISTORY_PKEY = Internal.createUniqueKey(InquiryHistory.INQUIRY_HISTORY, "inquiry_history_pkey", InquiryHistory.INQUIRY_HISTORY.ID);
        public static final UniqueKey<ModifiedEntityRecord> MODIFIED_ENTITY_PKEY = Internal.createUniqueKey(ModifiedEntity.MODIFIED_ENTITY, "modified_entity_pkey", ModifiedEntity.MODIFIED_ENTITY.ID);
        public static final UniqueKey<PayStateRecord> PAY_STATE_PKEY = Internal.createUniqueKey(PayState.PAY_STATE, "pay_state_pkey", PayState.PAY_STATE.ID);
        public static final UniqueKey<PaymentRecord> PAYMENT_PKEY = Internal.createUniqueKey(Payment.PAYMENT, "payment_pkey", Payment.PAYMENT.ID);
        public static final UniqueKey<PaymentStatusRecord> PAYMENT_STATUS_PKEY = Internal.createUniqueKey(PaymentStatus.PAYMENT_STATUS, "payment_status_pkey", PaymentStatus.PAYMENT_STATUS.ID);
        public static final UniqueKey<PersonRecord> PERSON_PKEY = Internal.createUniqueKey(Person.PERSON, "person_pkey", Person.PERSON.ID);
        public static final UniqueKey<ProcessStateRecord> PROCESS_STATE_PKEY = Internal.createUniqueKey(ProcessState.PROCESS_STATE, "process_state_pkey", ProcessState.PROCESS_STATE.ID);
        public static final UniqueKey<RolesAuthRecord> ROLES_AUTH_PKEY = Internal.createUniqueKey(RolesAuth.ROLES_AUTH, "roles_auth_pkey", RolesAuth.ROLES_AUTH.ID);
        public static final UniqueKey<RolesAuthRecord> UK_SO8W80GEK2HHOIWQEUU6P8E6 = Internal.createUniqueKey(RolesAuth.ROLES_AUTH, "uk_so8w80gek2hhoiwqeuu6p8e6", RolesAuth.ROLES_AUTH.AUTH);
        public static final UniqueKey<TasksRecord> TASKS_PKEY = Internal.createUniqueKey(Tasks.TASKS, "tasks_pkey", Tasks.TASKS.ID);
        public static final UniqueKey<TasksVaribleRecord> TASKS_VARIBLE_PKEY = Internal.createUniqueKey(TasksVarible.TASKS_VARIBLE, "tasks_varible_pkey", TasksVarible.TASKS_VARIBLE.ID);
        public static final UniqueKey<TransactionRecord> TRANSACTION_PKEY = Internal.createUniqueKey(Transaction.TRANSACTION, "transaction_pkey", Transaction.TRANSACTION.ID);
        public static final UniqueKey<TransactionstatusRecord> TRANSACTIONSTATUS_PKEY = Internal.createUniqueKey(Transactionstatus.TRANSACTIONSTATUS, "transactionstatus_pkey", Transactionstatus.TRANSACTIONSTATUS.ID);
        public static final UniqueKey<TxAccountRecord> TX_ACCOUNT_PKEY = Internal.createUniqueKey(TxAccount.TX_ACCOUNT, "tx_account_pkey", TxAccount.TX_ACCOUNT.ID);
        public static final UniqueKey<TxKullaniciRolRecord> TX_KULLANICI_ROL_PKEY = Internal.createUniqueKey(TxKullaniciRol.TX_KULLANICI_ROL, "tx_kullanici_rol_pkey", TxKullaniciRol.TX_KULLANICI_ROL.ID);
        public static final UniqueKey<TxMenuRecord> TX_MENU_PKEY = Internal.createUniqueKey(TxMenu.TX_MENU, "tx_menu_pkey", TxMenu.TX_MENU.ID);
        public static final UniqueKey<TxPageRecord> TX_PAGE_PKEY = Internal.createUniqueKey(TxPage.TX_PAGE, "tx_page_pkey", TxPage.TX_PAGE.ID);
        public static final UniqueKey<TxRolRecord> TX_ROL_PKEY = Internal.createUniqueKey(TxRol.TX_ROL, "tx_rol_pkey", TxRol.TX_ROL.ID);
        public static final UniqueKey<TxRolYetkiRecord> TX_ROL_YETKI_PKEY = Internal.createUniqueKey(TxRolYetki.TX_ROL_YETKI, "tx_rol_yetki_pkey", TxRolYetki.TX_ROL_YETKI.ID);
        public static final UniqueKey<TxUserRecord> TX_USER_PKEY = Internal.createUniqueKey(TxUser.TX_USER, "tx_user_pkey", TxUser.TX_USER.ID);
        public static final UniqueKey<TxUserRecord> UK_JG7S0YYCVJC2VYMM802F4K4F5 = Internal.createUniqueKey(TxUser.TX_USER, "uk_jg7s0yycvjc2vymm802f4k4f5", TxUser.TX_USER.EMAIL);
        public static final UniqueKey<TxUserRecord> UKQGCJWGWCP8I0G7B1E73NOA5WF = Internal.createUniqueKey(TxUser.TX_USER, "ukqgcjwgwcp8i0g7b1e73noa5wf", TxUser.TX_USER.USERNAME);
        public static final UniqueKey<TxYetkiRecord> TX_YETKI_PKEY = Internal.createUniqueKey(TxYetki.TX_YETKI, "tx_yetki_pkey", TxYetki.TX_YETKI.ID);
        public static final UniqueKey<UsersRecord> USERS_PKEY = Internal.createUniqueKey(Users.USERS, "users_pkey", Users.USERS.ID);
        public static final UniqueKey<UsersRecord> UK_3G1J96G94XPK3LPXL2QBL985X = Internal.createUniqueKey(Users.USERS, "uk_3g1j96g94xpk3lpxl2qbl985x", Users.USERS.NAME);
        public static final UniqueKey<Users_Record> USERS__PKEY = Internal.createUniqueKey(Users_.USERS_, "users__pkey", Users_.USERS_.ID);
        public static final UniqueKey<Users__Record> USERS___PKEY = Internal.createUniqueKey(Users__.USERS__, "users___pkey", Users__.USERS__.ID);
        public static final UniqueKey<Users__Record> UK_DTVPUO1FEI1VU7FC46LVPP39N = Internal.createUniqueKey(Users__.USERS__, "uk_dtvpuo1fei1vu7fc46lvpp39n", Users__.USERS__.NAME);
        public static final UniqueKey<WaitingStateRecord> WAITING_STATE_PKEY = Internal.createUniqueKey(WaitingState.WAITING_STATE, "waiting_state_pkey", WaitingState.WAITING_STATE.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<CompletedStateRecord, ProcessStateRecord> COMPLETED_STATE__FK38CS25K0I7EP323ILRQUM76Q = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.PROCESS_STATE_PKEY, CompletedState.COMPLETED_STATE, "completed_state__fk38cs25k0i7ep323ilrqum76q", CompletedState.COMPLETED_STATE.PROCESSSTATE_COMPLETEDSTATE);
        public static final ForeignKey<ModifiedEntityRecord, CustomtrackingrevisionentityRecord> MODIFIED_ENTITY__FK401W1WJ7GYCETRYWNXRIN3FEG = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.CUSTOMTRACKINGREVISIONENTITY_PKEY, ModifiedEntity.MODIFIED_ENTITY, "modified_entity__fk401w1wj7gycetrywnxrin3feg", ModifiedEntity.MODIFIED_ENTITY.REVISION_ID);
        public static final ForeignKey<PayStateRecord, InitialStateRecord> PAY_STATE__FKNXDQFFU9M3X1R6C4UQ15Y9PQB = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.INITIAL_STATE_PKEY, PayState.PAY_STATE, "pay_state__fknxdqffu9m3x1r6c4uq15y9pqb", PayState.PAY_STATE.INITIAL_STATE);
        public static final ForeignKey<PaymentRecord, TransactionRecord> PAYMENT__FKH1BB7AUFNADO7E3FEUJSQJ75Q = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TRANSACTION_PKEY, Payment.PAYMENT, "payment__fkh1bb7aufnado7e3feujsqj75q", Payment.PAYMENT.TRANSACTION_ID);
        public static final ForeignKey<TasksVaribleRecord, TasksRecord> TASKS_VARIBLE__FK8H0F1B32O348T1FD09YQG4C92 = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TASKS_PKEY, TasksVarible.TASKS_VARIBLE, "tasks_varible__fk8h0f1b32o348t1fd09yqg4c92", TasksVarible.TASKS_VARIBLE.TASK_ID);
        public static final ForeignKey<TransactionRecord, TransactionstatusRecord> TRANSACTION__FK4PIAQKVC5TVNEWT8B53YI687A = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TRANSACTIONSTATUS_PKEY, Transaction.TRANSACTION, "transaction__fk4piaqkvc5tvnewt8b53yi687a", Transaction.TRANSACTION.STATUS_ID);
        public static final ForeignKey<TxKullaniciRolRecord, TxRolRecord> TX_KULLANICI_ROL__FKJSJV5OO3OJOTN4B7FXMKHJK87 = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_ROL_PKEY, TxKullaniciRol.TX_KULLANICI_ROL, "tx_kullanici_rol__fkjsjv5oo3ojotn4b7fxmkhjk87", TxKullaniciRol.TX_KULLANICI_ROL.ROLE_ID);
        public static final ForeignKey<TxKullaniciRolRecord, TxUserRecord> TX_KULLANICI_ROL__FKK3F8TSI5VN6W3QSRRK1YWG5QJ = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_USER_PKEY, TxKullaniciRol.TX_KULLANICI_ROL, "tx_kullanici_rol__fkk3f8tsi5vn6w3qsrrk1ywg5qj", TxKullaniciRol.TX_KULLANICI_ROL.USER_ID);
        public static final ForeignKey<TxMenuRecord, TxPageRecord> TX_MENU__FK7THA45RNUYC3K8TM8ODOP0LGI = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_PAGE_PKEY, TxMenu.TX_MENU, "tx_menu__fk7tha45rnuyc3k8tm8odop0lgi", TxMenu.TX_MENU.PAGE_ID);
        public static final ForeignKey<TxMenuRecord, TxMenuRecord> TX_MENU__FKMFGJ0GN9Y8PNY1RD31OCGPWB7 = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_MENU_PKEY, TxMenu.TX_MENU, "tx_menu__fkmfgj0gn9y8pny1rd31ocgpwb7", TxMenu.TX_MENU.PARENT_ID);
        public static final ForeignKey<TxRolYetkiRecord, TxRolRecord> TX_ROL_YETKI__FK86F9OLGXPYWSWCM7CTBOOBJDE = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_ROL_PKEY, TxRolYetki.TX_ROL_YETKI, "tx_rol_yetki__fk86f9olgxpywswcm7ctboobjde", TxRolYetki.TX_ROL_YETKI.ROLE_ID);
        public static final ForeignKey<TxRolYetkiRecord, TxYetkiRecord> TX_ROL_YETKI__FK2WVPJW8UEJY8MM7H4Q6M6YKUX = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_YETKI_PKEY, TxRolYetki.TX_ROL_YETKI, "tx_rol_yetki__fk2wvpjw8uejy8mm7h4q6m6ykux", TxRolYetki.TX_ROL_YETKI.YETKI_ID);
        public static final ForeignKey<TxYetkiRecord, TxMenuRecord> TX_YETKI__FKI36LTSB5IU3TK4YLVDJOGLS4A = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.TX_MENU_PKEY, TxYetki.TX_YETKI, "tx_yetki__fki36ltsb5iu3tk4ylvdjogls4a", TxYetki.TX_YETKI.MENU_ID);
        public static final ForeignKey<UserAuthoritiesRecord, UsersRecord> USER_AUTHORITIES__FKHIIIB540JF74GKSGB87OOFNI = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.USERS_PKEY, UserAuthorities.USER_AUTHORITIES, "user_authorities__fkhiiib540jf74gksgb87oofni", UserAuthorities.USER_AUTHORITIES.USER_ID);
        public static final ForeignKey<UserAuthoritiesRecord, AuthoritiesRecord> USER_AUTHORITIES__FK6Y0U41DO0GYNBGVLWNQNGJUDF = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.AUTHORITIES_PKEY, UserAuthorities.USER_AUTHORITIES, "user_authorities__fk6y0u41do0gynbgvlwnqngjudf", UserAuthorities.USER_AUTHORITIES.AUTHORITY_ID);
        public static final ForeignKey<WaitingStateRecord, ProcessStateRecord> WAITING_STATE__FKJ0M5FENAYWMS4X4C4IWMD8PXU = Internal.createForeignKey(com.experts.core.biller.statemachine.api.model.jooq.Keys.PROCESS_STATE_PKEY, WaitingState.WAITING_STATE, "waiting_state__fkj0m5fenaywms4x4c4iwmd8pxu", WaitingState.WAITING_STATE.PROCESS_ID);
    }
}