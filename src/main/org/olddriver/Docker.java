package org.olddriver;

public class Docker {
    /*
    * Docker
    * 属于操作系统层面的虚拟化技术
    * Docker容器与传统虚拟机相比，能更高效利用系统资源，运行速度更快，便于迁移
    *
    * Docker引擎
    * 一般被称为docker或docker平台，是一种客户端/服务器应用程序
    * 服务器为一个长时间运行的守护进行
    * 客户端为命令行工具
    *
    * Docker Image
    * docker镜像是docker三大组件之一，创建docker容器的模板
    * 镜像中包含操作系统完整的root文件系统
    * 镜像采用分层存储结构
    *
    * Docker Container
    * docker容器是docker镜像的一个可运行实例
    *
    * Docker Repository Docker Registry
    * docker注册中心包含多个docker仓库
    * 一个docker仓库包含多个标签，每个标签对应一个docker镜像
    * 通常，一个docker仓库存储同一软件不同版本的多个镜像，标签指定软件版本
    *
    * Docker版本
    * Docker划分为社区版(CE)和企业版(EE)
    *
    * Docker安装(参考官网安装步骤)
    * i.卸载原有docker
    * yum remove docker \
                  docker-client \
                  docker-client-latest \
                  docker-common \
                  docker-latest \
                  docker-latest-logrotate \
                  docker-logrotate \
                  docker-engine
     * ii.安装必要软件包
     * yum install -y yum-utils \
        device-mapper-persistent-data \
        lvm2
     * iii.安装最新版本docker引擎
     * yum install docker-ce docker-ce-cli containerd.io
     *
     * 配置Docker镜像加速器
     * docker默认从docker hub拉取镜像，可配置镜像加速器，从国内注册中心拉取镜像
     * 在/etc/docker/下添加文件daemon.json
     * 添加
     * {
     *  "registry-mirrors":["https://registry.docker-cn.com"]
     * }
     * 然后从其docker
     * systemctl daemon-reload
     * systemctl restart docker
     *
     * 获取docker镜像
     * docker运行容器前，需本地存在对应镜像。若镜像不存在，docker会从注册中心下载对应镜像
     * docker pull [registry url/]repository[:tag]
     * docker 运行docker可执行二进制文件
     * pull 从registry拉取镜像
     *
     * 根据镜像创建容器并运行，在容器中运行命令
     * docker run [option] repository:tag [命令]
     * docker run -it --rm ubuntu:16.04 bash
     * -it i以交互模式运行容器
     *     t分配伪终端
     * --rm 容器推出后删除容器
     *
     * 查看所有本地镜像列表
     * docker image ls/docker images
     *
     * 镜像尺寸
     * 通过docker image ls 查看的镜像尺寸与docker hub上不同
     * docker hub显示的镜像尺寸为压缩后尺寸
     * 所有镜像尺寸求和并非是镜像实际磁盘占用情况，因为镜像采用分层存储
     *
     * 虚悬镜像(dangling image)
     * 仓库名，标签为none的镜像为虚悬镜像
     * 当官方镜像维护后，再次使用docker pull拉取镜像，本地旧镜像仓库名，标签会设为none，成为虚悬镜像
     * docker build也会导致虚悬镜像产生
     * 通过
     * docker image ls -f dangling=true
     * 查看虚悬镜像
     * -f 根据指定条件过滤镜像
     * 通过
     * docker image prune
     * 删除虚悬镜像
     *
     * 删除本地镜像
     * docker image rm image_id
     * docker image rm repository:tag
     * docker rmi image_id
     *
     *
     */
}
