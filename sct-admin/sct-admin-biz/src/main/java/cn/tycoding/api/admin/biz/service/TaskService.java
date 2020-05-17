package cn.tycoding.api.admin.biz.service;

import cn.tycoding.api.admin.api.entity.Task;
import cn.tycoding.api.common.service.BaseService;

import java.util.List;

/**
 * Created by 钱伟一 on 2019-09-27.
 */
public interface TaskService extends BaseService<Task>{


    /**
     * 根据用任务id查询
     *
     * @param taskId
     * @return
     */
    Task findByTaskId(String taskId);

    /**
     * 条件查询用户
     *
     * @param task
     * @return
     */
    List<Task> list(Task task);

    /**
     * 新增任务信息
     *
     * @param task
     */
    void create(Task task);

    /**
     * 更新任务信息
     *
     * @param task
     */
    void update(Task task);
}
