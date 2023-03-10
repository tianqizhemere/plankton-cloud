package vip.plankton.cloud.api;

import lombok.Getter;
import lombok.Setter;

/**
 * 返回数据格式
 *
 * @author Wukh
 * @create 2021-01-08
 */
@Getter
@Setter
public class Result<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回内容
     */
    private String message;

    /**
     * 数据对象
     */
    private T data;

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 初始化一个新创建的 Result 对象，使其表示一个空消息。
     */
    public Result() {
    }

    /**
     * 初始化一个新创建的 Result 对象
     *
     * @param code    状态码
     * @param massage 返回内容
     */
    public Result(Integer code, String massage) {
        this.code = code;
        this.message = massage;
    }

    /**
     * 初始化一个新创建的 Result 对象
     *
     * @param code    状态码
     * @param massage 返回内容
     * @param data    数据对象
     */
    public Result(Integer code, String massage, T data) {
        this.code = code;
        this.message = massage;
        this.data = data;
    }

    /**
     * 初始化一个新创建的 Result 对象
     *
     * @param code    状态码
     * @param massage 返回内容
     * @param success 是否操作成功
     */
    public Result(Integer code, String massage, boolean success) {
        this.code = code;
        this.message = massage;
        this.success = success;
    }

    /**
     * 初始化一个新创建的 Result 对象
     *
     * @param code    状态码
     * @param massage 返回内容
     * @param data    数据对象
     * @param success 是否操作成功
     */
    public Result(Integer code, String massage, T data, boolean success) {
        this.code = code;
        this.message = massage;
        this.data = data;
        this.success = success;
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static Result success() {
        return Result.success(ErrorStateEnum.REQUEST_SUCCESS.getMessage());
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static Result success(Object data) {
        return Result.success(ErrorStateEnum.REQUEST_SUCCESS.getMessage(), data);
    }

    /**
     * 返回成功消息
     *
     * @param massage 返回内容
     * @return 成功消息
     */
    public static Result success(String massage) {
        return Result.success(massage, null);
    }

    /**
     * 返回成功消息
     *
     * @param massage 返回内容
     * @param data    数据对象
     * @return 成功消息
     */
    public static Result success(String massage, Object data) {
        return new Result<>(ErrorStateEnum.REQUEST_SUCCESS.getCode(), massage, data, Boolean.TRUE);
    }

    /**
     * 返回错误消息
     */
    public static Result error() {
        return Result.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param massage 返回内容
     * @return 警告消息
     */
    public static Result error(String massage) {
        return Result.error(massage, null);
    }

    /**
     * 返回错误消息
     *
     * @param massage 返回内容
     * @param data    数据对象
     * @return 警告消息
     */
    public static Result error(String massage, Object data) {
        return new Result(ErrorStateEnum.REQUEST_ERROR.getCode(), massage, data, Boolean.FALSE);
    }

    /**
     * 返回错误消息
     *
     * @param code    状态码
     * @param massage 返回内容
     * @return 警告消息
     */
    public static Result error(int code, String massage) {
        return new Result(code, massage, null, Boolean.FALSE);
    }

    /**
     * 返回错误消息
     *
     * @param code    状态码
     * @param massage 返回内容
     * @param data    响应的数据
     * @return 警告消息
     */
    public static Result error(int code, String massage, Object data) {
        return new Result(code, massage, data, Boolean.FALSE);
    }

    /**
     * 返回错误消息
     *
     * @param errorState 错误信息枚举类
     * @return 警告消息
     */
    public static Result error(ErrorStateEnum errorState) {
        return Result.error(errorState.getCode(), errorState.getMessage());
    }

    /**
     * 返回错误消息
     *
     * @param errorState 错误信息枚举类
     * @param data       返回内容
     * @return 警告消息
     */
    public static Result error(ErrorStateEnum errorState, Object data) {
        return new Result(errorState.getCode(), errorState.getMessage(), data, Boolean.FALSE);
    }
}
