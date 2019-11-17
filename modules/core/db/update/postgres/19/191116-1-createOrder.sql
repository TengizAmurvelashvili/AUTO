create table AUTO_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_NUMBER text not null,
    CAR_ID uuid not null,
    CUSTOMER_ID uuid not null,
    PRICE decimal(19, 2),
    MANAGER_ID uuid,
    --
    primary key (ID)
);