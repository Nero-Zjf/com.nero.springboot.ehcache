package com.nero.springboot.ehcache.service;

import com.nero.springboot.ehcache.po.User;
import org.springframework.stereotype.Component;

@Component
public interface EhcacheService {
    // 测试失效情况，有效期为5秒
    public String getTimestamp(String param);

    public String getDataFromDB(String key);

    public void removeDataAtDB(String key);

    public String refreshData(String key);

    public User findById(String userId);

    public boolean isReserved(String userId);

    public void removeUser(String userId);

    public void removeAllUser();
}
