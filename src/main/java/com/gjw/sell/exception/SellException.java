package com.gjw.sell.exception;

import com.gjw.sell.Enum.ResultEnum;

/**
 * @author gjw19
 * @date 2018/12/2
 */
public class SellException extends RuntimeException {

    private static final long serialVersionUID = 6052642268269233233L;
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
