// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1302 {

    static final FunctionDescriptor glDeleteLists$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glDeleteLists$MH = RuntimeHelper.downcallHandle(
        "glDeleteLists",
        constants$1302.glDeleteLists$FUNC
    );
    static final FunctionDescriptor glDeleteTextures$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glDeleteTextures$MH = RuntimeHelper.downcallHandle(
        "glDeleteTextures",
        constants$1302.glDeleteTextures$FUNC
    );
    static final FunctionDescriptor glDepthFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glDepthFunc$MH = RuntimeHelper.downcallHandle(
        "glDepthFunc",
        constants$1302.glDepthFunc$FUNC
    );
    static final FunctionDescriptor glDepthMask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glDepthMask$MH = RuntimeHelper.downcallHandle(
        "glDepthMask",
        constants$1302.glDepthMask$FUNC
    );
    static final FunctionDescriptor glDepthRange$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle glDepthRange$MH = RuntimeHelper.downcallHandle(
        "glDepthRange",
        constants$1302.glDepthRange$FUNC
    );
    static final FunctionDescriptor glDisable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle glDisable$MH = RuntimeHelper.downcallHandle(
        "glDisable",
        constants$1302.glDisable$FUNC
    );
}

