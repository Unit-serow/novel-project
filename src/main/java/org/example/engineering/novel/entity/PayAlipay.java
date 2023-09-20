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
 * 支付宝支付
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("pay_alipay")
public class PayAlipay implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商户订单号
     */
    @TableField("out_trade_no")
    private String outTradeNo;

    /**
     * 支付宝交易号
     */
    @TableField("trade_no")
    private String tradeNo;

    /**
     * 买家支付宝账号 ID
     */
    @TableField("buyer_id")
    private String buyerId;

    /**
     * 交易状态;TRADE_SUCCESS-交易成功
     */
    @TableField("trade_status")
    private String tradeStatus;

    /**
     * 订单金额;单位：分
     */
    @TableField("total_amount")
    private Integer totalAmount;

    /**
     * 实收金额;单位：分
     */
    @TableField("receipt_amount")
    private Integer receiptAmount;

    /**
     * 开票金额
     */
    @TableField("invoice_amount")
    private Integer invoiceAmount;

    /**
     * 交易创建时间
     */
    @TableField("gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 交易付款时间
     */
    @TableField("gmt_payment")
    private LocalDateTime gmtPayment;

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
