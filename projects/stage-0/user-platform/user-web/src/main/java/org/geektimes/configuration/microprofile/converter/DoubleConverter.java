package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class DoubleConverter extends AbstractConverter<Double> {


    private static final long serialVersionUID = 5253009761172709107L;

    @Override
    public Double convert(String value) throws IllegalArgumentException, NullPointerException {

        return Double.parseDouble(value);

    }
}
