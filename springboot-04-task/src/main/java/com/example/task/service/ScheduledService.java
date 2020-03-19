package com.example.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Kahen
 * @version 1.0
 * @date 2020-03-19 9:22
 */
@Service
public class ScheduledService {
    /**
     * A cron-like expression, extending the usual UN*X definition to include triggers
     * on the second, minute, hour, day of month, month, and day of week.
     * @code "0 * * * * MON-FRI"
     */
    // @Scheduled(cron = "0 * * * * MON-FRI")
    // @Scheduled(cron = "0,1,2,3,4 * * * * MON-FRI") 枚举
    // @Scheduled(cron = "1-10 * * * * MON-FRI") 区间
    // @Scheduled(cron = "0/2 * * * * MON-FRI") 每2秒启动一次

    /**
     * 【0 0/5 14,18 * * ?】 每天14点整，和18点整，每隔5分钟执行一次
     * 【0 15 10 ? * 1-6】 每个月的周一至周六10:15分执行一次
     * 【0 0 2 ? * 6L】每个月的最后一个周六凌晨2点执行一次
     * 【0 0 2 LW * ?】每个月的最后一个工作日凌晨2点执行一次
     * 【0 0 2-4 ? * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次；
     */
    public void hello() {
        System.out.println("hello...");
    }
}
