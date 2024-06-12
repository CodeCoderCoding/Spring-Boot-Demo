package com.supremepole.b06springbootauditing;


import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<Long> {

    /**
     * 返回当前用户ID，insert和update操作会调用该方法自动赋值
     */
    @Override
    public Optional<Long> getCurrentAuditor() {
        // 获取当前用户Id，具体获取逻辑请自行实现
        Long userId = 1L;
        return Optional.ofNullable(userId);
    }

}


