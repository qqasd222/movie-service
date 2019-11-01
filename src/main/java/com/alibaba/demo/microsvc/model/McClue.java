package com.alibaba.demo.microsvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 线索
 * </p>
 *
 * @author Aix
 * @since 2019-10-25
 */
@Entity
public class McClue implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long channelId;

    private String clueGrade;

    private String gradeReason;

    private String mobile;

    private String name;

    private String gender;

    private Integer mobyMember;

    private String userId;

    private String userName;

    private Long nodeId;

    private LocalDateTime appointmentTime;

    private LocalDateTime processTime;

    private String processResult;

    private String clueStatus;

    private Integer orderType;

    private String orderId;

    private Integer isDeleted;

    private String remark;

    private String tenantId;

    private String shopId;

    private LocalDateTime gmtCreate;

    private String createdBy;

    private LocalDateTime gmtModified;

    private String modifiedBy;

    private String alternateMobile;

    private String appointmentContent;

    private LocalDateTime arrivalStart;

    private LocalDateTime arrivalEnd;

    private String nextProcess;

    private String defeatedReason;

    private String enteringReason;

    private String email;

    private String address;

    private String source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getClueGrade() {
        return clueGrade;
    }

    public void setClueGrade(String clueGrade) {
        this.clueGrade = clueGrade;
    }

    public String getGradeReason() {
        return gradeReason;
    }

    public void setGradeReason(String gradeReason) {
        this.gradeReason = gradeReason;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getMobyMember() {
        return mobyMember;
    }

    public void setMobyMember(Integer mobyMember) {
        this.mobyMember = mobyMember;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public LocalDateTime getProcessTime() {
        return processTime;
    }

    public void setProcessTime(LocalDateTime processTime) {
        this.processTime = processTime;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult;
    }

    public String getClueStatus() {
        return clueStatus;
    }

    public void setClueStatus(String clueStatus) {
        this.clueStatus = clueStatus;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getAppointmentContent() {
        return appointmentContent;
    }

    public void setAppointmentContent(String appointmentContent) {
        this.appointmentContent = appointmentContent;
    }

    public LocalDateTime getArrivalStart() {
        return arrivalStart;
    }

    public void setArrivalStart(LocalDateTime arrivalStart) {
        this.arrivalStart = arrivalStart;
    }

    public LocalDateTime getArrivalEnd() {
        return arrivalEnd;
    }

    public void setArrivalEnd(LocalDateTime arrivalEnd) {
        this.arrivalEnd = arrivalEnd;
    }

    public String getNextProcess() {
        return nextProcess;
    }

    public void setNextProcess(String nextProcess) {
        this.nextProcess = nextProcess;
    }

    public String getDefeatedReason() {
        return defeatedReason;
    }

    public void setDefeatedReason(String defeatedReason) {
        this.defeatedReason = defeatedReason;
    }

    public String getEnteringReason() {
        return enteringReason;
    }

    public void setEnteringReason(String enteringReason) {
        this.enteringReason = enteringReason;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
