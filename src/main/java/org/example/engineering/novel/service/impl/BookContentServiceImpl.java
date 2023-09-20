package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.BookContent;
import org.example.engineering.novel.mapper.BookContentMapper;
import org.example.engineering.novel.service.IBookContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小说内容 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class BookContentServiceImpl extends ServiceImpl<BookContentMapper, BookContent> implements IBookContentService {

}
