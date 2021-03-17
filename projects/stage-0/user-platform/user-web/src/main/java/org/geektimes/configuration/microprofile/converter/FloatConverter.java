package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class FloatConverter extends AbstractConverter<Float> {


    private static final long serialVersionUID = 3291723559410061395L;

    @Override
    public Float convert(String value) throws IllegalArgumentException, NullPointerException {

        return Float.parseFloat(value);

    }
}
