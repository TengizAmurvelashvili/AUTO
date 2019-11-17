alter table AUTO_CAR add constraint FK_AUTO_CAR_ON_MANUFACTURER foreign key (MANUFACTURER_ID) references AUTO_MANUFACTURER(ID);
alter table AUTO_CAR add constraint FK_AUTO_CAR_ON_MODEL foreign key (MODEL_ID) references AUTO_MODEL(ID);
alter table AUTO_CAR add constraint FK_AUTO_CAR_ON_OPTION foreign key (OPTION_ID) references AUTO_OPTION(ID);
create index IDX_AUTO_CAR_ON_MANUFACTURER on AUTO_CAR (MANUFACTURER_ID);
create index IDX_AUTO_CAR_ON_MODEL on AUTO_CAR (MODEL_ID);
create index IDX_AUTO_CAR_ON_OPTION on AUTO_CAR (OPTION_ID);
