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
 * 微信支付
 * </p>
 *
 * @author gaoyuan
 * @since 2023年09月20日
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("pay_wechat")
public class PayWechat implements Serializable {

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
     * 微信支付订单号
     */
    @TableField("transaction_id")
    private String transactionId;

    /**
     * 交易类型;JSAPI-公众号支付 NATIVE-扫码支付 APP-APP支付 MICROPAY-付款码支付 MWEB-H5支付 FACEPAY-刷脸支付
     */
    @TableField("trade_type")
    private String tradeType;

    /**
     * 交易状态;SUCCESS-支付成功 REFUND-转入退款 NOTPAY-未支付 CLOSED-已关闭 REVOKED-已撤销（付款码支付） USERPAYING-用户支付中（付款码支付） PAYERROR-支付失败(其他原因，如银行返回失败)
     */
    @TableField("trade_state")
    private String tradeState;

    /**
     * 交易状态描述
     */
    @TableField("trade_state_desc")
    private String tradeStateDesc;

    /**
     * 订单总金额;单位：分
     */
    @TableField("amount")
    private Integer amount;

    /**
     * 用户支付金额;单位：分
     */
    @TableField("payer_total")
    private Integer payerTotal;

    /**
     * 支付完成时间
     */
    @TableField("success_time")
    private LocalDateTime successTime;

    /**
     * 支付者用户标识;用户在直连商户appid下的唯一标识
     */
    @TableField("payer_openid")
    private String payerOpenid;

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
