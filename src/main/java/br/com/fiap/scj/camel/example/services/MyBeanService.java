package br.com.fiap.scj.camel.example.services;

import br.com.fiap.scj.camel.example.beans.MyBean;

import java.util.Random;

public class MyBeanService {

    public static void example(MyBean bean) {
        bean.setId(new Random ().nextInt());
    }
}
