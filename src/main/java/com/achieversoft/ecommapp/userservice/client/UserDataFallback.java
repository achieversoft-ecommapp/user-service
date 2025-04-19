package com.achieversoft.ecommapp.userservice.client;


import com.achieversoft.ecommapp.commonapplibrary.response.ServiceResponse;
import com.achieversoft.ecommapp.userservice.model.Credentials;
import com.achieversoft.ecommapp.userservice.model.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Mono;

import java.util.List;


//@Component
public class UserDataFallback {//implements UserDataClient {


    //@Override
    public Mono<ServiceResponse> getUsers() {
        return Mono.just(ServiceResponse.builder().response("fallback").build());
    }
}
