package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class ShortConverter extends AbstractConverter<Short> {


    private static final long serialVersionUID = 8555716874640582866L;

    @Override
    public Short convert(String value) throws IllegalArgumentException, NullPointerException {

        return Short.parseShort(value);

    }
}
