package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.UserInfo;
import org.example.engineering.novel.mapper.UserInfoMapper;
import org.example.engineering.novel.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
