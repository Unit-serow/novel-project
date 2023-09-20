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
 * 用户消费记录
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_consume_log")
public class UserConsumeLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 消费用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 消费使用的金额;单位：屋币
     */
    @TableField("amount")
    private Integer amount;

    /**
     * 消费商品类型;0-小说VIP章节
     */
    @TableField("product_type")
    private Integer productType;

    /**
     * 消费的的商品ID;例如：章节ID
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 消费的的商品名;例如：章节名
     */
    @TableField("produc_name")
    private String producName;

    /**
     * 消费的的商品值;例如：1
     */
    @TableField("produc_value")
    private Integer producValue;

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
