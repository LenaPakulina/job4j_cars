CREATE TABLE files
(
    id      serial primary key,
    name    varchar not null,
    path    varchar not null,
    post_id int NOT NULL REFERENCES auto_posts(id)
);