// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$354 {

    static final FunctionDescriptor PFNGLGETNPIXELMAPUSVARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNPIXELMAPUSVARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$354.PFNGLGETNPIXELMAPUSVARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNPOLYGONSTIPPLEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNPOLYGONSTIPPLEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$354.PFNGLGETNPOLYGONSTIPPLEARBPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLGETNCOLORTABLEARBPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETNCOLORTABLEARBPROC$MH = RuntimeHelper.downcallHandle(
        "(IIIILjdk/incubator/foreign/MemoryAddress;)V",
        constants$354.PFNGLGETNCOLORTABLEARBPROC$FUNC, false
    );
}


