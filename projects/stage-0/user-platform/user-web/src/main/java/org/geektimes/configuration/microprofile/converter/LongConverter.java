package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class LongConverter extends AbstractConverter<Long> {


    private static final long serialVersionUID = 7848011671470672581L;

    @Override
    public Long convert(String value) throws IllegalArgumentException, NullPointerException {

        return Long.parseLong(value);

    }
}
