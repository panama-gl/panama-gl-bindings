// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$66 {

    static final FunctionDescriptor WriteRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteRelease$MH = RuntimeHelper.downcallHandle(
        "WriteRelease",
        constants$66.WriteRelease$FUNC
    );
    static final FunctionDescriptor WriteNoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WriteNoFence$MH = RuntimeHelper.downcallHandle(
        "WriteNoFence",
        constants$66.WriteNoFence$FUNC
    );
    static final FunctionDescriptor ReadAcquire64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadAcquire64$MH = RuntimeHelper.downcallHandle(
        "ReadAcquire64",
        constants$66.ReadAcquire64$FUNC
    );
    static final FunctionDescriptor ReadNoFence64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadNoFence64$MH = RuntimeHelper.downcallHandle(
        "ReadNoFence64",
        constants$66.ReadNoFence64$FUNC
    );
    static final FunctionDescriptor WriteRelease64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteRelease64$MH = RuntimeHelper.downcallHandle(
        "WriteRelease64",
        constants$66.WriteRelease64$FUNC
    );
    static final FunctionDescriptor WriteNoFence64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteNoFence64$MH = RuntimeHelper.downcallHandle(
        "WriteNoFence64",
        constants$66.WriteNoFence64$FUNC
    );
}


