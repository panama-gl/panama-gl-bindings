// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$204 {

    static final FunctionDescriptor PrefetchVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrefetchVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "PrefetchVirtualMemory",
        constants$204.PrefetchVirtualMemory$FUNC
    );
    static final FunctionDescriptor CreateFileMappingFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileMappingFromApp$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingFromApp",
        constants$204.CreateFileMappingFromApp$FUNC
    );
    static final FunctionDescriptor MapViewOfFileFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFileFromApp$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileFromApp",
        constants$204.MapViewOfFileFromApp$FUNC
    );
    static final FunctionDescriptor UnmapViewOfFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnmapViewOfFileEx$MH = RuntimeHelper.downcallHandle(
        "UnmapViewOfFileEx",
        constants$204.UnmapViewOfFileEx$FUNC
    );
    static final FunctionDescriptor AllocateUserPhysicalPages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AllocateUserPhysicalPages$MH = RuntimeHelper.downcallHandle(
        "AllocateUserPhysicalPages",
        constants$204.AllocateUserPhysicalPages$FUNC
    );
    static final FunctionDescriptor FreeUserPhysicalPages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeUserPhysicalPages$MH = RuntimeHelper.downcallHandle(
        "FreeUserPhysicalPages",
        constants$204.FreeUserPhysicalPages$FUNC
    );
}


