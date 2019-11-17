create unique index IDX_AUTO_COUNTRY_UK_COUNTRY on AUTO_COUNTRY (COUNTRY) where DELETE_TS is null ;
create unique index IDX_AUTO_COUNTRY_UK_CODE on AUTO_COUNTRY (CODE) where DELETE_TS is null ;
