// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$346 {

    static final FunctionDescriptor PFNGLTEXBUFFERRANGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle PFNGLTEXBUFFERRANGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIJJ)V",
        constants$346.PFNGLTEXBUFFERRANGEPROC$FUNC, false
    );
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
        constants$346.PFNGLTEXSTORAGE2DMULTISAMPLEPROC$FUNC, false
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
        constants$346.PFNGLTEXSTORAGE3DMULTISAMPLEPROC$FUNC, false
    );
}

