alter table AUTO_MODEL add constraint FK_AUTO_MODEL_ON_MANUFACTURER foreign key (MANUFACTURER_ID) references AUTO_MANUFACTURER(ID);
create index IDX_AUTO_MODEL_ON_MANUFACTURER on AUTO_MODEL (MANUFACTURER_ID);
