// Generated by jextract

package opengl.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$61 {

    static final FunctionDescriptor glFinishObjectAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glFinishObjectAPPLE$MH = RuntimeHelper.downcallHandle(
        "glFinishObjectAPPLE",
        constants$61.glFinishObjectAPPLE$FUNC
    );
    static final FunctionDescriptor glBufferParameteriAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glBufferParameteriAPPLE$MH = RuntimeHelper.downcallHandle(
        "glBufferParameteriAPPLE",
        constants$61.glBufferParameteriAPPLE$FUNC
    );
    static final FunctionDescriptor glFlushMappedBufferRangeAPPLE$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle glFlushMappedBufferRangeAPPLE$MH = RuntimeHelper.downcallHandle(
        "glFlushMappedBufferRangeAPPLE",
        constants$61.glFlushMappedBufferRangeAPPLE$FUNC
    );
    static final FunctionDescriptor glFlushRenderAPPLE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glFlushRenderAPPLE$MH = RuntimeHelper.downcallHandle(
        "glFlushRenderAPPLE",
        constants$61.glFlushRenderAPPLE$FUNC
    );
    static final FunctionDescriptor glFinishRenderAPPLE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glFinishRenderAPPLE$MH = RuntimeHelper.downcallHandle(
        "glFinishRenderAPPLE",
        constants$61.glFinishRenderAPPLE$FUNC
    );
    static final FunctionDescriptor glSwapAPPLE$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle glSwapAPPLE$MH = RuntimeHelper.downcallHandle(
        "glSwapAPPLE",
        constants$61.glSwapAPPLE$FUNC
    );
}


