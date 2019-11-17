-- alter table AUTO_CAR add column COLOR_ID uuid ^
-- update AUTO_CAR set COLOR_ID = <default_value> ;
-- alter table AUTO_CAR alter column COLOR_ID set not null ;
alter table AUTO_CAR add column COLOR_ID uuid not null ;
