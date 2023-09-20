package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.BookChapter;
import org.example.engineering.novel.mapper.BookChapterMapper;
import org.example.engineering.novel.service.IBookChapterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小说章节 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class BookChapterServiceImpl extends ServiceImpl<BookChapterMapper, BookChapter> implements IBookChapterService {

}
