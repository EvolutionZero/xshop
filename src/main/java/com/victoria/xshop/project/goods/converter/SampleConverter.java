package com.victoria.xshop.project.goods.converter;

import com.google.common.base.Converter;
import org.springframework.beans.BeanUtils;

public class SampleConverter extends Converter<String, String> {

    @Override
    protected String doForward(String s) {
        return null;
    }

    @Override
    protected String doBackward(String s) {
        return null;
    }
}
