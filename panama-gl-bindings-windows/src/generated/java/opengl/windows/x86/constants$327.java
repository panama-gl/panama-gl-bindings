// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$327 {

    static final FunctionDescriptor SetThreadpoolCallbackLibrary$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolCallbackLibrary$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolCallbackLibrary",
        constants$327.SetThreadpoolCallbackLibrary$FUNC
    );
    static final FunctionDescriptor SetThreadpoolCallbackPriority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolCallbackPriority$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolCallbackPriority",
        constants$327.SetThreadpoolCallbackPriority$FUNC
    );
    static final FunctionDescriptor DestroyThreadpoolEnvironment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyThreadpoolEnvironment$MH = RuntimeHelper.downcallHandle(
        "DestroyThreadpoolEnvironment",
        constants$327.DestroyThreadpoolEnvironment$FUNC
    );
    static final FunctionDescriptor SetThreadpoolCallbackPersistent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolCallbackPersistent$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolCallbackPersistent",
        constants$327.SetThreadpoolCallbackPersistent$FUNC
    );
    static final FunctionDescriptor CreatePrivateNamespaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePrivateNamespaceA$MH = RuntimeHelper.downcallHandle(
        "CreatePrivateNamespaceA",
        constants$327.CreatePrivateNamespaceA$FUNC
    );
    static final FunctionDescriptor OpenPrivateNamespaceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrivateNamespaceA$MH = RuntimeHelper.downcallHandle(
        "OpenPrivateNamespaceA",
        constants$327.OpenPrivateNamespaceA$FUNC
    );
}


