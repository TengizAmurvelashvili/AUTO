alter table AUTO_CAR add constraint FK_AUTO_CAR_ON_COLOR foreign key (COLOR_ID) references AUTO_COLOR(ID);
create index IDX_AUTO_CAR_ON_COLOR on AUTO_CAR (COLOR_ID);
