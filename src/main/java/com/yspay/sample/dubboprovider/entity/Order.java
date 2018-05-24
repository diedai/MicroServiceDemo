package com.yspay.sample.dubboprovider.entity;

import java.util.Date;

public class Order {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ORDER.ORDER_SEQ_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	private String orderSeqId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ORDER.ORDER_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	private String orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ORDER.USER_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ORDER.STATUS
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column T_ORDER.CREATE_DATE
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	private Date createDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ORDER.ORDER_SEQ_ID
	 * @return  the value of T_ORDER.ORDER_SEQ_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public String getOrderSeqId() {
		return orderSeqId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ORDER.ORDER_SEQ_ID
	 * @param orderSeqId  the value for T_ORDER.ORDER_SEQ_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public void setOrderSeqId(String orderSeqId) {
		this.orderSeqId = orderSeqId == null ? null : orderSeqId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ORDER.ORDER_ID
	 * @return  the value of T_ORDER.ORDER_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ORDER.ORDER_ID
	 * @param orderId  the value for T_ORDER.ORDER_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ORDER.USER_ID
	 * @return  the value of T_ORDER.USER_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ORDER.USER_ID
	 * @param userId  the value for T_ORDER.USER_ID
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ORDER.STATUS
	 * @return  the value of T_ORDER.STATUS
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ORDER.STATUS
	 * @param status  the value for T_ORDER.STATUS
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column T_ORDER.CREATE_DATE
	 * @return  the value of T_ORDER.CREATE_DATE
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column T_ORDER.CREATE_DATE
	 * @param createDate  the value for T_ORDER.CREATE_DATE
	 * @mbg.generated  Wed May 09 16:17:07 CST 2018
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}