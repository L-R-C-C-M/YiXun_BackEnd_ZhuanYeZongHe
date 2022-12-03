package com.yixun.yixun_backend.controller;

//import com.yixun.yixun_backend.entity.Address;
import com.yixun.yixun_backend.domain.Address;
import com.yixun.yixun_backend.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private AddressMapper addressMapper;

    @GetMapping("/hello")
    public String hello()
    {
        return "hello world";
    }

    @GetMapping("/address")
    //查询所有用户
    public List query()
    {
        List<Address> addresses=addressMapper.selectList(null);
        System.out.println(addresses);
        return addresses;
    }
}
