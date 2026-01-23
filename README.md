# Spring Boot Weather Application with Redis Caching

This project is a Spring Boot Weather application built to demonstrate caching concepts from fundamentals to advanced usage using the Spring Cache abstraction and Redis.

The application starts with a basic REST-based Weather service and progressively introduces in-memory caching, cache inspection, and Redis-backed distributed caching to improve performance and reduce redundant data access.

## Key Concepts Covered
- Spring Cache fundamentals and internals
- Enabling caching with `@EnableCaching`
- Cache annotations: `@Cacheable`, `@CachePut`, `@CacheEvict`
- Cache inspection using `CacheManager`
- Redis as a distributed cache
- Cache configuration via application properties

## Tech Stack
- Java 17
- Spring Boot
- Spring Cache
- Redis (Docker)
- Maven

## Use Case
Weather data is frequently requested but does not change often.  
Caching is used to minimize repeated computations and database calls, improving response time and scalability.

## Run Redis (Docker)
```bash
docker run -d --name redis-cache -p 6379:6379 redis:7
