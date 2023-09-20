package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.Test;
import org.example.engineering.novel.mapper.TestMapper;
import org.example.engineering.novel.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
