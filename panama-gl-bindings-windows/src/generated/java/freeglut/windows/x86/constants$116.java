// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$116 {

    static final FunctionDescriptor RtlInterlockedPopEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInterlockedPopEntrySList$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedPopEntrySList",
        constants$116.RtlInterlockedPopEntrySList$FUNC
    );
    static final FunctionDescriptor RtlInterlockedPushEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInterlockedPushEntrySList$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedPushEntrySList",
        constants$116.RtlInterlockedPushEntrySList$FUNC
    );
    static final FunctionDescriptor RtlInterlockedPushListSListEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlInterlockedPushListSListEx$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedPushListSListEx",
        constants$116.RtlInterlockedPushListSListEx$FUNC
    );
    static final FunctionDescriptor RtlInterlockedFlushSList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInterlockedFlushSList$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedFlushSList",
        constants$116.RtlInterlockedFlushSList$FUNC
    );
    static final FunctionDescriptor RtlQueryDepthSList$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlQueryDepthSList$MH = RuntimeHelper.downcallHandle(
        "RtlQueryDepthSList",
        constants$116.RtlQueryDepthSList$FUNC
    );
    static final FunctionDescriptor RtlGetReturnAddressHijackTarget$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle RtlGetReturnAddressHijackTarget$MH = RuntimeHelper.downcallHandle(
        "RtlGetReturnAddressHijackTarget",
        constants$116.RtlGetReturnAddressHijackTarget$FUNC
    );
}

