// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1316 {

    static final FunctionDescriptor PFNGLGETCOLORTABLEPARAMETERFVSGIPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETCOLORTABLEPARAMETERFVSGIPROC$MH = RuntimeHelper.downcallHandle(
        constants$1316.PFNGLGETCOLORTABLEPARAMETERFVSGIPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETCOLORTABLEPARAMETERIVSGIPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETCOLORTABLEPARAMETERIVSGIPROC$MH = RuntimeHelper.downcallHandle(
        constants$1316.PFNGLGETCOLORTABLEPARAMETERIVSGIPROC$FUNC
    );
    static final FunctionDescriptor glColorTableSGI$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glColorTableSGI$MH = RuntimeHelper.downcallHandle(
        "glColorTableSGI",
        constants$1316.glColorTableSGI$FUNC
    );
    static final FunctionDescriptor glColorTableParameterfvSGI$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glColorTableParameterfvSGI$MH = RuntimeHelper.downcallHandle(
        "glColorTableParameterfvSGI",
        constants$1316.glColorTableParameterfvSGI$FUNC
    );
}


