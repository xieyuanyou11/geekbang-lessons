package org.geektimes.configuration.microprofile.converter;

import org.apache.commons.beanutils.ConversionException;
import org.eclipse.microprofile.config.spi.Converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public abstract class AbstractConverter<T>  implements Converter<T> {


    private static final long serialVersionUID = -7119399131391374328L;

    protected ConversionException conversionException(final Class<?> type, final Object value) {
        return new ConversionException("Can't convert value '" + value
                + "' to type " + type);
    }

}
