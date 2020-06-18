INSERT INTO `empresa` (`id`,`cnpj`,`data_atualizacao`,`data_criacao`,`razao_social`)
VALUES (NULL, '82198127000121',CURRENT_DATE(), CURRENT_DATE(), 'EmpresaModelo');

INSERT INTO `funcionario` (`id`,`cpf`,`data_atualizacao`, `data_criacao`,`email`,`nome`,
`perfil`,`qtd_horas_almoco`,`qtd_horas_trabalho_dia`,`senha`,`valor_hora`, `empresa_id`)
VALUES (NULL, '16248890935', CURRENT_DATE(), CURRENT_DATE(), 'admin@empresamodelo.com' , 'ADMIN', 'ROLE_ADMIN', NULL, NULL,
'$2a$10$qpOhsRCtL7GKMloWczDdYumEcylqolCx/VbeFQyw4By6BIo0wo/H6', NULL,
(SELECT `id` FROM `empresa` WHERE `cnpj`='82198127000121'));