package com.axatp.java.se.study.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSONObject;

/**
 * 
 * <p>
 * description:日志输出用共通类
 * </p>
 * 
 * @author Martin
 * @since 2018年1月14日
 * @see
 */
public class LogUtil {
	private static final String formater = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 输出用logger
	 */
	private static Log logger = LogFactory.getLog(LogUtil.class);

	/**
	 * 输出Debug日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void debug(String message) {
		try {
			logger.debug(getThrowableLineString(new LogThrowableInfo()) + "  - " + "[" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message);
		} catch (Exception e) {
			logger.error("LogUtil error", e);
		}
	}

	/**
	 * 输出Debug日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void debug(String message, Throwable e) {
		try {
			logger.debug(getThrowableLineString(new LogThrowableInfo()) + "  - " + "[" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message, e);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 日志等级为当前等级输出Debug日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void debugWhenEnable(String message) {
		try {
			if (logger.isDebugEnabled()) {
				logger.debug(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
						+ DateUtil.format(new Date(), formater) + "]" + message);
			}
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出信息日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void info(String message) {
		try {
			logger.info(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出信息日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void info(String message, Throwable e) {
		try {
			logger.info(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message, e);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 日志等级为当前等级输出INFO日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void infoWhenEnable(String message) {
		try {
			if (logger.isInfoEnabled()) {
				logger.info(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
						+ DateUtil.format(new Date(), formater) + "]" + message);
			}
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出warn日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void warn(String message) {
		try {
			logger.warn(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出warn日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void warn(String message, Throwable e) {
		try {
			logger.warn(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message, e);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出trace日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void trace(String message) {
		try {
			logger.trace(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出错误日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void error(String message) {
		try {
			logger.error(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出错误日志
	 * 
	 * @param message
	 *            信息
	 */
	public static void error(String message, Throwable e) {
		try {
			logger.error(getThrowableLineString(new LogThrowableInfo()) + "  - [" + Thread.currentThread().getId()
					+ DateUtil.format(new Date(), formater) + "]" + message, e);
		} catch (Exception ex) {
			logger.error("LogUtil error", ex);
		}
	}

	/**
	 * 输出错误日志
	 * 
	 * @param throwable
	 *            异常
	 */
	public static void error(Throwable throwable) {
		logger.error(throwable.getMessage());
	}

	/**
	 * 取得异常信息的文本内容
	 * 
	 * @return 异常信息
	 */
	public static String getThrowableLineString(LogThrowableInfo t) {
		String[] lines = t.getThrowableStrRep();
		String traceLine = "";

		if (lines != null && lines.length > 3) {
			traceLine = lines[3];
		}

		if (traceLine.startsWith("\tat ")) {
			traceLine = traceLine.substring(4);
		}

		return traceLine;
	}

	// 日志打印入参
	@SuppressWarnings("finally")
	public static String presentData(Object object) {
		String result = null;
		try {
			result = JSONObject.toJSONString(object);
		} catch (IndexOutOfBoundsException e) {
			result = "参数越界: " + e;
		} catch (NullPointerException e) {
			result = "参数空指针异常: " + e;
		} catch (Exception e) {
			result = "参数其他异常: " + e;
		}
		return result;

	}

	// 工具测试
	public static void getOrder() {
		try {
			List list = new ArrayList();
			list.get(100);
		} catch (Exception e) {
			throw new RuntimeException("订单不存在" + e);
		}

	}

	/**
	 * 
	 * @Description: 日志输出
	 * @param order
	 * @param msg
	 * @author jiangxiao
	 * @date 2017年12月28日 上午11:02:53
	 */
	public static void getLoggerInfo(String msg, String orderCode) {
		StringBuilder sb = new StringBuilder();
		if (logger.isWarnEnabled()) {
			sb.append("[" + Thread.currentThread().getId() + "]");
			logger.warn(sb.append(msg).append(orderCode).toString());
		}
	}

	public static void main(String[] args) {
		LogUtil.info("msg");
		System.out.println();
	}

}
