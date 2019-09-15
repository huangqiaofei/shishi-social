package com.shishi.oauth.config;

import com.shishi.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangqf
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.shishi.oauth.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {

}
