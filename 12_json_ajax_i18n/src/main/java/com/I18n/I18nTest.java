package com.I18n;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nTest {
    @Test
    public void testLocale(){
//        Locale locale = Locale.getDefault();
//        System.out.println(locale);
//
//        for (Locale availableLocale : Locale.getAvailableLocales()) {
//
//            System.out.println(availableLocale);
//        }
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
    }
    @Test
    public void testI18n(){
        Locale locale = Locale.US;
        ResourceBundle bundle = ResourceBundle.getBundle("i18n", locale);
        System.out.println("用户名:"+bundle.getString("username"));
        System.out.println("密码:"+bundle.getString("password"));
        System.out.println("年龄:"+bundle.getString("age"));
        System.out.println("性别:"+bundle.getString("sex"));
    }
}
