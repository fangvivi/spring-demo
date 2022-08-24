package com.wayne.spring.qualifier;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wayne
 */
@Component
@ToString
public class SixthGrade {
    @Value("六年级")
    private String name;
}
