package cn.tycoding.api.admin.biz.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by 钱伟一 on 2019-10-17.
 */
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭c跨域保护
        http.csrf().disable();//spring security  默认开启csrf校验
    }
}
