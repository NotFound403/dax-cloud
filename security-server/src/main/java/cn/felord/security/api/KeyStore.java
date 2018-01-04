package cn.felord.security.api;

import cn.felord.common.util.RSA;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * The type Key store.
 *
 * @author dax.
 * @version v1.0
 * @since 2017 /11/23 17:27
 */
final class KeyStore {

    private static final String PATH = "D:/WorkSpaces/kidguardian/security-server/src/main/resources";

    private KeyStore() {
    }

    /**
     * 加载公钥.
     *
     * @return the rsa public key
     * @throws Exception the exception
     */
    static RSAPublicKey publicKey() throws Exception {
        String pub = RSA.loadPublicKeyByFile(PATH);
        return RSA.loadPublicKeyByStr(pub);
    }

    static RSAPrivateKey privateKey() throws Exception {
        String pri = RSA.loadPrivateKeyByFile(PATH);
        return RSA.loadPrivateKeyByStr(pri);
    }
}
