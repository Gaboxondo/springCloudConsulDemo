package com.mashosoft.consul.example.users.consuldemousers.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
@Slf4j
public class UsersController {

    private final DiscoveryClient discoveryClient;

    @GetMapping
    public List<String> getServiceNames() {
        List<String> servicesNamesInConsul = discoveryClient.getServices();
        return servicesNamesInConsul;
    }
}
