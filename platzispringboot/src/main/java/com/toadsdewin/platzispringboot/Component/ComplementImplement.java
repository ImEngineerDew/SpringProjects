package com.toadsdewin.platzispringboot.Component;

import org.springframework.stereotype.Component;

@Component
public class ComplementImplement implements ComponentDependency
{
    @Override
    public void message() {
        System.out.println("Hola mundo desde mi componente");
    }
}
