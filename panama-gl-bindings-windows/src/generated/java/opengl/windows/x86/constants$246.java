// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$246 {

    static final FunctionDescriptor GetSecurityDescriptorOwner$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorOwner$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorOwner",
        constants$246.GetSecurityDescriptorOwner$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorRMControl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorRMControl$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorRMControl",
        constants$246.GetSecurityDescriptorRMControl$FUNC
    );
    static final FunctionDescriptor GetSecurityDescriptorSacl$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSecurityDescriptorSacl$MH = RuntimeHelper.downcallHandle(
        "GetSecurityDescriptorSacl",
        constants$246.GetSecurityDescriptorSacl$FUNC
    );
    static final FunctionDescriptor GetSidIdentifierAuthority$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSidIdentifierAuthority$MH = RuntimeHelper.downcallHandle(
        "GetSidIdentifierAuthority",
        constants$246.GetSidIdentifierAuthority$FUNC
    );
    static final FunctionDescriptor GetSidLengthRequired$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle GetSidLengthRequired$MH = RuntimeHelper.downcallHandle(
        "GetSidLengthRequired",
        constants$246.GetSidLengthRequired$FUNC
    );
    static final FunctionDescriptor GetSidSubAuthority$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetSidSubAuthority$MH = RuntimeHelper.downcallHandle(
        "GetSidSubAuthority",
        constants$246.GetSidSubAuthority$FUNC
    );
}


