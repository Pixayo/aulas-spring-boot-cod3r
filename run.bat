@echo off

:: Esse script é usado para compilar o projeto spring com um JDK local
:: - Não precisa de permissões

set "JAVA_HOME=C:\Users\0023303\Documents\Java-JDK\jdk-21.0.12.1+1"
set "PATH=%JAVA_HOME%\bin;%PATH%"

echo Usando JDK temporario: %JAVA_HOME%
java -version

echo.
echo Iniciando o projeto Spring Boot...
call .\mvnw spring-boot:run