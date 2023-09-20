package org.example.engineering.novel.mapper;

import org.example.engineering.novel.entity.UserReadHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户阅读历史 Mapper 接口
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Mapper
public interface UserReadHistoryMapper extends BaseMapper<UserReadHistory> {

}
