// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$732 {

    static final FunctionDescriptor PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLCOPYCOLORSUBTABLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$732.PFNGLCOPYCOLORSUBTABLEEXTPROC$FUNC
    );
    static final FunctionDescriptor glColorSubTableEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glColorSubTableEXT$MH = RuntimeHelper.downcallHandle(
        "glColorSubTableEXT",
        constants$732.glColorSubTableEXT$FUNC
    );
    static final FunctionDescriptor glCopyColorSubTableEXT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glCopyColorSubTableEXT$MH = RuntimeHelper.downcallHandle(
        "glCopyColorSubTableEXT",
        constants$732.glCopyColorSubTableEXT$FUNC
    );
    static final FunctionDescriptor PFNGLLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLLOCKARRAYSEXTPROC$MH = RuntimeHelper.downcallHandle(
        constants$732.PFNGLLOCKARRAYSEXTPROC$FUNC
    );
    static final FunctionDescriptor PFNGLUNLOCKARRAYSEXTPROC$FUNC = FunctionDescriptor.ofVoid();
}


