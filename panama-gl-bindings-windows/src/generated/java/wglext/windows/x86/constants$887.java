// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$887 {

    static final FunctionDescriptor GetOpenCardNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOpenCardNameA$MH = RuntimeHelper.downcallHandle(
        "GetOpenCardNameA",
        constants$887.GetOpenCardNameA$FUNC
    );
    static final FunctionDescriptor GetOpenCardNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOpenCardNameW$MH = RuntimeHelper.downcallHandle(
        "GetOpenCardNameW",
        constants$887.GetOpenCardNameW$FUNC
    );
    static final FunctionDescriptor SCardDlgExtendedError$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SCardDlgExtendedError$MH = RuntimeHelper.downcallHandle(
        "SCardDlgExtendedError",
        constants$887.SCardDlgExtendedError$FUNC
    );
    static final FunctionDescriptor SCardReadCacheA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardReadCacheA$MH = RuntimeHelper.downcallHandle(
        "SCardReadCacheA",
        constants$887.SCardReadCacheA$FUNC
    );
    static final FunctionDescriptor SCardReadCacheW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardReadCacheW$MH = RuntimeHelper.downcallHandle(
        "SCardReadCacheW",
        constants$887.SCardReadCacheW$FUNC
    );
    static final FunctionDescriptor SCardWriteCacheA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardWriteCacheA$MH = RuntimeHelper.downcallHandle(
        "SCardWriteCacheA",
        constants$887.SCardWriteCacheA$FUNC
    );
}


