// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$643 {

    static final FunctionDescriptor PFNGLTEXSTORAGEMEM2DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLTEXSTORAGEMEM2DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIJ)V",
        constants$643.PFNGLTEXSTORAGEMEM2DEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_CHAR,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIBIJ)V",
        constants$643.PFNGLTEXSTORAGEMEM2DMULTISAMPLEEXTPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXSTORAGEMEM3DEXTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle PFNGLTEXSTORAGEMEM3DEXTPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIIIIIJ)V",
        constants$643.PFNGLTEXSTORAGEMEM3DEXTPROC$FUNC, false
    );
}

