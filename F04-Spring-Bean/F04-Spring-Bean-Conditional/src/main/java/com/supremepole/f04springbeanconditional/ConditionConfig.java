package com.supremepole.f04springbeanconditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author CodeCoderCoding
 */
@Configuration
public class ConditionConfig {
    /**
     * // 通过@Conditional注解，符合Windows条件则实例化WindowsListService。
     * @return
     */
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListServiceImpl();
    }

    /**
     * // 通过@Conditional注解，符合Linux条件则实例化LinuxListService。
     * @return
     */
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListServiceImpl();
    }
}
