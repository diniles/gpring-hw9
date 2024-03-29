# Фреймворк Spring (семинары)

## Урок 9. Spring Cloud. Микросервисная архитектура.

омашнее задание

Разработайте микросервисную архитектуру для онлайн-магазина электроники с использованием Spring Cloud. Структура должна включать:

1. Сервис "Товары": Управление каталогом товаров (добавление, удаление, просмотр).
2. Сервис "Корзина": Добавление товаров в корзину, удаление товаров из корзины и оформление заказа.
3. Сервис "Отзывы": Добавление и просмотр отзывов на товары.
4. API Gateway: Централизованный вход для обработки всех запросов.
5. Используйте Eureka для обнаружения сервисов

Альтернативно, можно перевести свой текущий проект на микросервисную архитектуру

Docker for MySQL
docker build -t mysql-img ./mysql/mysql-init/
docker run --name mysql-container -p 3306:3306 -d mysql-img

### How to run

Build all projects:

```bash
eureka/gradlew build
```

```bash
productsService/gradlew build
```

```bash
reviewService/gradlew build
```

```bash
cartService/gradlew build
```

```bash
apiGateway/gradlew build
```

after that run docker-compose:

```bash
docker compose up --build
```
