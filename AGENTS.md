# AGENTS.md - Proyecto Spring Boot (Práctica Git)

## Stack Tecnológico
- Java 17
- Spring Boot 3.3.0
- Maven
- Spring Web (Spring MVC embebido)
- Spring Data JPA
- MySQL (mysql-connector-j)
- Thymeleaf
- Bootstrap 5.3.0 (CDN)
- Bootstrap Icons 1.11.0 (CDN)

## Rutas principales
- `/` - Dashboard principal (DashboardController)
- `/users` - Listado de usuarios (UserController)
- `/users/new` - Formulario nuevo usuario
- `/users/{id}/edit` - Editar usuario
- `/users/{id}/delete` - Eliminar usuario
- `/hello` - Endpoint de prueba (HelloController)

## Comandos útiles

### Ejecutar la aplicación
```bash
mvn spring-boot:run
```

### Ejecutar tests
```bash
mvn test
```

### Compilar el proyecto
```bash
mvn clean compile
```

### Empaquetar (JAR)
```bash
mvn clean package
```

## Estructura del proyecto
```
src/
├── main/
│   ├── java/com/example/
│   │   ├── Application.java              -- Clase principal
│   │   ├── controller/
│   │   │   ├── DashboardController.java  -- Controlador dashboard (/)
│   │   │   ├── HelloController.java      -- Endpoint prueba (/hello)
│   │   │   └── UserController.java       -- Gestión usuarios (/users)
│   │   ├── model/
│   │   │   └── User.java                 -- Entidad JPA Usuario (@Entity)
│   │   ├── repository/
│   │   │   └── UserRepository.java       -- Repositorio JPA (JpaRepository)
│   │   └── service/
│   │       └── UserService.java          -- Lógica de negocio (usa UserRepository)
│   └── resources/
│       ├── application.properties        -- Configuración MySQL y JPA
│       ├── static/
│       │   └── css/
│       │       └── style.css             -- Estilos personalizados (gradientes, cards, navbar)
│       └── templates/
│           ├── dashboard.html            -- Vista dashboard principal
│           ├── fragments/
│           │   └── navbar.html           -- Fragmento reutilizable navbar
│           └── users/
│               ├── list.html             -- Listado de usuarios
│               └── form.html             -- Formulario crear/editar usuario
└── test/java/com/example/
```

## Convenciones
- Inyección por constructor
- Controladores MVC con `@Controller`
- Vistas Thymeleaf en `templates/<entidad>/`
- Usar `@RequestMapping` a nivel de clase para prefijos de ruta
- Fragmentos Thymeleaf reutilizables en `templates/fragments/`
- Incluir navbar en todas las vistas con: `<div th:replace="~{fragments/navbar :: navbar}"></div>`
- Usar `margin-top: 5rem` en containers para compensar navbar fijo
- Estilos personalizados en `static/css/style.css`
- Bootstrap y Bootstrap Icons vía CDN

## Base de datos MySQL
- **Nombre**: gitproyect
- **Usuario**: root
- **Puerto**: 3306
- **DDL Auto**: update (crea/actualiza tablas automáticamente)
- **Tabla**: users (generada desde entidad User con @Entity)

## Almacenamiento
- Persistencia en MySQL mediante Spring Data JPA
- UserRepository extiende JpaRepository<User, Long>
- UserService inyecta UserRepository para operaciones CRUD
- Los datos persisten entre reinicios de la aplicación
