package com.achieversoft.ecommapp.userservice.client;


import com.achieversoft.ecommapp.commonapplibrary.response.ServiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import reactor.core.publisher.Mono;

/**
 * The interface User repository.
 */
//@FeignClient(value = "user-data-service",url = "http://localhost:8082/")
public interface UserDataClient  {

    //@GetMapping("/api/details/all")
    public Mono<ServiceResponse> getUsers();

    /*@GetMapping("/api/details/{id}")
    public Object getUserById(@PathVariable String id);

    @PutMapping("/api/details/updt")
    public Object saveOrUpdateUser(@RequestBody List<Users> list);

    @PostMapping("/api/details/dlt/{id}")
    public Object deleteUser(@PathVariable String id);

    @PostMapping("/api/details/dlt/all")
    public Object deleteAllUser();

    @GetMapping("/api/login/details/all")
    public Object getCredentials();

    @GetMapping("/api/login/details/{id}")
    public Object getCredentialById(@PathVariable String id);

    @PutMapping("/api/login/details/updt")
    public Object saveOrUpdateCredentials(@RequestBody List<Credentials> list);

    @PostMapping("/api/login/details/dlt/{id}")
    public Object deleteCredential(@PathVariable String id);

    @PostMapping("/api/login/details/dlt/all")
    public Object deleteAllCredentials();*/
}
