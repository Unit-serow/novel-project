package org.example.engineering.novel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户阅读历史
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_read_history")
public class UserReadHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 小说ID
     */
    @TableField("book_id")
    private Long bookId;

    /**
     * 上一次阅读的章节内容表ID
     */
    @TableField("pre_content_id")
    private Long preContentId;

    /**
     * 创建时间;
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间;
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
