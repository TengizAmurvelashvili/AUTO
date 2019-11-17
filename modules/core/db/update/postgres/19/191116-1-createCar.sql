create table AUTO_CAR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    MANUFACTURER_ID uuid not null,
    MODEL_ID uuid not null,
    OPTION_ID uuid not null,
    ISSUE_YEAR integer,
    PRICE decimal(19, 2),
    --
    primary key (ID)
);