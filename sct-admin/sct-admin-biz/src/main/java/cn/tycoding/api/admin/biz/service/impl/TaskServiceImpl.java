package cn.tycoding.api.admin.biz.service.impl;

import cn.tycoding.api.admin.api.entity.SysUser;
import cn.tycoding.api.admin.api.entity.Task;
import cn.tycoding.api.admin.biz.mapper.TaskMapper;
import cn.tycoding.api.admin.biz.service.TaskService;
import cn.tycoding.api.admin.biz.service.TaskService;
import cn.tycoding.api.common.service.impl.BaseServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Created by 钱伟一 on 2019-09-27.
 */
@Service
public class TaskServiceImpl extends BaseServiceImpl<Task>  implements TaskService {

    @Autowired
    public TaskMapper taskMapper;

    @Override
    public Task findByTaskId(String taskId) {
        Example example = new Example(SysUser.class);//Example mybatis mapper包下的
        example.createCriteria().andCondition("ctaskid=", taskId);
        List<Task> list = taskMapper.selectByExample(example);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<Task> list(Task task) {
        Example example = new Example(Task.class);
        if(StringUtils.isNotBlank(task.getCtaskid())){
            example.createCriteria().andCondition("c_task_id=",task.getCtaskid());
        }
        return this.selectByExample(example);
    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void update(Task task) {

    }
}
