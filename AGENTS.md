# AGENTS.md - Proyecto Spring Boot

## Stack Tecnológico
- Java 17
- Spring Boot 3.3.0
- Maven
- Spring Web (Spring MVC embebido)

## Comandos útiles

### Ejecutar la aplicación
```bash
./mvnw spring-boot:run
```

### Ejecutar tests
```bash
./mvnw test
```

### Compilar el proyecto
```bash
./mvnw clean compile
```

### Empaquetar (JAR)
```bash
./mvnw clean package
```

## Estructura del proyecto
```
src/
├── main/
│   ├── java/com/example/
│   │   ├── Application.java           -- Clase principal
│   │   ├── controller/                -- Controladores REST
│   │   ├── model/                     -- Entidades/DTOs
│   │   ├── repository/                -- Repositorios JPA
│   │   └── service/                   -- Lógica de negocio
│   └── resources/
│       ├── application.properties     -- Configuración
│       ├── static/                    -- Archivos estáticos
│       └── templates/                 -- Plantillas (Thymeleaf, etc.)
└── test/java/com/example/
```

## Convenciones
- Prefijo para beans: no usar prefijos (ej: `UserService`, no `userService`?)
- Seguir convenciones estándar de Spring: inyección por constructor
- Controladores REST con `@RestController`
- Usar `@RequestMapping` a nivel de clase para prefijos de ruta
