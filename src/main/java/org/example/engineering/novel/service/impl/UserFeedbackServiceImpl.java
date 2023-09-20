package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.UserFeedback;
import org.example.engineering.novel.mapper.UserFeedbackMapper;
import org.example.engineering.novel.service.IUserFeedbackService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户反馈 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class UserFeedbackServiceImpl extends ServiceImpl<UserFeedbackMapper, UserFeedback> implements IUserFeedbackService {

}
