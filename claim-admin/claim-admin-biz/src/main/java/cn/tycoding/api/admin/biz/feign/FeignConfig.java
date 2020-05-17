package cn.tycoding.api.admin.biz.feign;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 钱伟一 on 2019-10-17.
 */
@Configuration
public class FeignConfig {
      @Bean
      public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
          return new BasicAuthRequestInterceptor("tycoding","tycoding");
      }

}
