package org.geektimes.configuration.microprofile.converter;

import org.eclipse.microprofile.config.spi.Converter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * @author www.92ayou.cn  2021年03月17日
 * @version 1.0
 */
public class ConverterUtils {

    private static Map<Class<?>, Converter> converterMap = new HashMap<>();

    static {
        ServiceLoader<Converter> serviceLoader = ServiceLoader.load(Converter.class);
        for (Converter converter : serviceLoader) {
            // 获取类型
            Type type = ((ParameterizedType) converter.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            converterMap.put((Class<?>) type, converter);
        }
    }

    private ConverterUtils() {

    }

    public static <T> T convert(String value, Class<T> castType) throws IllegalArgumentException, NullPointerException {
        if (value == null || value.length() == 0) {
            throw new NullPointerException("value can not be null or ''");
        }

        Converter<T> converter = converterMap.get(castType);
        if (converter == null) {
            throw new IllegalArgumentException("Can't convert value '" + value
                    + "' to type " + castType);
        }

        return converter.convert(value);
    }


    public static void main(String[] args) {
        System.out.println(ConverterUtils.convert(" ", Boolean.class));

        System.out.println(ConverterUtils.convert("123", Integer.class));

        System.out.println(ConverterUtils.convert("111", Short.class));

        System.out.println(ConverterUtils.convert("99", Byte.class));

        System.out.println(ConverterUtils.convert("12345678901", Integer.class));
    }
}
