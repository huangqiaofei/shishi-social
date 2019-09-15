package com.shishi.common.exception;

/**
 * 幂等性异常
 *
 * @author huangqf
 */
public class IdempotencyException extends RuntimeException {
    private static final long serialVersionUID = 6610083281801529147L;

    public IdempotencyException(String message) {
        super(message);
    }
}
