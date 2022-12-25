// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$107 {

    static final FunctionDescriptor glColor4f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glColor4f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColor4f",
        "(FFFF)V",
        constants$107.glColor4f$FUNC, false
    );
    static final FunctionDescriptor glColor4i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glColor4i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColor4i",
        "(IIII)V",
        constants$107.glColor4i$FUNC, false
    );
    static final FunctionDescriptor glColor4s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glColor4s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColor4s",
        "(SSSS)V",
        constants$107.glColor4s$FUNC, false
    );
    static final FunctionDescriptor glColor4ub$FUNC = FunctionDescriptor.ofVoid(
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glColor4ub$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColor4ub",
        "(BBBB)V",
        constants$107.glColor4ub$FUNC, false
    );
    static final FunctionDescriptor glColor4ui$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle glColor4ui$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColor4ui",
        "(IIII)V",
        constants$107.glColor4ui$FUNC, false
    );
    static final FunctionDescriptor glColor4us$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT,
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glColor4us$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glColor4us",
        "(SSSS)V",
        constants$107.glColor4us$FUNC, false
    );
}


