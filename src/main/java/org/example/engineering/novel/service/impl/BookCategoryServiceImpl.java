package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.BookCategory;
import org.example.engineering.novel.mapper.BookCategoryMapper;
import org.example.engineering.novel.service.IBookCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小说类别 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class BookCategoryServiceImpl extends ServiceImpl<BookCategoryMapper, BookCategory> implements IBookCategoryService {

}
