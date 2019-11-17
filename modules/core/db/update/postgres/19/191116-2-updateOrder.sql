alter table AUTO_ORDER rename column order_number to order_number__u56246 ;
alter table AUTO_ORDER alter column order_number__u56246 drop not null ;
alter table AUTO_ORDER add column ORDER_NUMBER varchar(10) ^
update AUTO_ORDER set ORDER_NUMBER = '' where ORDER_NUMBER is null ;
alter table AUTO_ORDER alter column ORDER_NUMBER set not null ;
