
-- Create receipt table
create table evento (
     id serial,
     nome text,
     data timestamp,
     local text,
     capacidade numeric,
     data_criacao timestamp,
     data_atualizacao timestamp,
     constraint pk_evento primary key (id)
);
