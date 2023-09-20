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
 * 用户充值记录
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user_pay_log")
public class UserPayLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 充值用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 充值方式;0-支付宝 1-微信
     */
    @TableField("pay_channel")
    private Integer payChannel;

    /**
     * 商户订单号
     */
    @TableField("out_trade_no")
    private String outTradeNo;

    /**
     * 充值金额;单位：分
     */
    @TableField("amount")
    private Integer amount;

    /**
     * 充值商品类型;0-屋币 1-包年VIP
     */
    @TableField("product_type")
    private Integer productType;

    /**
     * 充值商品ID
     */
    @TableField("product_id")
    private Long productId;

    /**
     * 充值商品名;示例值：屋币
     */
    @TableField("product_name")
    private String productName;

    /**
     * 充值商品值;示例值：255
     */
    @TableField("product_value")
    private Integer productValue;

    /**
     * 充值时间
     */
    @TableField("pay_time")
    private LocalDateTime payTime;

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
