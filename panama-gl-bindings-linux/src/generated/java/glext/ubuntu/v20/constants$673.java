// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$673 {

    static final FunctionDescriptor PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$673.PFNGLFLUSHMAPPEDBUFFERRANGEAPPLEPROC$FUNC
    );
    static final FunctionDescriptor glBufferParameteriAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBufferParameteriAPPLE$MH = RuntimeHelper.downcallHandle(
        "glBufferParameteriAPPLE",
        constants$673.glBufferParameteriAPPLE$FUNC
    );
    static final FunctionDescriptor glFlushMappedBufferRangeAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glFlushMappedBufferRangeAPPLE$MH = RuntimeHelper.downcallHandle(
        "glFlushMappedBufferRangeAPPLE",
        constants$673.glFlushMappedBufferRangeAPPLE$FUNC
    );
    static final FunctionDescriptor PFNGLOBJECTPURGEABLEAPPLEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLOBJECTPURGEABLEAPPLEPROC$MH = RuntimeHelper.downcallHandle(
        constants$673.PFNGLOBJECTPURGEABLEAPPLEPROC$FUNC
    );
    static final FunctionDescriptor PFNGLOBJECTUNPURGEABLEAPPLEPROC$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
}

