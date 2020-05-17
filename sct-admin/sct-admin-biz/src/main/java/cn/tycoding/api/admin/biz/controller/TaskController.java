package cn.tycoding.api.admin.biz.controller;

import cn.tycoding.api.admin.api.entity.Task;
import cn.tycoding.api.admin.biz.feign.PyService;
import cn.tycoding.api.admin.biz.service.TaskService;
import cn.tycoding.api.common.controller.BaseController;
import cn.tycoding.api.common.controller.BaseController;
import cn.tycoding.api.common.utils.QueryPage;
import cn.tycoding.api.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by 钱伟一 on 2019-09-27.
 */
@Slf4j //该注解作用相当于 private  final Logger logger = LoggerFactory.getLogger(当前类名.class);
@RestController
@RequestMapping("/task")
@Api(value = "TaskController",tags = "数据清洗信息管理接口")
public class TaskController extends BaseController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private PyService pyService;
    /**
     * 分页查询列表数据，条件查询
     *
     * @param task
     * @return
     */
    @PostMapping("/list")
    @ApiOperation(value = "分页、条件查询用户列表信息")
    @ApiImplicitParam(name = "task", value = "查询条件", required = true, dataType = "Task", paramType = "body")
    public Result<Map> list(Task task, QueryPage queryPage) {
        log.info("查询任务信息列表");
        Result<Map> list = new Result<Map>(this.selectByPageNumSize(queryPage, () -> taskService.list(task)));
        log.info(list.toString());
        return list;
    }

    /**
     * 根据ID查询用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "查询详任务信息", notes = "id存在且大于0")
    @ApiImplicitParam(name = "id", value = "任务id", required = true, dataType = "Long")
    public Result<Task> findById(@PathVariable Long id) {
        if (id == null || id == 0) {
            return new Result<>();
        } else {
            return new Result<Task>(taskService.selectByKey(id));
        }
    }
    @GetMapping("/getUser")
    public String getUser(){
        String str=pyService.getUser();
        log.info("sidecar back result :"+str);
        return str;
    };
}
