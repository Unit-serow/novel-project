package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.NewsInfo;
import org.example.engineering.novel.mapper.NewsInfoMapper;
import org.example.engineering.novel.service.INewsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 新闻信息 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class NewsInfoServiceImpl extends ServiceImpl<NewsInfoMapper, NewsInfo> implements INewsInfoService {

}
