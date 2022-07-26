@echo off

if "%JAVA_HOME%" == "" set JAVA_HOME=S:\software\jdk1.5.0_06
if "%ANT_HOME%" == "" set ANT_HOME=S:\software\apache-ant-1.6.1

SET COMPILER_HOME=%JAVA_HOME%\bin

set PATH=%JAVA_HOME%\bin;%ANT_HOME%\bin;%COMPILER_HOME%
ant %1

