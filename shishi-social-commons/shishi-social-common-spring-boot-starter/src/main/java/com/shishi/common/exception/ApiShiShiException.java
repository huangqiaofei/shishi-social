package com.shishi.common.exception;

/**
 * 自定义异常
 *
 * @author huangqf
 * @email 939961241@qq.com
 * @date 2016年10月27日 下午10:11:27
 */
public class ApiShiShiException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errmsg;
    private int errno = 500;

    public ApiShiShiException(String errmsg) {
        super(errmsg);
        this.errmsg = errmsg;
    }

    public ApiShiShiException(String errmsg, Throwable e) {
        super(errmsg, e);
        this.errmsg = errmsg;
    }

    public ApiShiShiException(String errmsg, int errno) {
        super(errmsg);
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public ApiShiShiException(String errmsg, int errno, Throwable e) {
        super(errmsg, e);
        this.errmsg = errmsg;
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }
}
