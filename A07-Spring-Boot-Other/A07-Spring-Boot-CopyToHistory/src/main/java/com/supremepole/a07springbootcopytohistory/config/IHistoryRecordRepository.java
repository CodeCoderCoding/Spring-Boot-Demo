package com.supremepole.a07springbootcopytohistory.config;

import java.util.Optional;

// 历史记录仓储接口
public interface IHistoryRecordRepository<H> {
    Optional<H> findByPrimaryKey(H historyRecord);
    void create(H historyRecord);
    void update(H historyRecord);
}
