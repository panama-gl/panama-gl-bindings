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
 * typedef struct _CERT_LOGOTYPE_IMAGE_INFO {
 *     DWORD dwLogotypeImageInfoChoice;
 *     DWORD dwFileSize;
 *     DWORD dwXSize;
 *     DWORD dwYSize;
 *     DWORD dwLogotypeImageResolutionChoice;
 *     union {
 *         DWORD dwNumBits;
 *         DWORD dwTableSize;
 *     };
 *     LPWSTR pwszLanguage;
 * } CERT_LOGOTYPE_IMAGE_INFO
 * }
 */
public class CERT_LOGOTYPE_IMAGE_INFO extends _CERT_LOGOTYPE_IMAGE_INFO {

    CERT_LOGOTYPE_IMAGE_INFO() {
        // Should not be called directly
    }
}

