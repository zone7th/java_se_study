package com.axatp.java.se.study.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 *<p>
 *description:日志输出用共通类
 *</p>
 * @author Martin
 * @since 2018年1月14日
 * @see
 */
public class LogUtil
{

    /**
     * 输出用logger
     */
    private static Log logger = LogFactory.getLog(LogUtil.class);

    /**
     * 输出Debug日志
     * 
     * @param message 信息
     */
    public static void debug(String message)
    {
        try
        {
            logger.debug(getThrowableLineString(new LogThrowableInfo()) + "  - " + message);
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }

    /**
     * 输出信息日志
     * 
     * @param message 信息
     */
    public static void info(String message)
    {
        try
        {
            logger.info(getThrowableLineString(new LogThrowableInfo()) + "  - " + message);
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }

    /**
     * 输出信息日志
     * 
     * @param message 信息
     */
    public void info1(String message)
    {
        try
        {
            logger.info(getThrowableLineString(new LogThrowableInfo()) + "  - " + message);
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }

    /**
     * 输出trace日志
     * 
     * @param message 信息
     */
    public static void trace(String message)
    {
        try
        {
            logger.trace(getThrowableLineString(new LogThrowableInfo()) + "  - " + message);
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }

    /**
     * 输出错误日志
     * 
     * @param message 信息
     */
    public static void error(String message)
    {
        try
        {
            logger.error(getThrowableLineString(new LogThrowableInfo()) + "  - " + message);
        }
        catch (Exception ex)
        {
            logger.error(ex.getMessage());
        }
    }

    /**
     * 输出错误日志
     * 
     * @param throwable 异常
     */
    public static void error(Throwable throwable)
    {
        logger.error(throwable.getMessage());
    }

    /**
     * 取得异常信息的文本内容
     * 
     * @return 异常信息
     */
    public static String getThrowableLineString(LogThrowableInfo t)
    {
        String[] lines = t.getThrowableStrRep();
        String traceLine = "";

        if (lines != null && lines.length > 3)
        {
            traceLine = lines[3];
        }

        if (traceLine.startsWith("\tat "))
        {
            traceLine = traceLine.substring(4);
        }

        return traceLine;
    }
    
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            LogUtil.info("123");
            logger.info("123");
        }
        
    }
}
