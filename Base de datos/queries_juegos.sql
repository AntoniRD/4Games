
-- inserts de prueba

INSERT INTO juegos (nombreJuego, descripcionJuego, multiplayer) VALUES ('Minecraft', 'Juego tipo sandbox', true);

INSERT INTO usuarios VALUES ('43121765P', 'vitaly', SHA1('1234'), 'vitalysastre@gmail.com');

INSERT INTO calificaciones VALUES();



-- constraint checks
ALTER TABLE calificaciones
ADD CHECK ((puntuacion < 6) AND (puntuacion > 0));

ALTER TABLE `calificaciones` ADD UNIQUE `unique_index`(`Juegos_NombreJuegos`, `Usuarios_Dni`);

