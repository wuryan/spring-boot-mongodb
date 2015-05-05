package com.james.vo;

import com.james.ex.ErrorCode;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
public class OperateMessage {
    private int error_code = ErrorCode.SUCCEED;

    private String rtn_message = "ok";

    private Object ret;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getRtn_message() {
        return rtn_message;
    }

    public void setRtn_message(String rtn_message) {
        this.rtn_message = rtn_message;
    }

    public Object getRet() {
        return ret;
    }

    public void setRet(Object ret) {
        this.ret = ret;
    }
}
