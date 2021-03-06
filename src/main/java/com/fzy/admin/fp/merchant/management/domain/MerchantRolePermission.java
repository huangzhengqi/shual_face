package com.fzy.admin.fp.merchant.management.domain;

import com.fzy.admin.fp.common.spring.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author zk
 * @description 角色权限关联表
 * @create 2018-07-25 15:51:38
 **/
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "lysj_merchant_role_permission")
public class MerchantRolePermission extends BaseEntity {

    private String roleId;//角色ID

    private String permissionId;//权限ID

}