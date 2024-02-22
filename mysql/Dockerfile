FROM mysql:8.0

COPY ./mysql-init/ /docker-entrypoint-initdb.d/

ENV MYSQL_DATABASE=OnlineElectronicsStore
ENV MYSQL_ROOT_PASSWORD=rootpass
ENV MYSQL_USER=user
ENV MYSQL_PASSWORD=pass

EXPOSE 3306
