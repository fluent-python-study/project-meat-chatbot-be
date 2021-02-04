FROM mariadb:10.5.8
ARG PASSWORD
ENV MYSQL_ROOT_PASSWORD=$PASSWORD \
    MYSQL_DATABASE=project_meat_chatbot \
    MYSQL_USER=project_meat \
    MYSQL_PASSWORD=$PASSWORD
EXPOSE 3306
ADD scripts/initialize_db.sql /docker-entrypoint-initdb.d
