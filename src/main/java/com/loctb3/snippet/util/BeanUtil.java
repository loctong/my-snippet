package com.loctb3.snippet.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BeanUtil {
    public static <T, K> T copyProperties(K source, Class<T> type) {
        Class<?> clazz;
        T desc = null;
        try {
            if (null != source) {
                clazz = Class.forName(type.getName());
                desc = (T) clazz.newInstance();
                BeanUtils.copyProperties(source, desc);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            log.error("Error copy properties: ", e);
        }
        return desc;
    }

    public static <T, K> List<T> listCopyProperties(List<K> srcList, Class<T> type) {
        Class<?> clazz;
        List<T> descList = new ArrayList<>();
        try {
            if (!CollectionUtils.isEmpty(srcList)) {
                clazz = Class.forName(type.getName());
                T desc;
                for (K source : srcList) {
                    desc = (T) clazz.newInstance();
                    BeanUtils.copyProperties(source, desc);
                    descList.add(desc);
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            log.error("Error list copy properties: ", e);
        }
        return descList;
    }
}
