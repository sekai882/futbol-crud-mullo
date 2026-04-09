# ⚽ Gestión de Futbolistas - UDLA

<p align="center">
  <img src="https://img.shields.io/badge/STATUS-COMPLETADO-green?style=for-the-badge" alt="Status">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" alt="Java">
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.5-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot">
</p>

## 📝 Descripción del Proyecto
Este es un proyecto desarrollado para la materia de **Ingeniería Web** en la Universidad de las Américas (UDLA). Consiste en una aplicación web completa que permite gestionar una base de datos de futbolistas, integrando seguridad y el patrón de diseño **MVC (Model-View-Controller)**.

## 🚀 Funcionalidades
- **Sistema de Autenticación:** Registro de nuevos usuarios e inicio de sesión con contraseñas encriptadas mediante **BCrypt**.
- **Seguridad de Rutas:** Acceso restringido a la gestión de futbolistas; las URLs protegidas redireccionan al login automáticamente si no hay una sesión activa.
- **CRUD Completo:** - 🟢 **Crear:** Registro de futbolistas (Nombre, Equipo, Posición, Edad, Valor).
  - 🔵 **Leer:** Listado dinámico con Bootstrap y Thymeleaf.
  - 🟡 **Actualizar:** Edición de datos de jugadores existentes.
  - 🔴 **Eliminar:** Borrado lógico de registros de la base de datos.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java 17
- **Framework:** Spring Boot 4.0.5 (Spring Data JPA, Spring Security, Spring Web)
- **Base de Datos:** SQL Server Express
- **Motor de Plantillas:** Thymeleaf
- **Estilos:** Bootstrap 5 (vía CDN)
- **Herramientas:** Maven, Lombok, IntelliJ IDEA

## 📁 Acceso y Configuración

### Requisitos Previos
1. Tener instalado **SQL Server Express**.
2. Crear una base de datos llamada `FutbolDB`.
3. Configurar un usuario con los siguientes permisos (o ajustar en `application.properties`):
   - **User:** `admin1`
   - **Password:** `admin123`

### Ejecución
1. Clona el repositorio:
   ```bash
   git clone https://github.com/sekai882/futbol-crud-mullo.git
2. Importa el proyecto en IntelliJ IDEA como un proyecto Maven.
3. Ejecuta la aplicación desde FutbolManagerCrudApplication.java.
4. Accede en tu navegador a: http://localhost:8080/login

👤 Autor

Josué André Mullo Vega
Estudiante de Ingeniería de Software - UDLA
GitHub: @sekai882

Email: josue.mullo@udla.edu.ec

<p align="center">Proyecto realizado con fines académicos - 2026</p>
