// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$156 {

    static final FunctionDescriptor DecodeSystemPointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodeSystemPointer$MH = RuntimeHelper.downcallHandle(
        "DecodeSystemPointer",
        constants$156.DecodeSystemPointer$FUNC
    );
    static final FunctionDescriptor EncodeRemotePointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodeRemotePointer$MH = RuntimeHelper.downcallHandle(
        "EncodeRemotePointer",
        constants$156.EncodeRemotePointer$FUNC
    );
    static final FunctionDescriptor DecodeRemotePointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodeRemotePointer$MH = RuntimeHelper.downcallHandle(
        "DecodeRemotePointer",
        constants$156.DecodeRemotePointer$FUNC
    );
    static final FunctionDescriptor Beep$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Beep$MH = RuntimeHelper.downcallHandle(
        "Beep",
        constants$156.Beep$FUNC
    );
    static final FunctionDescriptor CloseHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseHandle$MH = RuntimeHelper.downcallHandle(
        "CloseHandle",
        constants$156.CloseHandle$FUNC
    );
    static final FunctionDescriptor DuplicateHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DuplicateHandle$MH = RuntimeHelper.downcallHandle(
        "DuplicateHandle",
        constants$156.DuplicateHandle$FUNC
    );
}


