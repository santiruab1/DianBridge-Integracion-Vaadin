@echo off
rem Maven wrapper for Windows

setlocal

set MAVEN_OPTS=-Xmx1024m -XX:MaxPermSize=256m

if "%JAVA_HOME%"=="" (
  echo "JAVA_HOME environment variable is not set."
  exit /b 1
)

set MAVEN_VERSION=3.8.6
set MAVEN_HOME=%~dp0.mvn\apache-maven-%MAVEN_VERSION%
set PATH=%MAVEN_HOME%\bin;%PATH%

mvn %*

endlocal