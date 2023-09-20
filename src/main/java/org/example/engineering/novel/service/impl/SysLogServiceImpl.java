package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.SysLog;
import org.example.engineering.novel.mapper.SysLogMapper;
import org.example.engineering.novel.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
