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
 * typedef struct _NDR_USER_MARSHAL_INFO_LEVEL1 {
 *     void *Buffer;
 *     unsigned long BufferSize;
 *     void *(*pfnAllocate)(size_t) __attribute__((stdcall));
 *     void (*pfnFree)(void *) __attribute__((stdcall));
 *     struct IRpcChannelBuffer *pRpcChannelBuffer;
 *     ULONG_PTR Reserved[5];
 * } NDR_USER_MARSHAL_INFO_LEVEL1
 * }
 */
public class NDR_USER_MARSHAL_INFO_LEVEL1 extends _NDR_USER_MARSHAL_INFO_LEVEL1 {

    NDR_USER_MARSHAL_INFO_LEVEL1() {
        // Should not be called directly
    }
}

