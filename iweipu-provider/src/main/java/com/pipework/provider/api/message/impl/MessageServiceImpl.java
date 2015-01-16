package com.pipework.provider.api.message.impl;

import com.pipework.api.message.IMessageService;
import com.pipework.model.usercenter.message.Message;
import com.pipework.model.usercenter.message.MessageSearchModel;
import com.pipework.provider.mapper.message.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * User: lixiang
 * Date: 2015/1/15
 * Time: 16:46
 */
public class MessageServiceImpl implements IMessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public List<Message> getMessageListByUid(Integer uid) {
        return messageMapper.getMessageListByUid(uid);
    }

    @Override
    public int getMessageTotalByUid(Integer uid) {
        return messageMapper.getMessageTotalByUid(uid);
    }

    @Override
    public List<Message> getMessageListBySearch(MessageSearchModel model) {
        return messageMapper.getMessageListBySearch(model);
    }

    @Override
    public int getMessageTotalBySearch(MessageSearchModel model) {
        return messageMapper.getMessageTotalBySearch(model);
    }
}
