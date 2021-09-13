CREATE TABLE filmes (
    idfilme int primary key auto_increment,
    descrfilme VARCHAR2(150) NOT NULL,
    dtfilme    int          NOT NULL,
    rating     NUMBER(2)   NOT NULL );
    
INSERT INTO filmes(descrfilme, dtfilme, rating) VALUES ('As Branquelas', 2005, 10);
INSERT INTO filmes(descrfilme, dtfilme, rating) VALUES ('A origem', 2010, 10);
INSERT INTO filmes(descrfilme, dtfilme, rating) VALUES ('Lanterna Verde', 2011, 5);
INSERT INTO filmes(descrfilme, dtfilme, rating) VALUES ('Matrix', 1999, 10);