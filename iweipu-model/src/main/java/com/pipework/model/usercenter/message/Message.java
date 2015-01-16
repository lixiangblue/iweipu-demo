package com.pipework.model.usercenter.message;

public class Message {
    private Integer id;

    private Integer dialogId;

    private Integer senderUid;

    private Integer recipientUid;

    private Boolean isRead;

    private Integer createTime;

    private String messageText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDialogId() {
        return dialogId;
    }

    public void setDialogId(Integer dialogId) {
        this.dialogId = dialogId;
    }

    public Integer getSenderUid() {
        return senderUid;
    }

    public void setSenderUid(Integer senderUid) {
        this.senderUid = senderUid;
    }

    public Integer getRecipientUid() {
        return recipientUid;
    }

    public void setRecipientUid(Integer recipientUid) {
        this.recipientUid = recipientUid;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText == null ? null : messageText.trim();
    }
}