// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$674 {

    static final FunctionDescriptor PFNGLOBJECTUNPURGEABLEAPPLEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLOBJECTUNPURGEABLEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$674.PFNGLOBJECTUNPURGEABLEAPPLEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLGETOBJECTPARAMETERIVAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFNGLGETOBJECTPARAMETERIVAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$674.PFNGLGETOBJECTPARAMETERIVAPPLEPROC$FUNC
    );
    static final FunctionDescriptor glObjectPurgeableAPPLE$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glObjectPurgeableAPPLE$MH = RuntimeHelper.downcallHandle(
        "glObjectPurgeableAPPLE",
        constants$674.glObjectPurgeableAPPLE$FUNC
    );
    static final FunctionDescriptor glObjectUnpurgeableAPPLE$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glObjectUnpurgeableAPPLE$MH = RuntimeHelper.downcallHandle(
        "glObjectUnpurgeableAPPLE",
        constants$674.glObjectUnpurgeableAPPLE$FUNC
    );
    static final FunctionDescriptor glGetObjectParameterivAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glGetObjectParameterivAPPLE$MH = RuntimeHelper.downcallHandle(
        "glGetObjectParameterivAPPLE",
        constants$674.glGetObjectParameterivAPPLE$FUNC
    );
}


