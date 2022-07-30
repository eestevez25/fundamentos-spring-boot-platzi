package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties{
    private String nombre;
    private String apellido;

    public MyBeanWithPropertiesImplement(String name, String apellido, String random) {
        this.nombre = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return nombre+ "-" +apellido;
    }
}
