// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$211 {

    static final FunctionDescriptor PBAD_MEMORY_CALLBACK_ROUTINE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PBAD_MEMORY_CALLBACK_ROUTINE$MH = RuntimeHelper.downcallHandle(
        constants$211.PBAD_MEMORY_CALLBACK_ROUTINE$FUNC
    );
    static final FunctionDescriptor RegisterBadMemoryNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterBadMemoryNotification$MH = RuntimeHelper.downcallHandle(
        "RegisterBadMemoryNotification",
        constants$211.RegisterBadMemoryNotification$FUNC
    );
    static final FunctionDescriptor UnregisterBadMemoryNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterBadMemoryNotification$MH = RuntimeHelper.downcallHandle(
        "UnregisterBadMemoryNotification",
        constants$211.UnregisterBadMemoryNotification$FUNC
    );
    static final FunctionDescriptor OfferVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OfferVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "OfferVirtualMemory",
        constants$211.OfferVirtualMemory$FUNC
    );
    static final FunctionDescriptor ReclaimVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ReclaimVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "ReclaimVirtualMemory",
        constants$211.ReclaimVirtualMemory$FUNC
    );
    static final FunctionDescriptor DiscardVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DiscardVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "DiscardVirtualMemory",
        constants$211.DiscardVirtualMemory$FUNC
    );
}


