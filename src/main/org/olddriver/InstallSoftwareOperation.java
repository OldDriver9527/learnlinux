package org.olddriver;

public class InstallSoftwareOperation {
    /*
    * 安装jdk
    * 1.下载jdk压缩包
    * 2.将压缩包解压到/usr/local/下
    * 3.配置环境变量，将JAVA_HOME添加到PATH中
    *
    * 安装tomcat
    * 1.下载tomcat压缩包
    * 2.将压缩包解压到/usr/local目录下
    * 3.执行bin目录下startup.sh脚本运行tomcat
    *
    * 安装mysql
    * 1.下载mysql压缩包
    * 2.将压缩包解压到/usr/local目录下，对解压目录重命名为mysql
    * 3.添加mysql组，添加mysql用户
    * groupadd mysql
    * useradd -r -g mysql -s /bin/false mysql
    * 4.修改配置
    * 在/etc/目录下添加my.cnf配置文件
    * my.cnf中添加配置
    * [mysql]
    * default-character-set=utf8
    * [mysqld]
    * default-storage-engine=INNODB
    * character_set_server=utf8
    *
    * 将mysql.server文件 复制到 /etc/init.d/mysql
    * 添加basedir，datadir 两个路径
    * 5.将mysql目录中所有文件文件所有者，文件所属组修改为mysql
    * chown -R mysql:mysql path
    * 6.初始化mysql
    * bin/mysqld --initialize --user=mysql --basedir=path --datadir=path
    * 完成后生成data目录，生成root用户临时密码
    * 7.mysql加密
    * bin/mysql_ssh_rsa_setup --datadir=path
    * 8.配置环境变量
    * 9.启动mysql服务
    * 10.为远程登陆root用户授权
    * 创建账户
    * create user root@'%' identified by '密码';
    * 赋予权限
    * grant all privileges on *.* to root@'%' with grant option;
    *
     */
}
