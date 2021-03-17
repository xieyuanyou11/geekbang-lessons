package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class StringConverter extends AbstractConverter<String> {


    private static final long serialVersionUID = 2281564453667529427L;

    @Override
    public String convert(String value) throws IllegalArgumentException, NullPointerException {

        return value;

    }
}
