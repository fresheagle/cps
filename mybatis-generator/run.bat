@echo off



echo= 
echo ��ʼִ��mybatis�Զ����ɴ���ű�
echo= 

set cpath=%~dp0
cd %cpath%

if exist src (
	echo ɾ��srcĿ¼
	rd src /s /q	
)

echo ����srcĿ¼
md src


echo=

Java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite

echo=
echo ִ�����
echo=

pause