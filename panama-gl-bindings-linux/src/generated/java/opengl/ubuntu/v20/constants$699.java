// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_FLOAT;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$699 {

    static final FunctionDescriptor PFNGLIMAGETRANSFORMPARAMETERIHPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle PFNGLIMAGETRANSFORMPARAMETERIHPPROC$MH = RuntimeHelper.downcallHandle(
        "(III)V",
        constants$699.PFNGLIMAGETRANSFORMPARAMETERIHPPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLIMAGETRANSFORMPARAMETERFHPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_FLOAT
    );
    static final MethodHandle PFNGLIMAGETRANSFORMPARAMETERFHPPROC$MH = RuntimeHelper.downcallHandle(
        "(IIF)V",
        constants$699.PFNGLIMAGETRANSFORMPARAMETERFHPPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLIMAGETRANSFORMPARAMETERIVHPPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLIMAGETRANSFORMPARAMETERIVHPPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$699.PFNGLIMAGETRANSFORMPARAMETERIVHPPROC$FUNC, false
    );
}


