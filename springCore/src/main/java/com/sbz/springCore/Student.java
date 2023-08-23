package com.sbz.springCore;

import org.springframework.stereotype.Component;

@Component
public class Student {

    Laptop laptop;

    public void coding() {
        laptop.compiling();
    }
}
