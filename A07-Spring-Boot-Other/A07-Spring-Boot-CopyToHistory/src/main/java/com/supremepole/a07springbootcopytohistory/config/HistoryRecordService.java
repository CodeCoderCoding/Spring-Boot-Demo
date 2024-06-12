package com.supremepole.a07springbootcopytohistory.config;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Optional;

public class HistoryRecordService {

    public static <T, H> void copyToHistoryRecord(T businessObject, Class<H> historyRecordClass, IHistoryRecordRepository<H> repository) {
        try {
            // 获取业务对象的所有属性
            Field[] businessFields = businessObject.getClass().getDeclaredFields();

            // 创建历史记录对象
            H historyRecord = historyRecordClass.getDeclaredConstructor().newInstance();

            // 将业务对象的属性值复制到历史记录对象
            for (Field businessField : businessFields) {
                businessField.setAccessible(true);
                Field historyField = historyRecordClass.getDeclaredField(businessField.getName());
                historyField.setAccessible(true);
                historyField.set(historyRecord, businessField.get(businessObject));
            }

            // 设置历史记录的创建时间
            Field createdAtField = historyRecordClass.getDeclaredField("createdAt");
            createdAtField.setAccessible(true);
            createdAtField.set(historyRecord, LocalDateTime.now());

            // 保存历史记录
            saveHistoryRecord(historyRecord, repository);
        } catch (Exception e) {
            throw new RuntimeException("Failed to copy to history record", e);
        }
    }

    private static <H> void saveHistoryRecord(H historyRecord, IHistoryRecordRepository<H> repository) {
        // 检查历史记录是否已存在
        Optional<H> existingRecord = repository.findByPrimaryKey(historyRecord);
        if (existingRecord.isPresent()) {
            // 如果历史记录已存在,则更新
            repository.update(historyRecord);
        } else {
            // 如果历史记录不存在,则创建
            repository.create(historyRecord);
        }
    }
}
