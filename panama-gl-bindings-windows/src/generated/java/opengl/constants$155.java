// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$155 {

    static final FunctionDescriptor DebugActiveProcessStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DebugActiveProcessStop$MH = RuntimeHelper.downcallHandle(
        "DebugActiveProcessStop",
        constants$155.DebugActiveProcessStop$FUNC
    );
    static final FunctionDescriptor CheckRemoteDebuggerPresent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CheckRemoteDebuggerPresent$MH = RuntimeHelper.downcallHandle(
        "CheckRemoteDebuggerPresent",
        constants$155.CheckRemoteDebuggerPresent$FUNC
    );
    static final FunctionDescriptor WaitForDebugEventEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForDebugEventEx$MH = RuntimeHelper.downcallHandle(
        "WaitForDebugEventEx",
        constants$155.WaitForDebugEventEx$FUNC
    );
    static final FunctionDescriptor EncodePointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodePointer$MH = RuntimeHelper.downcallHandle(
        "EncodePointer",
        constants$155.EncodePointer$FUNC
    );
    static final FunctionDescriptor DecodePointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodePointer$MH = RuntimeHelper.downcallHandle(
        "DecodePointer",
        constants$155.DecodePointer$FUNC
    );
    static final FunctionDescriptor EncodeSystemPointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodeSystemPointer$MH = RuntimeHelper.downcallHandle(
        "EncodeSystemPointer",
        constants$155.EncodeSystemPointer$FUNC
    );
}


