// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$445 {

    static final FunctionDescriptor PFNGLCREATEPROGRAMOBJECTARBPROC$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle PFNGLCREATEPROGRAMOBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "()I",
        constants$445.PFNGLCREATEPROGRAMOBJECTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLATTACHOBJECTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLATTACHOBJECTARBPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$445.PFNGLATTACHOBJECTARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLLINKPROGRAMARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle PFNGLLINKPROGRAMARBPROC$MH = RuntimeHelper.downcallHandle(
        "(I)V",
        constants$445.PFNGLLINKPROGRAMARBPROC$FUNC, false
    );
}

