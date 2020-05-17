package cn.tycoding.api.admin.biz.feign;

import org.springframework.stereotype.Component;

/**
 * Created by 钱伟一 on 2019-10-17.
 */
@Component
public class PyServiceFallbackImpl implements  PyService {
    @Override
    public String getUser() {
        return "err sidecar";
    }
}
