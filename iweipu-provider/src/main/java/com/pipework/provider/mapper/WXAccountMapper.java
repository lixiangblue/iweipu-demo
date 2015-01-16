package com.pipework.provider.mapper;



import java.util.List;

/**
 * Description:
 * User: lixiang
 * Date: 13-11-1
 * Time: 下午1:45
 */
public interface WXAccountMapper {
    int insertAccount(Integer wxAccount);
    int countByCriteria(Integer criteria);
    void deleteBatchByIds(int[] ids);

    List<Integer> selectByCriteria(Integer criteria);
}
