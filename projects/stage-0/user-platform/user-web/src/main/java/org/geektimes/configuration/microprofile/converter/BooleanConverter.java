package org.geektimes.configuration.microprofile.converter;

/**
 * @author www.92ayou.cn  2021年03月17日
 * @version 1.0
 */
public class BooleanConverter extends AbstractConverter<Boolean> {


    private static final long serialVersionUID = -264826469126251886L;

    @Override
    public Boolean convert(String value) throws IllegalArgumentException, NullPointerException {
        final String stringValue = value.toString().toLowerCase();

        String trueStr = "true";
        if (trueStr.equals(stringValue)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
