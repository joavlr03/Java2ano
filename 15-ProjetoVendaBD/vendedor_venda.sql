-- criação da tabela vendedor
create table java_vendedor (
    id_vendedor number(5) primary key,
    nome_vendedor varchar2(50)
);
commit;

-- criação da tabela venda
create table java_venda (
    id_venda number(5),
    id_vendedor number(5),
    total number(10,2),
    data date,
    primary key(id_venda),
    foreign key (id_vendedor) 
        references java_vendedor(id_vendedor)
        on delete cascade
);
commit;


