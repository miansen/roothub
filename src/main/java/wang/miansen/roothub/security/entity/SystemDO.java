package wang.miansen.roothub.security.entity;

import java.util.Date;

import lombok.Data;
import wang.miansen.roothub.common.dao.mapper.annotation.Id;
import wang.miansen.roothub.common.dao.mapper.annotation.Table;
import wang.miansen.roothub.common.dao.mapper.enums.IdType;

/**
 * 系统 DO
 *
 * @author miansen.wang
 * @date 2021-06-20 21:20
 */
@Data
@Table(value = "system")
public class SystemDO {

    /**
     * 主键ID
     */
    @Id(value = "system_id", type = IdType.AUTO)
    private Long systemId;

    /**
     * 系统名称
     */
    private String systemName;

    /**
     * 系统编码
     */
    private String systemCode;

    /**
     * 系统URL
     */
    private String systemUrl;

    /**
     * 系统图标
     */
    private String systemIcon;

    /**
     * 系统排序
     */
    private Integer systemSort;

    /**
     * 是否禁用（0：启用，1：禁用）
     */
    private Boolean isDisabled;

    /**
     * 是否删除（0：有效，1：删除）
     */
    private Boolean isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}