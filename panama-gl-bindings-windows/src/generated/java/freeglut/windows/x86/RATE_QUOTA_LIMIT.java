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
 * typedef union _RATE_QUOTA_LIMIT {
 *     DWORD RateData;
 *     struct {
 *         DWORD RatePercent : 7;
 *         DWORD Reserved0 : 25;
 *     };
 * } RATE_QUOTA_LIMIT
 * }
 */
public class RATE_QUOTA_LIMIT extends _RATE_QUOTA_LIMIT {

    RATE_QUOTA_LIMIT() {
        // Should not be called directly
    }
}

