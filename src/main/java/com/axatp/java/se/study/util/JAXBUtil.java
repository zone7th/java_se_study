package com.axatp.java.se.study.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * 
 * @Description: xml实体互转工具类
 * @author Martin
 * @date 2018年4月26日 上午12:46:30
 */
public class JAXBUtil {

	static ConcurrentHashMap<String, JAXBContext> jaxbContextMap = new ConcurrentHashMap<String, JAXBContext>();

	/**
	 * 
	 * @Description: java实体类转xml
	 * @param obj
	 * @param encode
	 *            编码格式
	 * @param format
	 *            是否格式化生成的xml串
	 * @param fragment
	 *            是否省略xm头声明信息
	 * @return
	 * @author Martin
	 * @date 2018年4月26日 上午12:48:08
	 */
	public static String toXML(Object obj, String encode, boolean format, boolean fragment) {
		try {
			JAXBContext jaxbContext = jaxbContextMap.get(obj.getClass().getName());
			if (jaxbContext == null) {
				jaxbContext = JAXBContext.newInstance(obj.getClass());
				jaxbContextMap.put(obj.getClass().getName(), jaxbContext);
			}

			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, encode);
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, format);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, fragment);
			StringWriter writer = new StringWriter();
			marshaller.marshal(obj, writer);
			return writer.toString();
		} catch (Exception e) {
			LogUtil.error("java实体类转xml异常", e);
			throw new RuntimeException("java实体类转xml异常");
		}
	}

	/**
	 * xml转java实体类
	 */
	@SuppressWarnings("unchecked")
	public static <T> T fromXML(String xml, Class<T> valueType) {
		try {
			JAXBContext jaxbContext = jaxbContextMap.get(valueType.getName());
			if (jaxbContext == null) {
				jaxbContext = JAXBContext.newInstance(valueType);
				jaxbContextMap.put(valueType.getName(), jaxbContext);
			}
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			return (T) unmarshaller.unmarshal(new StringReader(xml));
		} catch (Exception e) {
			LogUtil.error("java实体类转xml异常", e);
			throw new RuntimeException("java实体类转xml异常");
		}
	}
}
