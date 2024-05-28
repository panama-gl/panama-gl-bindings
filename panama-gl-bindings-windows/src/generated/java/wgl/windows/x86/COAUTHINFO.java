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
 * typedef struct _COAUTHINFO {
 *     DWORD dwAuthnSvc;
 *     DWORD dwAuthzSvc;
 *     LPWSTR pwszServerPrincName;
 *     DWORD dwAuthnLevel;
 *     DWORD dwImpersonationLevel;
 *     COAUTHIDENTITY *pAuthIdentityData;
 *     DWORD dwCapabilities;
 * } COAUTHINFO
 * }
 */
public class COAUTHINFO extends _COAUTHINFO {

    COAUTHINFO() {
        // Should not be called directly
    }
}

