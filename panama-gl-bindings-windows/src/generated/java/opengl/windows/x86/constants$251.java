// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$251 {

    static final FunctionDescriptor RevertToSelf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RevertToSelf$MH = RuntimeHelper.downcallHandle(
        "RevertToSelf",
        constants$251.RevertToSelf$FUNC
    );
    static final FunctionDescriptor SetAclInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetAclInformation$MH = RuntimeHelper.downcallHandle(
        "SetAclInformation",
        constants$251.SetAclInformation$FUNC
    );
    static final FunctionDescriptor SetFileSecurityW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileSecurityW$MH = RuntimeHelper.downcallHandle(
        "SetFileSecurityW",
        constants$251.SetFileSecurityW$FUNC
    );
    static final FunctionDescriptor SetKernelObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKernelObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetKernelObjectSecurity",
        constants$251.SetKernelObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetPrivateObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPrivateObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "SetPrivateObjectSecurity",
        constants$251.SetPrivateObjectSecurity$FUNC
    );
    static final FunctionDescriptor SetPrivateObjectSecurityEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPrivateObjectSecurityEx$MH = RuntimeHelper.downcallHandle(
        "SetPrivateObjectSecurityEx",
        constants$251.SetPrivateObjectSecurityEx$FUNC
    );
}


