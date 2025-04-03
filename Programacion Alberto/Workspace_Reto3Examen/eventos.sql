CREATE TABLE eventos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    fecha DATE NOT NULL,
    descripcion TEXT
);

INSERT INTO eventos (nombre, fecha, descripcion) VALUES
('Festival de Jazz', '2025-04-18', 'Un evento con los mejores músicos de jazz de la región.'),
('Congreso de Tecnología', '2025-05-25', 'Charlas y talleres sobre innovación y desarrollo tecnológico.'),
('Competencia de Ajedrez', '2025-06-12', 'Torneo abierto de ajedrez para todas las edades.'),
('Feria Gastronómica', '2025-07-08', 'Muestra y degustación de platillos típicos e internacionales.'),
('Maratón Benéfico', '2025-08-20', 'Carrera de 10K para recaudar fondos para causas sociales.');
