// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$201 {

    static final FunctionDescriptor OpenFileMappingW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenFileMappingW$MH = RuntimeHelper.downcallHandle(
        "OpenFileMappingW",
        constants$201.OpenFileMappingW$FUNC
    );
    static final FunctionDescriptor MapViewOfFile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFile$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFile",
        constants$201.MapViewOfFile$FUNC
    );
    static final FunctionDescriptor MapViewOfFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapViewOfFileEx$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileEx",
        constants$201.MapViewOfFileEx$FUNC
    );
    static final FunctionDescriptor VirtualFreeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualFreeEx$MH = RuntimeHelper.downcallHandle(
        "VirtualFreeEx",
        constants$201.VirtualFreeEx$FUNC
    );
    static final FunctionDescriptor FlushViewOfFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle FlushViewOfFile$MH = RuntimeHelper.downcallHandle(
        "FlushViewOfFile",
        constants$201.FlushViewOfFile$FUNC
    );
    static final FunctionDescriptor UnmapViewOfFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnmapViewOfFile$MH = RuntimeHelper.downcallHandle(
        "UnmapViewOfFile",
        constants$201.UnmapViewOfFile$FUNC
    );
}


