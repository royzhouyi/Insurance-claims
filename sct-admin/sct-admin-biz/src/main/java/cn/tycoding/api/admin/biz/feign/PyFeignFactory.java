package cn.tycoding.api.admin.biz.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName PyFeignFactory
 * @Description
 * @Author rukangz
 * @Date 2019/10/21
 **/
@Component
public class PyFeignFactory implements FallbackFactory<PyService> {
    @Override
    public PyService create(Throwable throwable) {
        throwable.printStackTrace();
        return null;
    }
}
