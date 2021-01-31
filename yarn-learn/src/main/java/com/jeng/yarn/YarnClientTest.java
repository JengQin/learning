package com.jeng.yarn;

import org.apache.hadoop.yarn.api.records.ContainerLaunchContext;
import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.hadoop.yarn.client.api.YarnClientApplication;
import org.apache.hadoop.yarn.conf.YarnConfiguration;
import org.apache.hadoop.yarn.exceptions.YarnException;
import org.apache.hadoop.yarn.util.Records;

import java.io.IOException;
import java.util.Collections;

public class YarnClientTest {

    private static String APP_MASTER_CLASS = "";
    private static YarnConfiguration conf = new YarnConfiguration();

    public static void main(String[] args) throws IOException, YarnException {
        // 创建yarn客户端

        YarnClient yarnClient = YarnClient.createYarnClient();
        yarnClient.init(conf);
        yarnClient.start();

        /*
        * 配置appMaster的启动环境
        * 1. 启动容器的命令
        * 2. 待启动容器Id
        * 3. 分配给该容器的资源对象
        * 4. 容器执行任务所需的LocalResource实例，包括二进制文件，jar文件等
        * 5. 容器执行所需的环境变量，包括类加载路径
        * */
        YarnClientApplication yarnClientApplication = yarnClient.createApplication();
        ContainerLaunchContext amContainer = Records.newRecord(ContainerLaunchContext.class);
        amContainer.setCommands(Collections.singletonList("java -Xmx128M "+APP_MASTER_CLASS));
//        setupAppMasterJar()

        // 向ResourceManager申请容器资源，获取到AppId

        // 启动appMaster

        // 监控应用程序

    }
}
