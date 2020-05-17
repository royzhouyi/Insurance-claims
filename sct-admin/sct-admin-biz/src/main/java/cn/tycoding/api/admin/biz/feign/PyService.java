package cn.tycoding.api.admin.biz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 钱伟一 on 2019-10-17.
 */
@FeignClient(value = "sct-sidecar",configuration = FeignConfig.class ,fallbackFactory = PyFeignFactory.class)
public interface PyService {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    String getUser();
}
