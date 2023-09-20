package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.AuthorCode;
import org.example.engineering.novel.mapper.AuthorCodeMapper;
import org.example.engineering.novel.service.IAuthorCodeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 作家邀请码 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class AuthorCodeServiceImpl extends ServiceImpl<AuthorCodeMapper, AuthorCode> implements IAuthorCodeService {

}
