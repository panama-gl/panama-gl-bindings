// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$891 {

    static final FunctionDescriptor PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$891.PFNGLRENDERBUFFERSTORAGEMULTISAMPLEEXTPROC$FUNC
    );
    static final FunctionDescriptor glRenderbufferStorageMultisampleEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glRenderbufferStorageMultisampleEXT$MH = RuntimeHelper.downcallHandle(
        "glRenderbufferStorageMultisampleEXT",
        constants$891.glRenderbufferStorageMultisampleEXT$FUNC
    );
    static final FunctionDescriptor PFNGLISRENDERBUFFEREXTPROC$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLISRENDERBUFFEREXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$891.PFNGLISRENDERBUFFEREXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLBINDRENDERBUFFEREXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}

