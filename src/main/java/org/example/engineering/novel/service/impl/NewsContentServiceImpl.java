package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.NewsContent;
import org.example.engineering.novel.mapper.NewsContentMapper;
import org.example.engineering.novel.service.INewsContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 新闻内容 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class NewsContentServiceImpl extends ServiceImpl<NewsContentMapper, NewsContent> implements INewsContentService {

}
