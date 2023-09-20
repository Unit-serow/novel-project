package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.NewsCategory;
import org.example.engineering.novel.mapper.NewsCategoryMapper;
import org.example.engineering.novel.service.INewsCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 新闻类别 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class NewsCategoryServiceImpl extends ServiceImpl<NewsCategoryMapper, NewsCategory> implements INewsCategoryService {

}
