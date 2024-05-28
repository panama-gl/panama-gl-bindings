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
 * typedef struct _PROCESSOR_POWER_POLICY {
 *     DWORD Revision;
 *     BYTE DynamicThrottle;
 *     BYTE Spare[3];
 *     DWORD DisableCStates : 1;
 *     DWORD Reserved : 31;
 *     DWORD PolicyCount;
 *     PROCESSOR_POWER_POLICY_INFO Policy[3];
 * } PROCESSOR_POWER_POLICY
 * }
 */
public class PROCESSOR_POWER_POLICY extends _PROCESSOR_POWER_POLICY {

    PROCESSOR_POWER_POLICY() {
        // Should not be called directly
    }
}

