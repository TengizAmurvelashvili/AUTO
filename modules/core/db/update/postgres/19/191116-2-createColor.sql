create unique index IDX_AUTO_COLOR_UK_CODE on AUTO_COLOR (CODE) where DELETE_TS is null ;
create unique index IDX_AUTO_COLOR_UK_NAME on AUTO_COLOR (NAME) where DELETE_TS is null ;
