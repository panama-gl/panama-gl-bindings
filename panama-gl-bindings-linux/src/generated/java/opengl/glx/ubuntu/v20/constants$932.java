// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$932 {

    static final FunctionDescriptor PFNGLCOLORFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLCOLORFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$932.PFNGLCOLORFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLINDEXFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLINDEXFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$932.PFNGLINDEXFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXCOORDFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXCOORDFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$932.PFNGLTEXCOORDFORMATNVPROC$FUNC, false
    );
}

