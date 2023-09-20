package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.SysUser;
import org.example.engineering.novel.mapper.SysUserMapper;
import org.example.engineering.novel.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
