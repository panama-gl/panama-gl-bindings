// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * typedef struct _CRYPT_KEY_SIGN_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgAndCertEncodingType;
 *     union {
 *         HCRYPTPROV hCryptProv;
 *         NCRYPT_KEY_HANDLE hNCryptKey;
 *     };
 *     DWORD dwKeySpec;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     void *pvHashAuxInfo;
 *     CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm;
 * } CRYPT_KEY_SIGN_MESSAGE_PARA
 * }
 */
public class CRYPT_KEY_SIGN_MESSAGE_PARA extends _CRYPT_KEY_SIGN_MESSAGE_PARA {

    CRYPT_KEY_SIGN_MESSAGE_PARA() {
        // Should not be called directly
    }
}

