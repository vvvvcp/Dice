package com.bihell.dice.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;

/**
 * Dice 属性配置信息
 *
 * @author haseochen
 */
@Data
@ConfigurationProperties("dice")
public class DiceProperties {
    /**
     * Authentication enabled
     */
    private boolean authEnabled = true;


    /**
     * 是否启用验证码 todo
     */
    private boolean enableVerifyCode;

    /**
     * 拦截器配置 todo
     */
//    @NestedConfigurationProperty
//    private DiceInterceptorProperties interceptor;

    /**
     * 过滤器配置 todo
     */
//    @NestedConfigurationProperty
//    private DiceFilterProperties filter;

    /**
     * 上传目录 todo
     */
    private String uploadFolder;

    /**
     * 资源访问路径，前端访问 todo
     */
    private String resourceAccessPath;

    /**
     * 资源访问路径，后段配置，资源映射/拦截器使用 todo
     */
    private String resourceAccessPatterns;
    /**
     * 资源访问全路径 todo
     */
    private String resourceAccessUrl;

    /**
     * 允许上传的文件后缀集合 todo
     */
    private List<String> allowUploadFileExtensions;

    /**
     * JWT配置 todo
     */
//    @NestedConfigurationProperty
//    private JwtProperties jwt;

    /**
     * Shiro配置 todo
     */
//    @NestedConfigurationProperty
//    private ShiroProperties shiro = new ShiroProperties();

    /**
     * 项目静态资源访问配置 todo
     *
     * @see DiceWebMvcConfig addResourceHandlers
     */
    private String resourceHandlers;

    /**
     * 跨域配置 todo
     */
//    @NestedConfigurationProperty
//    private DiceCorsProperties cors = new DiceCorsProperties();

    /**
     * Swagger路径 todo
     */
    private List<String> swaggerPaths;

}