package cn.itcast.exception;

/**
 * 自定义异常
 */
public class SysException extends Exception {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException() {
    }

    public SysException(String message) {
        this.message = message;
    }
}
