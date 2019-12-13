package com.yba.ycgw.md.domain;

import javax.naming.Name;

public class Response {

    /**
     * 返回参数
     */
    private String param;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 说明
     */
    private String remark;

    public Response(String param, String name, String remark) {
        this.param = param;
        this.name = name;
        this.remark = remark;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
