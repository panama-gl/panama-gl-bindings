// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$882 {

    static final FunctionDescriptor SCardLocateCardsByATRA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsByATRA$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRA",
        constants$882.SCardLocateCardsByATRA$FUNC
    );
    static final FunctionDescriptor SCardLocateCardsByATRW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardLocateCardsByATRW$MH = RuntimeHelper.downcallHandle(
        "SCardLocateCardsByATRW",
        constants$882.SCardLocateCardsByATRW$FUNC
    );
    static final FunctionDescriptor SCardGetStatusChangeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardGetStatusChangeA$MH = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeA",
        constants$882.SCardGetStatusChangeA$FUNC
    );
    static final FunctionDescriptor SCardGetStatusChangeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SCardGetStatusChangeW$MH = RuntimeHelper.downcallHandle(
        "SCardGetStatusChangeW",
        constants$882.SCardGetStatusChangeW$FUNC
    );
    static final FunctionDescriptor SCardCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SCardCancel$MH = RuntimeHelper.downcallHandle(
        "SCardCancel",
        constants$882.SCardCancel$FUNC
    );
    static final FunctionDescriptor SCardConnectA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SCardConnectA$MH = RuntimeHelper.downcallHandle(
        "SCardConnectA",
        constants$882.SCardConnectA$FUNC
    );
}


