// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$190 {

    static final FunctionDescriptor PFNGLQUERYCOUNTERPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLQUERYCOUNTERPROC$MH = RuntimeHelper.downcallHandle(
        "(II)V",
        constants$190.PFNGLQUERYCOUNTERPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETQUERYOBJECTI64VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETQUERYOBJECTI64VPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$190.PFNGLGETQUERYOBJECTI64VPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETQUERYOBJECTUI64VPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETQUERYOBJECTUI64VPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$190.PFNGLGETQUERYOBJECTUI64VPROC$FUNC, false
    );
}


