// Generated by jextract

package freeglut.windows.x86;

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
 * typedef struct _PROCESS_MITIGATION_DYNAMIC_CODE_POLICY {
 *     union {
 *         DWORD Flags;
 *         struct {
 *             DWORD ProhibitDynamicCode : 1;
 *             DWORD AllowThreadOptOut : 1;
 *             DWORD AllowRemoteDowngrade : 1;
 *             DWORD AuditProhibitDynamicCode : 1;
 *             DWORD ReservedFlags : 28;
 *         };
 *     };
 * } PROCESS_MITIGATION_DYNAMIC_CODE_POLICY
 * }
 */
public class PROCESS_MITIGATION_DYNAMIC_CODE_POLICY extends _PROCESS_MITIGATION_DYNAMIC_CODE_POLICY {

    PROCESS_MITIGATION_DYNAMIC_CODE_POLICY() {
        // Should not be called directly
    }
}

