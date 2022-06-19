create table telefone
(
    id     int     not null,
    ddd    int(3)  not null,
    numero int(13) not null,
    primary key (id)
);
CREATE TABLE usuario
(
    id          int         NOT NULL auto_increment,
    email       varchar(20) not null,
    senha       varchar(20) not null,
    nome        varchar(20) not null,
    sobrenome   varchar(20) not null,
    cpf         varchar(11) not null,
    id_telefone int         not null,

    constraint fk_telefone foreign key (id_telefone) references telefone (id),
    primary key (id)

);


create table endereco
(
    id      int         not null auto_increment,
    quadra  varchar(10) not null,
    alameda int(3) not null,
    lote    int(3) not null,
    bairo   varchar(10) not null,
    cep     varchar(19) not null,
    primary key (id)
);

create table categoria_pet
(
    id   int,
    tipo varchar(15),
    primary key (id)
);

create table cuidador
(
    id                            int not null not null auto_increment,
    id_user                       int,
    id_endereco                   int,
    desc_local                    varchar(200),
    id_cuidador_tem_categoria_pet int,


    foreign key (id_user) references usuario (id),
    foreign key (id_endereco) references endereco (id),
    primary key (id)

);


create table cuidador_tem_categoria_pet
(
    id_categoria_pet int,
    id_tipo_cuidador int,
    tamanho          double,
    peso             double,
    raca             varchar(20),
    constraint pk_cuidador primary key (id_categoria_pet, id_tipo_cuidador),
    FOREIGN KEY (id_categoria_pet) REFERENCES categoria_pet (id),
    FOREIGN KEY (id_tipo_cuidador) REFERENCES cuidador (id)

);

