package org.geektimes.configuration.microprofile.converter;

/**
 *
 * @author   www.92ayou.cn  2021年03月17日
 * @version  1.0
 */
public class ByteConverter extends AbstractConverter<Byte> {


    private static final long serialVersionUID = -8294765313383440388L;

    @Override
    public Byte convert(String value) throws IllegalArgumentException, NullPointerException {

        return Byte.parseByte(value);

    }
}
