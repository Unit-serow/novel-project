package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.UserPayLog;
import org.example.engineering.novel.mapper.UserPayLogMapper;
import org.example.engineering.novel.service.IUserPayLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户充值记录 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class UserPayLogServiceImpl extends ServiceImpl<UserPayLogMapper, UserPayLog> implements IUserPayLogService {

}
