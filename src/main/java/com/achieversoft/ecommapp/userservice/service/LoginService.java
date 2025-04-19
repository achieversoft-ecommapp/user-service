package com.achieversoft.ecommapp.userservice.service;

import com.achieversoft.ecommapp.userservice.common.exception.ApplicationException;
import com.achieversoft.ecommapp.userservice.model.Credentials;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Login service.
 */
@Service
@Slf4j
public class LoginService {

    /*@Autowired
    private UserDataClient client;*/

    public Object getCredentialById(String id) throws ApplicationException {
        return "client.getCredentialById(id)";
    }

    public Object getCredentialDetails() throws ApplicationException {
        return "client.getCredentials()";
    }

    public Object saveOrUpdateCredential(List<Credentials> list) throws ApplicationException {
        return "client.saveOrUpdateCredentials(list)";
    }

    public Object deleteAllCredential() throws ApplicationException {
        return "client.deleteAllCredentials()";
    }

    public Object deleteCredential(String id) throws ApplicationException {
        return "client.deleteCredential(id)";
    }




}
