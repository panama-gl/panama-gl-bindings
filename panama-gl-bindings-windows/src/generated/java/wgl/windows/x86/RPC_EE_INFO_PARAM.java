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
 * typedef struct tagRPC_EE_INFO_PARAM {
 *     ExtendedErrorParamTypes ParameterType;
 *     union {
 *         LPSTR AnsiString;
 *         LPWSTR UnicodeString;
 *         long LVal;
 *         short SVal;
 *         ULONGLONG PVal;
 *         BinaryParam BVal;
 *     } u;
 * } RPC_EE_INFO_PARAM
 * }
 */
public class RPC_EE_INFO_PARAM extends tagRPC_EE_INFO_PARAM {

    RPC_EE_INFO_PARAM() {
        // Should not be called directly
    }
}

