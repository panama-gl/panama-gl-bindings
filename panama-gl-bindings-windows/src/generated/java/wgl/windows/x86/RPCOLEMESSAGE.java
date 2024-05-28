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
 * typedef struct tagRPCOLEMESSAGE {
 *     void *reserved1;
 *     RPCOLEDATAREP dataRepresentation;
 *     void *Buffer;
 *     ULONG cbBuffer;
 *     ULONG iMethod;
 *     void *reserved2[5];
 *     ULONG rpcFlags;
 * } RPCOLEMESSAGE
 * }
 */
public class RPCOLEMESSAGE extends tagRPCOLEMESSAGE {

    RPCOLEMESSAGE() {
        // Should not be called directly
    }
}

