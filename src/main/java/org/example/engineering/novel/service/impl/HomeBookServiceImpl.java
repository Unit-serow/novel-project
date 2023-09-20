package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.HomeBook;
import org.example.engineering.novel.mapper.HomeBookMapper;
import org.example.engineering.novel.service.IHomeBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 小说推荐 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class HomeBookServiceImpl extends ServiceImpl<HomeBookMapper, HomeBook> implements IHomeBookService {

}
