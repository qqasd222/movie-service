package com.alibaba.demo.microsvc.config;

import com.alibaba.edas.acm.ConfigService;
import com.alibaba.edas.acm.listener.PropertiesListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Properties;

@Component
public class ACMConfig {

    // 属性/开关
//    private static String config = "DefaultValue";
    private static Properties acmProperties = new Properties();

    @PostConstruct
    public static void test(){
        // 从控制台命名空间管理中拷贝对应值
        Properties properties = new Properties();
        properties.put("endpoint", "acm.aliyun.com");
        properties.put("namespace", "0fdda799-2f58-4196-86b0-bd17b904f45d");
        // 通过 ECS 实例 RAM 角色访问 ACM
        // properties.put("ramRoleName", "$ramRoleName");
        properties.put("accessKey", "4d0d760fbdfc4daba1d79f3d54fa57ba");
        properties.put("secretKey", "O4eS+KNlgC6g/DE0uchw49B37AE=");
        // 如果是加密配置，则添加下面两行进行自动解密
        //properties.put("openKMSFilter", true);
        //properties.put("regionId", "$regionId");
        ConfigService.init(properties);
        // 主动获取配置
            /*String content = ConfigService.getConfig("com.alibaba.acm:movie-service.properties", "DEFAULT_GROUP", 6000);
            System.out.println(content);*/
        // 初始化的时候，给配置添加监听，配置变更会回调通知
        /*ConfigService.addListener("com.alibaba.acm:movie-service.properties", "DEFAULT_GROUP", new ConfigChangeListener() {
            public void receiveConfigInfo(String configInfo) {
                // 当配置更新后，通过该回调函数将最新值返回给用户。
                // 注意回调函数中不要做阻塞操作，否则阻塞通知线程。
                config = configInfo;
                System.out.println(configInfo);
            }
        });*/
        /**
         * 如果配置值的內容为properties格式（key=value），可使用下面监听器。以便一个配置管理多个配置项
         */
        ConfigService.addListener("com.alibaba.acm:movie-service.properties", "DEFAULT_GROUP", new PropertiesListener() {
            @Override
            public void innerReceive(Properties properties) {
                // TODO Auto-generated method stub
                acmProperties = properties;
                System.out.println(properties);
            }
        });
    }

    // 通过get接口把配置值暴露出去使用
//    public static String getConfig() {
//        return config;
//    }
    // 通过get接口把配置值暴露出去使用
    public static Object getPorpertiesValue(String key) {
        if (acmProperties != null) {
            return acmProperties.get(key);
        }
        return null;
    }
}
