package cn.felord.security.config;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

/**
 * @author dax.
 * @version v1.0
 * @since 2018/1/4 17:19
 */

public class CustomClientDetailsService implements ClientDetailsService {
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        BaseClientDetails clientDetails=new BaseClientDetails();

        return null;
    }
}
