// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$69 {

    static final FunctionDescriptor WriteUCharRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteUCharRelease$MH = RuntimeHelper.downcallHandle(
        "WriteUCharRelease",
        constants$69.WriteUCharRelease$FUNC
    );
    static final FunctionDescriptor WriteUCharNoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteUCharNoFence$MH = RuntimeHelper.downcallHandle(
        "WriteUCharNoFence",
        constants$69.WriteUCharNoFence$FUNC
    );
    static final FunctionDescriptor WriteBooleanRelease$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteBooleanRelease$MH = RuntimeHelper.downcallHandle(
        "WriteBooleanRelease",
        constants$69.WriteBooleanRelease$FUNC
    );
    static final FunctionDescriptor WriteBooleanNoFence$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteBooleanNoFence$MH = RuntimeHelper.downcallHandle(
        "WriteBooleanNoFence",
        constants$69.WriteBooleanNoFence$FUNC
    );
    static final FunctionDescriptor WriteUCharRaw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle WriteUCharRaw$MH = RuntimeHelper.downcallHandle(
        "WriteUCharRaw",
        constants$69.WriteUCharRaw$FUNC
    );
    static final FunctionDescriptor ReadUShortAcquire$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadUShortAcquire$MH = RuntimeHelper.downcallHandle(
        "ReadUShortAcquire",
        constants$69.ReadUShortAcquire$FUNC
    );
}


