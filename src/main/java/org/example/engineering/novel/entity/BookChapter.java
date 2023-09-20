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
 * 小说章节
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("book_chapter")
public class BookChapter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 小说ID
     */
    @TableField("book_id")
    private Long bookId;

    /**
     * 章节号
     */
    @TableField("chapter_num")
    private Integer chapterNum;

    /**
     * 章节名
     */
    @TableField("chapter_name")
    private String chapterName;

    /**
     * 章节字数
     */
    @TableField("word_count")
    private Integer wordCount;

    /**
     * 是否收费;1-收费 0-免费
     */
    @TableField("is_vip")
    private Integer isVip;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
