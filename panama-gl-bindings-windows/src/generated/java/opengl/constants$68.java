// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$68 {

    static final FunctionDescriptor ReadRaw64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadRaw64$MH = RuntimeHelper.downcallHandle(
        "ReadRaw64",
        constants$68.ReadRaw64$FUNC
    );
    static final FunctionDescriptor WriteRaw64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WriteRaw64$MH = RuntimeHelper.downcallHandle(
        "WriteRaw64",
        constants$68.WriteRaw64$FUNC
    );
    static final FunctionDescriptor ReadUCharAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadUCharAcquire",
        constants$68.ReadUCharAcquire$FUNC
    );
    static final FunctionDescriptor ReadUCharNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUCharNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadUCharNoFence",
        constants$68.ReadUCharNoFence$FUNC
    );
    static final FunctionDescriptor ReadBooleanAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadBooleanAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadBooleanAcquire",
        constants$68.ReadBooleanAcquire$FUNC
    );
    static final FunctionDescriptor ReadBooleanNoFence$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadBooleanNoFence$MH = RuntimeHelper.downcallHandle(
        "ReadBooleanNoFence",
        constants$68.ReadBooleanNoFence$FUNC
    );
}


