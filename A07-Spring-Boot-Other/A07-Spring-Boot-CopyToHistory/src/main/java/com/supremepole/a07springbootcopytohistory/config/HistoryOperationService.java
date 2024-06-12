package com.supremepole.a07springbootcopytohistory.config;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@Service
public class HistoryOperationService {

    @Autowired
    private EntityManager entityManager;

    public <T> void copyToHistory(T entity) {
        Class<?> entityClass = entity.getClass();
        Field[] fields = entityClass.getDeclaredFields();

        for (Field field : fields) {
            CopyToHistory annotation = field.getAnnotation(CopyToHistory.class);
            if (annotation != null) {
                String[] historyFields = annotation.historyFields();

                // 根据historyFields复制数据到历史记录表
                copyFieldsToHistory(entity, field, historyFields);
            }
        }
    }

    private <T> void copyFieldsToHistory(T entity, Field field, String[] historyFields) {
        try {
            field.setAccessible(true);
            Object value = field.get(entity);

            // 根据业务表中的id值,在历史记录表中创建新记录
            createHistoryRecord(entity, field.getName(), value);
        } catch (IllegalAccessException e) {
            // 异常处理
        }
    }

    private <T> void createHistoryRecord(T entity, String fieldName, Object value) {
        // 根据业务表中的id值,在历史记录表中创建新记录
    }
}
