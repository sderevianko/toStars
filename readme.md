##### Docker команда для запуска БД (Windows)
docker run -p 5432:5432 --name test -e POSTGRES_PASSWORD=526 -e POSTGRES_USER=serg -d postgres