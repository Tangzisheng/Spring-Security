package net.sendcloud.model.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tangzs
 * @date 2020/8/5
 * @description
 */
public class SysConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 参数名称(中文)
     */
    private String paramName;

    /**
     * 参数唯一标识(英文及数字)
     */
    private String paramKey;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 参数描述备注
     */
    private String paramDesc;

    /**
     * 创建时间
     */
    private Date createTime;

}
