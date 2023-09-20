package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.UserBookshelf;
import org.example.engineering.novel.mapper.UserBookshelfMapper;
import org.example.engineering.novel.service.IUserBookshelfService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户书架 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class UserBookshelfServiceImpl extends ServiceImpl<UserBookshelfMapper, UserBookshelf> implements IUserBookshelfService {

}
