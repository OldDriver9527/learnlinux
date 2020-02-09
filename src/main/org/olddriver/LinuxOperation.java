package org.olddriver;

public class LinuxOperation {
    /*
    * LinuxOperation操作
    *
    * 1.命令解析器
    * unix系统命令解析器称为shell
    * linux系统命令解析器称为bash
    *
    * 2.光标相关快捷键
    * ctrl + p 光标上移
    * ctrl + n 光标下移
    * ctrl + b 光标后移
    * ctrl + f 光标前移
    * ctrl + a 光标移动行首
    * ctrl + e 光标移动行尾
    * ctrl + d 删除光标后一个字符
    * ctrl + h 删除光标前一个字符
    * ctrl + u 删除光标前所有字符
    *
    * 3.目录结构
    * /     根目录
    * /bin  存放可执行文件
    * /boot 存放开机启动项
    * /dev  存放设备文件
    * /etc  存放配置文件
    * /home 存放用户主目录
    * /lib  存放动态连接库
    * /media 自动挂载设备目录
    * /mnt  手动挂载设备目录
    * /root 超级用户目录
    * /usr  用户软件资源目录
    * /var  存放运行时会改变的文件
    *
    * 4.切换目录
    * cd 命令用于切换目录 cd dirname
    * 目录路径写法分为 相对路径以及绝对路径
    * 绝对路径 从/开始
    * 相对路径 不从/开始
    * . 表示当前目录
    * .. 表示上一级目录
    * ～ 表示用户家目录
    *
    * 5.命令提示符含义
    * [用户名@主机名 当前目录]$/#
    * $ 表示普通用户
    * # 表示超级用户
    *
    * 6.查看目录
    * tree 查看目录树状图
    * tree dirname
    *
    * ls 查看目录中内容
    * -l 展示目录详细信息，详细信息包括文件类型，文件权限，文件所有者，文件所属组，文件修改时间，文件名
    * -a 展示目录中所有内容，包括隐藏文件
    *
    * 7.pwd 打印当前工作目录
    * 8.目录，文件相关操作
    * mkdir 创建目录
    * mkdir [-p] dirname
    * -p 表示父目录若不存在，创建父目录
    *
    * rmdir 删除空目录
    * rmdir dirname
    *
    * rm 删除目录
    * rm -r dirname
    * -r 表示递归删除
    * -i 删除前进行提示
    *
    * touch 创建文件
    * touch filename
    *
    * rm 删除文件
    * rm filename
    * -i 删除文件前进行提示
    *
    * cp 复制文件，目录
    * cp oldfilepath newfilepath
    * cp -r olddirpath newdirpath
    *
    * mv 移动目录，文件；或重命名文件
    * mv oldfilename newfilename
    * mv oldfilename dirname
    *
    * cat 查看文件所有内容
    * more 查看文件部分内容
    * less 查看文件部分内容
    * head 查看文件前10行
    * tail 查看文件后10行
    * -f 追踪显示
    *
    * 9.创建链接
    * ln -s 绝对路径 软链接名称
    * 使用绝对路径使软链接可以在任意位置使用
    * ln 文件名 硬链接名
    *
    * 10.查看文件行数
    * wc filename
    *
    * 11.查看目录占用空间
    * du -h dirname
    *
    * 12.查看磁盘占用空间
    * df -h
    *
    * 13.文件权限相关操作
    * 修改文件权限
    * chmod [u|g|o|a][+|-|=][r|w|x] filename
    * u-文件所有者
    * g-文件所属组
    * o-其他人
    * a-所有人
    * +-添加权限
    * --减少权限
    * =-覆盖权限
    * r-读权限
    * w-写权限
    * x-执行权限
    *
    * 修改文件所有者
    * chown newown filename
    *
    * 修改文件所有者，同时修改文件所属组
    * chown newown:newgroup filename
    *
    * 修改文件所属组
    * chgrp newgroup filename
    *
    *14.文件查找
    * 按文件名查找
    *
    */
}
