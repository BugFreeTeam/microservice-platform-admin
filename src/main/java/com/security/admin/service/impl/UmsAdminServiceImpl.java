package com.security.admin.service.impl;

import com.anjuxing.platform.common.util.DateUtils;
import com.platform.security.utils.JwtTokenUtil;
import com.security.admin.exception.SysException;
import com.security.admin.exception.SystemExceptionEnum;
import com.security.admin.exception.UmsAdminException;
import com.security.admin.exception.UmsAdminExcetionEnum;
import com.security.admin.mapper.UmsResourceMapper;
import com.security.admin.model.AdminUserDetails;
import com.security.admin.model.UmsResource;
import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.security.admin.mapper.UmsAdminMapper;
import com.security.admin.model.UmsAdmin;
import com.security.admin.service.UmsAdminService;

import java.util.List;

/**
 * 后台用户表
 */
@Service("umsAdminService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsAdminServiceImpl extends CrudServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;
    @Autowired
    private UmsResourceMapper umsResourceMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    public UserDetails loadUserByUsername(String username) {
        UmsAdmin umsAdmin=umsAdminMapper.getAdminByUserName(username);
        if(umsAdmin!=null){
            List<UmsResource> resourceList = getResourceList(umsAdmin.getId());
            return new AdminUserDetails(umsAdmin,resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    public List<UmsResource> getResourceList(Long adminId) {
        List<UmsResource> resourceList = umsResourceMapper.getResourceList(adminId);
        return resourceList;
    }

    @Transactional(readOnly = false)
    public void register(UmsAdmin model){
        try {
            UmsAdmin umsAdmin=umsAdminMapper.getAdminByUserName(model.getUsername());
            if(umsAdmin!=null){
                throw new UmsAdminException(UmsAdminExcetionEnum.USER_EXIST);
            }else{
                model.setCreateTime(DateUtils.getCurrentTime());
                model.setStatus(1);
                String encodePassword = passwordEncoder.encode(model.getPassword());
                model.setPassword(encodePassword);
                umsAdminMapper.save(model);
            }
        }catch (Exception e){
            throw new SysException(SystemExceptionEnum.SYS_ERROR);
        }

    }

    public String login(UmsAdmin model) {
        String token =null;
        try {
            UserDetails userDetails = loadUserByUsername(model.getUsername());
            if (!passwordEncoder.matches(model.getPassword(), userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        }catch (Exception e){
            System.out.println("登录异常");
        }
        return token;
    }


}