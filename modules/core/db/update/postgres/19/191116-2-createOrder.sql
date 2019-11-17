alter table AUTO_ORDER add constraint FK_AUTO_ORDER_ON_CAR foreign key (CAR_ID) references AUTO_CAR(ID);
alter table AUTO_ORDER add constraint FK_AUTO_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references AUTO_CUSTOMER(ID);
alter table AUTO_ORDER add constraint FK_AUTO_ORDER_ON_MANAGER foreign key (MANAGER_ID) references SEC_USER(ID);
create index IDX_AUTO_ORDER_ON_CAR on AUTO_ORDER (CAR_ID);
create index IDX_AUTO_ORDER_ON_CUSTOMER on AUTO_ORDER (CUSTOMER_ID);
create index IDX_AUTO_ORDER_ON_MANAGER on AUTO_ORDER (MANAGER_ID);
