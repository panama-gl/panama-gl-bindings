// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$72 {

    static final FunctionDescriptor ReadULong64NoFence$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULong64NoFence$MH = RuntimeHelper.downcallHandle(
        "ReadULong64NoFence",
        constants$72.ReadULong64NoFence$FUNC
    );
    static final FunctionDescriptor ReadULong64Raw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadULong64Raw$MH = RuntimeHelper.downcallHandle(
        "ReadULong64Raw",
        constants$72.ReadULong64Raw$FUNC
    );
    static final FunctionDescriptor WriteULong64Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteULong64Release$MH = RuntimeHelper.downcallHandle(
        "WriteULong64Release",
        constants$72.WriteULong64Release$FUNC
    );
    static final FunctionDescriptor WriteULong64NoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteULong64NoFence$MH = RuntimeHelper.downcallHandle(
        "WriteULong64NoFence",
        constants$72.WriteULong64NoFence$FUNC
    );
    static final FunctionDescriptor WriteULong64Raw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteULong64Raw$MH = RuntimeHelper.downcallHandle(
        "WriteULong64Raw",
        constants$72.WriteULong64Raw$FUNC
    );
    static final FunctionDescriptor ReadPointerAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadPointerAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadPointerAcquire",
        constants$72.ReadPointerAcquire$FUNC
    );
}

