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
 * typedef struct _JOBOBJECT_SECURITY_LIMIT_INFORMATION {
 *     DWORD SecurityLimitFlags;
 *     HANDLE JobToken;
 *     PTOKEN_GROUPS SidsToDisable;
 *     PTOKEN_PRIVILEGES PrivilegesToDelete;
 *     PTOKEN_GROUPS RestrictedSids;
 * } JOBOBJECT_SECURITY_LIMIT_INFORMATION
 * }
 */
public class JOBOBJECT_SECURITY_LIMIT_INFORMATION extends _JOBOBJECT_SECURITY_LIMIT_INFORMATION {

    JOBOBJECT_SECURITY_LIMIT_INFORMATION() {
        // Should not be called directly
    }
}

