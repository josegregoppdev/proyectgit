# AGENTS.md - Proyecto Spring Boot (Práctica Git)

## Stack Tecnológico
- Java 17
- Spring Boot 3.3.0
- Maven
- Spring Web (Spring MVC embebido)
- Thymeleaf

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
│   │   ├── Application.java           -- Clase principal
│   │   ├── controller/                -- Controladores MVC (@Controller)
│   │   ├── model/                     -- Entidades/DTOs
│   │   ├── repository/                -- Repositorios JPA
│   │   └── service/                   -- Lógica de negocio
│   └── resources/
│       ├── application.properties     -- Configuración
│       ├── static/                    -- Archivos estáticos
│       └── templates/
│           └── users/                 -- Vistas Thymeleaf (list, form)
└── test/java/com/example/
```

## Convenciones
- Inyección por constructor
- Controladores MVC con `@Controller`
- Vistas Thymeleaf en `templates/<entidad>/`
- Usar `@RequestMapping` a nivel de clase para prefijos de ruta
