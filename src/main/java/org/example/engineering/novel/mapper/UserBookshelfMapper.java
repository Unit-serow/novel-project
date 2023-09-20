package org.example.engineering.novel.mapper;

import org.example.engineering.novel.entity.UserBookshelf;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户书架 Mapper 接口
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Mapper
public interface UserBookshelfMapper extends BaseMapper<UserBookshelf> {

}
