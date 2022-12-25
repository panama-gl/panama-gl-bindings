// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$116 {

    static final FunctionDescriptor glRasterPos2d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRasterPos2d$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos2d",
        "(DD)V",
        constants$116.glRasterPos2d$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRasterPos2f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos2f",
        "(FF)V",
        constants$116.glRasterPos2f$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2i$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle glRasterPos2i$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos2i",
        "(II)V",
        constants$116.glRasterPos2i$FUNC, false
    );
    static final FunctionDescriptor glRasterPos2s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT,
        C_SHORT
    );
    static final MethodHandle glRasterPos2s$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos2s",
        "(SS)V",
        constants$116.glRasterPos2s$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glRasterPos3d$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos3d",
        "(DDD)V",
        constants$116.glRasterPos3d$FUNC, false
    );
    static final FunctionDescriptor glRasterPos3f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle glRasterPos3f$MH = RuntimeHelper.downcallHandle(
        glx_h.LIBRARIES, "glRasterPos3f",
        "(FFF)V",
        constants$116.glRasterPos3f$FUNC, false
    );
}


