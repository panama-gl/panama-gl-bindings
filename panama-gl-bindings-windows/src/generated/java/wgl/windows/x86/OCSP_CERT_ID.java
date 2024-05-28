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
 * typedef struct _OCSP_CERT_ID {
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     CRYPT_HASH_BLOB IssuerNameHash;
 *     CRYPT_HASH_BLOB IssuerKeyHash;
 *     CRYPT_INTEGER_BLOB SerialNumber;
 * } OCSP_CERT_ID
 * }
 */
public class OCSP_CERT_ID extends _OCSP_CERT_ID {

    OCSP_CERT_ID() {
        // Should not be called directly
    }
}

