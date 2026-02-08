
-- Create event table
create table event (
     id serial,
     name text,
     event_date timestamp,
     venue text,
     capacity integer,
     created_at timestamp with time zone,
     updated_at timestamp with time zone,
     constraint pk_event primary key (id)
);
