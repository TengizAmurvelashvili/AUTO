alter table AUTO_OPTION add constraint FK_AUTO_OPTION_ON_MODEL foreign key (MODEL_ID) references AUTO_MODEL(ID);
create index IDX_AUTO_OPTION_ON_MODEL on AUTO_OPTION (MODEL_ID);
