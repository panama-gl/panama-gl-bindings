// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$54 {

    static final FunctionDescriptor JNI_CreateJavaVM$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JNI_CreateJavaVM$MH = RuntimeHelper.downcallHandle(
        "JNI_CreateJavaVM",
        constants$54.JNI_CreateJavaVM$FUNC
    );
    static final FunctionDescriptor JNI_GetCreatedJavaVMs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JNI_GetCreatedJavaVMs$MH = RuntimeHelper.downcallHandle(
        "JNI_GetCreatedJavaVMs",
        constants$54.JNI_GetCreatedJavaVMs$FUNC
    );
    static final FunctionDescriptor JNI_OnLoad$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JNI_OnLoad$MH = RuntimeHelper.downcallHandle(
        "JNI_OnLoad",
        constants$54.JNI_OnLoad$FUNC
    );
    static final FunctionDescriptor JNI_OnUnload$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JNI_OnUnload$MH = RuntimeHelper.downcallHandle(
        "JNI_OnUnload",
        constants$54.JNI_OnUnload$FUNC
    );
    static final FunctionDescriptor JAWT_GetAWT$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JAWT_GetAWT$MH = RuntimeHelper.downcallHandle(
        "JAWT_GetAWT",
        constants$54.JAWT_GetAWT$FUNC
    );
    static final MemoryAddress NULL$ADDR = MemoryAddress.ofLong(0L);
}


