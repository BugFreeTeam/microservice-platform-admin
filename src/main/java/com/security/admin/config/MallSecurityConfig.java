package com.security.admin.config;

import com.anjuxing.platform.common.exception.ServiceException;
import com.platform.security.config.SecurityConfig;
import com.platform.security.security.DynamicSecurityService;
import com.security.admin.model.UmsResource;
import com.security.admin.service.UmsAdminService;
import com.security.admin.service.UmsResourceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MallSecurityConfig extends SecurityConfig {
    @Resource
    private UmsAdminService umsAdminService;
    @Resource
    private UmsResourceService umsResourceService;

    @Bean
    public UserDetailsService userDetailsService(){
        return username->umsAdminService.loadUserByUsername(username);
    }

    @Bean
    public DynamicSecurityService dynamicSecurityService(){
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() throws ServiceException {
                Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
                UmsResource umsResource=new UmsResource();
                List<UmsResource> resourceList = umsResourceService.queryList(umsResource);
                for (UmsResource resource : resourceList) {
                    map.put(resource.getUrl(), new org.springframework.security.access.SecurityConfig(resource.getId() + ":" + resource.getName()));
                }
                return map;
            }
        };
    }
}
