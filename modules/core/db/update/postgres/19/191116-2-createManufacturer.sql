alter table AUTO_MANUFACTURER add constraint FK_AUTO_MANUFACTURER_ON_COUNTRY_CODE foreign key (COUNTRY_CODE_ID) references AUTO_COUNTRY(ID);
create unique index IDX_AUTO_MANUFACTURER_UK_NAME on AUTO_MANUFACTURER (NAME) where DELETE_TS is null ;
create unique index IDX_AUTO_MANUFACTURER_UK_CODE on AUTO_MANUFACTURER (CODE) where DELETE_TS is null ;
create index IDX_AUTO_MANUFACTURER_ON_COUNTRY_CODE on AUTO_MANUFACTURER (COUNTRY_CODE_ID);
