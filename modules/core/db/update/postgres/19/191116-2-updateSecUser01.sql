alter table SEC_USER add constraint FK_SEC_USER_ON_COUNTRY_CODE foreign key (COUNTRY_CODE_ID) references AUTO_COUNTRY(ID);
create index IDX_SEC_USER_ON_COUNTRY_CODE on SEC_USER (COUNTRY_CODE_ID);
