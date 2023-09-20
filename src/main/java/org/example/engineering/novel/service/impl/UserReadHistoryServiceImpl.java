package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.UserReadHistory;
import org.example.engineering.novel.mapper.UserReadHistoryMapper;
import org.example.engineering.novel.service.IUserReadHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户阅读历史 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class UserReadHistoryServiceImpl extends ServiceImpl<UserReadHistoryMapper, UserReadHistory> implements IUserReadHistoryService {

}
