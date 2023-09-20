package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.AuthorIncome;
import org.example.engineering.novel.mapper.AuthorIncomeMapper;
import org.example.engineering.novel.service.IAuthorIncomeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 稿费收入统计 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class AuthorIncomeServiceImpl extends ServiceImpl<AuthorIncomeMapper, AuthorIncome> implements IAuthorIncomeService {

}
