package com.senyint.dubbo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Account implements Serializable{
    private String id;

    private Date createTime;

    private Date editTime;

    private Long version;

    /**
     * 备注
     */
    private String remark;

    /**
     * 账号
     */
    private String accountNo;

    private BigDecimal balance;

    private BigDecimal unbalance;

    private BigDecimal securityMoney;

    /**
     * 状态
     */
    private String status;

    /**
     * 总收入
     */
    private BigDecimal totalIncome;

    /**
     * 总支出
     */
    private BigDecimal totalExpend;

    private BigDecimal todayIncome;

    private BigDecimal todayExpend;

    private String accountType;

    private BigDecimal settAmount;

    private String userNo;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return edit_time
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * @param editTime
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取账号
     *
     * @return account_no - 账号
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 设置账号
     *
     * @param accountNo 账号
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * @return unbalance
     */
    public BigDecimal getUnbalance() {
        return unbalance;
    }

    /**
     * @param unbalance
     */
    public void setUnbalance(BigDecimal unbalance) {
        this.unbalance = unbalance;
    }

    /**
     * @return security_money
     */
    public BigDecimal getSecurityMoney() {
        return securityMoney;
    }

    /**
     * @param securityMoney
     */
    public void setSecurityMoney(BigDecimal securityMoney) {
        this.securityMoney = securityMoney;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取总收入
     *
     * @return total_income - 总收入
     */
    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    /**
     * 设置总收入
     *
     * @param totalIncome 总收入
     */
    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
    }

    /**
     * 获取总支出
     *
     * @return total_expend - 总支出
     */
    public BigDecimal getTotalExpend() {
        return totalExpend;
    }

    /**
     * 设置总支出
     *
     * @param totalExpend 总支出
     */
    public void setTotalExpend(BigDecimal totalExpend) {
        this.totalExpend = totalExpend;
    }

    /**
     * @return today_income
     */
    public BigDecimal getTodayIncome() {
        return todayIncome;
    }

    /**
     * @param todayIncome
     */
    public void setTodayIncome(BigDecimal todayIncome) {
        this.todayIncome = todayIncome;
    }

    /**
     * @return today_expend
     */
    public BigDecimal getTodayExpend() {
        return todayExpend;
    }

    /**
     * @param todayExpend
     */
    public void setTodayExpend(BigDecimal todayExpend) {
        this.todayExpend = todayExpend;
    }

    /**
     * @return account_type
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return sett_amount
     */
    public BigDecimal getSettAmount() {
        return settAmount;
    }

    /**
     * @param settAmount
     */
    public void setSettAmount(BigDecimal settAmount) {
        this.settAmount = settAmount;
    }

    /**
     * @return user_no
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * @param userNo
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}