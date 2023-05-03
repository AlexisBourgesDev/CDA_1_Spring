create table site
(
    id   int auto_increment primary key ,
    name text null
);
alter table salle
    add id_salle int null;

alter table salle
    add constraint salle_site_id_fk
        foreign key (id_salle) references site (id);

