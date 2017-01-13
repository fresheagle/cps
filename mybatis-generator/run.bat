@echo off



echo= 
echo 开始执行mybatis自动生成代码脚本
echo= 

set cpath=%~dp0
cd %cpath%

if exist src (
	echo 删除src目录
	rd src /s /q	
)

echo 创建src目录
md src


echo=

Java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite

echo=
echo 执行完成
echo=

pause