package cn.itcast.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 异常处理的业务逻辑
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        SysException sysException;
        if (ex instanceof SysException) {
            sysException = (SysException) ex;
        } else {
            sysException = new SysException("正在维护中...");
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", sysException.getMessage());
        mav.setViewName("error");
        return mav;
    }
}
