package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.UserComment;
import org.example.engineering.novel.mapper.UserCommentMapper;
import org.example.engineering.novel.service.IUserCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户评论 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class UserCommentServiceImpl extends ServiceImpl<UserCommentMapper, UserComment> implements IUserCommentService {

}
