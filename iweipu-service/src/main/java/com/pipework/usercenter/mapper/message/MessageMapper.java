package com.pipework.usercenter.mapper.message;

import com.pipework.model.usercenter.message.Message;
import com.pipework.model.usercenter.message.MessageSearchModel;

import java.util.List;

/**
 * User: lixiang
 * Date: 2015/1/15
 * Time: 16:54
 */
public interface MessageMapper {
    List<Message> getMessageListByUid(Integer uid);

    int getMessageTotalByUid(Integer uid);

    List<Message> getMessageListBySearch(MessageSearchModel model);

    int getMessageTotalBySearch(MessageSearchModel model);
}
