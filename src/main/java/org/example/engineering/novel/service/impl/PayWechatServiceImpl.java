package org.example.engineering.novel.service.impl;

import org.example.engineering.novel.entity.PayWechat;
import org.example.engineering.novel.mapper.PayWechatMapper;
import org.example.engineering.novel.service.IPayWechatService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 微信支付 服务实现类
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Service
public class PayWechatServiceImpl extends ServiceImpl<PayWechatMapper, PayWechat> implements IPayWechatService {

}
