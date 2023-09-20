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
 * 小说信息
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("book_info")
public class BookInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 作品方向;0-男频 1-女频
     */
    @TableField("work_direction")
    private Integer workDirection;

    /**
     * 类别ID
     */
    @TableField("category_id")
    private Long categoryId;

    /**
     * 类别名
     */
    @TableField("category_name")
    private String categoryName;

    /**
     * 小说封面地址
     */
    @TableField("pic_url")
    private String picUrl;

    /**
     * 小说名
     */
    @TableField("book_name")
    private String bookName;

    /**
     * 作家id
     */
    @TableField("author_id")
    private Long authorId;

    /**
     * 作家名
     */
    @TableField("author_name")
    private String authorName;

    /**
     * 书籍描述
     */
    @TableField("book_desc")
    private String bookDesc;

    /**
     * 评分;总分:10 ，真实评分 = score/10
     */
    @TableField("score")
    private Integer score;

    /**
     * 书籍状态;0-连载中 1-已完结
     */
    @TableField("book_status")
    private Integer bookStatus;

    /**
     * 点击量
     */
    @TableField("visit_count")
    private Long visitCount;

    /**
     * 总字数
     */
    @TableField("word_count")
    private Integer wordCount;

    /**
     * 评论数
     */
    @TableField("comment_count")
    private Integer commentCount;

    /**
     * 最新章节ID
     */
    @TableField("last_chapter_id")
    private Long lastChapterId;

    /**
     * 最新章节名
     */
    @TableField("last_chapter_name")
    private String lastChapterName;

    /**
     * 最新章节更新时间
     */
    @TableField("last_chapter_update_time")
    private LocalDateTime lastChapterUpdateTime;

    /**
     * 是否收费;1-收费 0-免费
     */
    @TableField("is_vip")
    private Integer isVip;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
