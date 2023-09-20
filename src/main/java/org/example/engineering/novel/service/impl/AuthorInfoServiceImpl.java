package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.AuthorInfo;
import org.example.engineering.novel.mapper.AuthorInfoMapper;
import org.example.engineering.novel.service.IAuthorInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 作者信息 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class AuthorInfoServiceImpl extends ServiceImpl<AuthorInfoMapper, AuthorInfo> implements IAuthorInfoService {

}
