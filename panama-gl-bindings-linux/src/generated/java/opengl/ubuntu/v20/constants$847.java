// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$847 {

    static final FunctionDescriptor PFNGLINDEXFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLINDEXFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$847.PFNGLINDEXFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLTEXCOORDFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLTEXCOORDFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$847.PFNGLTEXCOORDFORMATNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLEDGEFLAGFORMATNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLEDGEFLAGFORMATNVPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$847.PFNGLEDGEFLAGFORMATNVPROC$FUNC, false
    );
}


