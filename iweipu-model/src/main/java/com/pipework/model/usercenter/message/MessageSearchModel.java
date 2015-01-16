package com.pipework.model.usercenter.message;
import com.pipework.model.usercenter.base.SearchModelConstant;

import java.io.Serializable;

/**
 * User: lixiang
 * Date: 2015/1/15
 * Time: 15:57
 */
public class MessageSearchModel  implements Serializable {
    private Integer pageNo=1;
    private Integer pageSize=SearchModelConstant.PageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
