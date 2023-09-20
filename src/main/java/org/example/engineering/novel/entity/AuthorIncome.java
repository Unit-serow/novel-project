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
 * 稿费收入统计
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("author_income")
public class AuthorIncome implements Serializable {

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
     * 小说ID
     */
    @TableField("book_id")
    private Long bookId;

    /**
     * 收入月份
     */
    @TableField("income_month")
    private LocalDate incomeMonth;

    /**
     * 税前收入;单位：分
     */
    @TableField("pre_tax_income")
    private Integer preTaxIncome;

    /**
     * 税后收入;单位：分
     */
    @TableField("after_tax_income")
    private Integer afterTaxIncome;

    /**
     * 支付状态;0-待支付 1-已支付
     */
    @TableField("pay_status")
    private Integer payStatus;

    /**
     * 稿费确认状态;0-待确认 1-已确认
     */
    @TableField("confirm_status")
    private Integer confirmStatus;

    /**
     * 详情
     */
    @TableField("detail")
    private String detail;

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
