package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class IntegerConverter extends AbstractConverter<Integer> {


    private static final long serialVersionUID = -5185542198780683817L;

    @Override
    public Integer convert(String value) throws IllegalArgumentException, NullPointerException {

        return Integer.parseInt(value);

    }
}
