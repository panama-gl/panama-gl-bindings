// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$245 {

    static final FunctionDescriptor GetLengthSid$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLengthSid$MH = RuntimeHelper.downcallHandle(
        "GetLengthSid",
        constants$245.GetLengthSid$FUNC
    );
    static final FunctionDescriptor GetPrivateObjectSecurity$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPrivateObjectSecurity$MH = RuntimeHelper.downcallHandle(
        "GetPrivateObjectSecurity",
        constants$245.GetPrivateObjectSecurity$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorControl$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorControl",
        constants$245.GetSecurityDescriptorControl$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorDacl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorDacl$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorDacl",
        constants$245.GetSecurityDescriptorDacl$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorGroup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorGroup$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorGroup",
        constants$245.GetSecurityDescriptorGroup$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorLength$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorLength$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorLength",
        constants$245.GetSecurityDescriptorLength$FUNC
    );
}


