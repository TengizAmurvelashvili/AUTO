alter table SEC_USER rename column dtype to dtype__u60973 ;
alter table SEC_USER rename column country_code_id to country_code_id__u96313 ;
alter table SEC_USER drop constraint FK_SEC_USER_ON_COUNTRY_CODE ;
drop index IDX_SEC_USER_ON_COUNTRY_CODE ;
