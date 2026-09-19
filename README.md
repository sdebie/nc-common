# nc-common

Nursery Common Library - Contains shared entities, DTOs, repositories, and utilities for the Nursery Management System.

## Structure

- **entity/** - JPA entities for database models
- **dto/** - Data Transfer Objects for API communication
- **repository/** - Panache repositories for data access
- **enums/** - Enum definitions for status, types, etc.
- **util/** - Utility classes and helpers

## Building

```bash
mvn clean install
```

## Dependencies

- Jakarta EE (CDI, Persistence, Validation)
- Quarkus Hibernate ORM Panache
- Lombok
- Jackson
