package com.axatp.java.se.study.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Description: 日期处理格式化工具类
 * @author Martin
 * @date 2018年1月16日 下午5:21:01
 */
public class DateUtil {
	/** 存放不同的日期模板格式的sdf的Map */
	private static ThreadLocal<Map<String, SimpleDateFormat>> sdfMap = new ThreadLocal<Map<String, SimpleDateFormat>>() {
		@Override
		protected Map<String, SimpleDateFormat> initialValue() {
			// System.out.println(Thread.currentThread().getName() + " init
			// pattern: " + Thread.currentThread());
			return new HashMap<String, SimpleDateFormat>();
		}
	};

	/**
	 * 返回一个SimpleDateFormat,每个线程只会new一次pattern对应的sdf
	 * 
	 * @param pattern
	 * @return
	 */
	private static SimpleDateFormat getSdf(final String pattern) {
		Map<String, SimpleDateFormat> tl = sdfMap.get();
		SimpleDateFormat sdf = tl.get(pattern);
		if (sdf == null) {
			// System.out.println(Thread.currentThread().getName()+" put new sdf
			// of pattern " + pattern + " to map");
			sdf = new SimpleDateFormat(pattern);
			tl.put(pattern, sdf);
		}
		return sdf;
	}

	/**
	 * 这样每个线程只会有一个SimpleDateFormat
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		return getSdf(pattern).format(date);
	}

	public static Date parse(String dateStr, String pattern) throws ParseException {
		return getSdf(pattern).parse(dateStr);
	}

	public static long getDaySub(String beginDateStr, String endDateStr) {
		long day = 0;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date beginDate = format.parse(beginDateStr);
			Date endDate = format.parse(endDateStr);
			day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return day;
	}
}
