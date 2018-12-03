package com.gjw.sell.VO;

import lombok.Data;

/**
 * @author gjw19
 * @date 2018/12/1
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
