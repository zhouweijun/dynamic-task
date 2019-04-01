package com.dynamic.task.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xavier Zzz 2019 - 04 - 2019/4/1
 */
@RestController
@RequestMapping("dynamic")
public class DynamicTaskController {

    @Autowired
    private DynamicScheduledTask dynamicScheduledTask;

    @RequestMapping("/update/task/time")
    public String updateTaskTime(String cron) {
        dynamicScheduledTask.setCron(cron);
        return "动态修改成功";
    }

}
