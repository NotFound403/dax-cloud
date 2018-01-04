package cn.felord.feign.log;

import org.slf4j.Logger;

/**
 * The type Delegate logger.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /12/15 15:27
 */
public class Log {

    private Log() {
    }


    /**
     * Service down.
     *
     * @param logger    the logger
     * @param serviceId the service id
     */
    public static void serviceDown(Logger logger, String serviceId) {
        logger.debug("serviceId: {} -> 服务不可用",serviceId);
    }
}
