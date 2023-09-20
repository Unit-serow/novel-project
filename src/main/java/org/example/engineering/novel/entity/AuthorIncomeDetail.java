package org.example.engineering.novel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 稿费收入明细统计
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("author_income_detail")
public class AuthorIncomeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 作家ID
     */
    @TableField("author_id")
    private Long authorId;

    /**
     * 小说ID;0表示全部作品
     */
    @TableField("book_id")
    private Long bookId;

    /**
     * 收入日期
     */
    @TableField("income_date")
    private LocalDate incomeDate;

    /**
     * 订阅总额
     */
    @TableField("income_account")
    private Integer incomeAccount;

    /**
     * 订阅次数
     */
    @TableField("income_count")
    private Integer incomeCount;

    /**
     * 订阅人数
     */
    @TableField("income_number")
    private Integer incomeNumber;

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
