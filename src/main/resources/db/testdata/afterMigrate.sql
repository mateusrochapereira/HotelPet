
# mudar valor do telefone ddd e numero para varchar
INSERT INTO telefone(ddd, numero) VALUES ( 63, 992204392);
INSERT INTO usuario (email, senha, nome, sobrenome, cpf, id_telefone) VALUES ('outro95@gmail.com', '123', 'Outro', 'Mias', '0279123149', 2);

INSERT INTO endereco (quadra, alameda, lote, bairo, cep) VALUES ('203 Norte', 11, 4, 'PDN', '7700642143');
INSERT INTO cuidador (id_user, id_endereco, desc_local) VALUES ( 2, 2, 'Nao tem');
INSERT INTO categoria_pet (tipo) VALUES ( 'Papagaio');
INSERT INTO categoria_pet (tipo) VALUES ('Baleia');
INSERT INTO categoria_pet (tipo) VALUES ('golfinho');

#     INSERT INTO webpet_db.cuidador_tem_categoria_pet (id_categoria_pet, id_tipo_cuidador, tamanho, peso, raca) VALUES (1, 1, 1, 20, null);

