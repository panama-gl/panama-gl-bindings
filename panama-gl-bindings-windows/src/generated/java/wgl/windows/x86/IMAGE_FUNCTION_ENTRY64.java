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
 * typedef struct _IMAGE_FUNCTION_ENTRY64 {
 *     ULONGLONG StartingAddress;
 *     ULONGLONG EndingAddress;
 *     union {
 *         ULONGLONG EndOfPrologue;
 *         ULONGLONG UnwindInfoAddress;
 *     };
 * } IMAGE_FUNCTION_ENTRY64
 * }
 */
public class IMAGE_FUNCTION_ENTRY64 extends _IMAGE_FUNCTION_ENTRY64 {

    IMAGE_FUNCTION_ENTRY64() {
        // Should not be called directly
    }
}

