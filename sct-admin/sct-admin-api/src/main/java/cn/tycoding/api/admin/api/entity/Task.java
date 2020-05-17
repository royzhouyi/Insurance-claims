package cn.tycoding.api.admin.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author tycoding
 * @date 2019-05-22
 */
@Data
@Table(name = "t_task")
public class Task implements Serializable {

    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * 任务id
     */
    @Column(name = "c_task_id")
    private String ctaskid;

    /**
     * 名称
     */
    @Column(name = "c_name")
    private String cname;

    /**
     * 状态
     */
    @Column(name = "c_status")
    private Long cstatus;


    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "t_crt_tm")
    private Date tcrttm;


    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "t_upd_tm")
    private Date tupdtm;

    @Column(name = "c_del_flag")
    private String cdelflag;

}
