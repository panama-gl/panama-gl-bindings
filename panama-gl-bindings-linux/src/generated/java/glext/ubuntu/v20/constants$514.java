// Generated by jextract

package glext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$514 {

    static final FunctionDescriptor glNamedBufferPageCommitmentARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glNamedBufferPageCommitmentARB$MH = RuntimeHelper.downcallHandle(
        "glNamedBufferPageCommitmentARB",
        constants$514.glNamedBufferPageCommitmentARB$FUNC
    );
    static final FunctionDescriptor PFNGLTEXPAGECOMMITMENTARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle PFNGLTEXPAGECOMMITMENTARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$514.PFNGLTEXPAGECOMMITMENTARBPROC$FUNC
    );
    static final FunctionDescriptor glTexPageCommitmentARB$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle glTexPageCommitmentARB$MH = RuntimeHelper.downcallHandle(
        "glTexPageCommitmentARB",
        constants$514.glTexPageCommitmentARB$FUNC
    );
    static final FunctionDescriptor PFNGLTEXBUFFERARBPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle PFNGLTEXBUFFERARBPROC$MH = RuntimeHelper.downcallHandle(
        constants$514.PFNGLTEXBUFFERARBPROC$FUNC
    );
}

