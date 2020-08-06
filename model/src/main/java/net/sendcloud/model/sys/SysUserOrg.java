package net.sendcloud.model.sys;

/**
 * @author tangzs
 * @date 2020/8/6
 * @description
 */
public class SysUserOrg extends SysUser{

    private String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
