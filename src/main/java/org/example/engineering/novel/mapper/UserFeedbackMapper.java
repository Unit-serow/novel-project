package org.example.engineering.novel.mapper;

import org.example.engineering.novel.entity.UserFeedback;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户反馈 Mapper 接口
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Mapper
public interface UserFeedbackMapper extends BaseMapper<UserFeedback> {

}
