// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$442 {

    static final FunctionDescriptor PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$442.PFNGLNAMEDFRAMEBUFFERSAMPLELOCATIONSFVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLEVALUATEDEPTHVALUESARBPROC$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle PFNGLEVALUATEDEPTHVALUESARBPROC$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$442.PFNGLEVALUATEDEPTHVALUESARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLMINSAMPLESHADINGARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle PFNGLMINSAMPLESHADINGARBPROC$MH = RuntimeHelper.downcallHandle(
        "(F)V",
        constants$442.PFNGLMINSAMPLESHADINGARBPROC$FUNC, false
    );
}

