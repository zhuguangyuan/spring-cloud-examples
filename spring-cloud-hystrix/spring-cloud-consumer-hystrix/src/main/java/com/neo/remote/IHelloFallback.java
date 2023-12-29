package com.neo.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by summer on 2017/5/15.
 */
@Component
public class IHelloFallback implements IHello {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", producer down. this messge send failed ";
    }
}
