// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1184 {

    static final  GroupLayout IID_StdOle$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_StdOle$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_StdOle", constants$1184.IID_StdOle$LAYOUT);
    static final FunctionDescriptor SysAllocString$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysAllocString$MH = RuntimeHelper.downcallHandle(
        "SysAllocString",
        constants$1184.SysAllocString$FUNC
    );
    static final FunctionDescriptor SysReAllocString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysReAllocString$MH = RuntimeHelper.downcallHandle(
        "SysReAllocString",
        constants$1184.SysReAllocString$FUNC
    );
    static final FunctionDescriptor SysAllocStringLen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SysAllocStringLen$MH = RuntimeHelper.downcallHandle(
        "SysAllocStringLen",
        constants$1184.SysAllocStringLen$FUNC
    );
    static final FunctionDescriptor SysReAllocStringLen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SysReAllocStringLen$MH = RuntimeHelper.downcallHandle(
        "SysReAllocStringLen",
        constants$1184.SysReAllocStringLen$FUNC
    );
    static final FunctionDescriptor SysAddRefString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SysAddRefString$MH = RuntimeHelper.downcallHandle(
        "SysAddRefString",
        constants$1184.SysAddRefString$FUNC
    );
}

