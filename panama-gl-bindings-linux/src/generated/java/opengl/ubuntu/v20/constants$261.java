// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$261 {

    static final FunctionDescriptor PFNGLTEXSTORAGE2DMULTISAMPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLTEXSTORAGE2DMULTISAMPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIB)V",
        constants$261.PFNGLTEXSTORAGE2DMULTISAMPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXSTORAGE3DMULTISAMPLEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR
    );
    static final MethodHandle PFNGLTEXSTORAGE3DMULTISAMPLEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIB)V",
        constants$261.PFNGLTEXSTORAGE3DMULTISAMPLEPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXTUREVIEWPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXTUREVIEWPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIII)V",
        constants$261.PFNGLTEXTUREVIEWPROC$FUNC, false
    );
}


