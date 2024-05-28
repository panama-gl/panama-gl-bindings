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
 * typedef struct _CRL_CONTEXT {
 *     DWORD dwCertEncodingType;
 *     BYTE *pbCrlEncoded;
 *     DWORD cbCrlEncoded;
 *     PCRL_INFO pCrlInfo;
 *     HCERTSTORE hCertStore;
 * } CRL_CONTEXT
 * }
 */
public class CRL_CONTEXT extends _CRL_CONTEXT {

    CRL_CONTEXT() {
        // Should not be called directly
    }
}

