
create table usuario
(
    id          int auto_increment
        primary key,
    email       varchar(255) not null,
    senha       varchar(20)  not null,
    nome        varchar(255) not null,
    sobrenome   varchar(255) not null,
    cpf         varchar(11)  not null,
    telefone    varchar(11) not null

);



create table endereco
(
    id      int auto_increment
        primary key,
    quadra  varchar(10) not null,
    alameda int(3)      not null,
    lote    int(3)      not null,
    bairo   varchar(30) not null,
    cep     varchar(19) not null
);
create table cuidador
(
    id          int auto_increment
        primary key,
    id_user     int          null,
    id_endereco int          null,
    desc_local  varchar(200) null,
    constraint cuidador_ibfk_1
        foreign key (id_user) references usuario (id),
    constraint cuidador_ibfk_2
        foreign key (id_endereco) references endereco (id)
);

create table categoria_pet
(
    id   int auto_increment
        primary key,
    tipo varchar(15) null
);

create table cuidador_tem_categoria_pet
(
    id_categoria_pet int         not null,
    id_tipo_cuidador int         not null,
    tamanho           numeric(19,2)      null,
    peso              numeric(19,2)     null,
    raca             varchar(20) null,
    primary key (id_categoria_pet, id_tipo_cuidador),
    constraint cuidador_tem_categoria_pet_ibfk_1
        foreign key (id_categoria_pet) references categoria_pet (id),
    constraint cuidador_tem_categoria_pet_ibfk_2
        foreign key (id_tipo_cuidador) references cuidador (id)
);



