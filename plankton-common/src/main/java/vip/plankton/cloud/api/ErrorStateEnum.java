package vip.plankton.cloud.api;

import lombok.Getter;

/**
 * 响应状态码枚举
 *
 * @author Wukh
 * @create 2021-01-04
 */
@Getter
public enum ErrorStateEnum {

    /**
     * 系统错误
     */
    SYSTEM_ERROR(-1, "未知错误"),
    /**
     * 请求成功
     */
    REQUEST_SUCCESS(200, "操作成功"),
    /**
     * 请求错误
     */
    REQUEST_ERROR(500, "操作失败"),
    /**
     * 暂未登录或token已经过期
     */
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    /**
     * 没有相关权限
     */
    FORBIDDEN(403, "没有相关权限"),
    /**
     * 参数检验失败
     */
    VALIDATE_FAILED(404, "参数检验失败"),
    /**
     * 未登录
     */
    REQUEST_UNAUTHC_EXCEPTION(411, "未登录"),
    /**
     * 未授权
     */
    REQUEST_UNPERMS_EXCEPTION(412, "未授权");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 原因短语
     */
    private final String message;

    ErrorStateEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
