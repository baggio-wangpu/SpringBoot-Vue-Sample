package com.example.demo.entity;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class MD5Converter implements AttributeConverter<String, String> {
    @Override
    public String convertToDatabaseColumn(String attribute) {
        //encode
        return DigestUtils.md5Hex(attribute).toUpperCase();
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return dbData;
    }
}
