// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$864 {

    static final FunctionDescriptor Ndr64DcomAsyncClientCall$FUNC = FunctionDescriptor.of(MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Pointer"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Simple")
    ).withName("_CLIENT_CALL_RETURN"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Ndr64DcomAsyncClientCall$MH = RuntimeHelper.downcallHandleVariadic(
        "Ndr64DcomAsyncClientCall",
        constants$864.Ndr64DcomAsyncClientCall$FUNC
    );
    static final FunctionDescriptor Ndr64AsyncServerCall$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Ndr64AsyncServerCall$MH = RuntimeHelper.downcallHandle(
        "Ndr64AsyncServerCall",
        constants$864.Ndr64AsyncServerCall$FUNC
    );
    static final FunctionDescriptor Ndr64AsyncServerCall64$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Ndr64AsyncServerCall64$MH = RuntimeHelper.downcallHandle(
        "Ndr64AsyncServerCall64",
        constants$864.Ndr64AsyncServerCall64$FUNC
    );
    static final FunctionDescriptor Ndr64AsyncServerCallAll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Ndr64AsyncServerCallAll$MH = RuntimeHelper.downcallHandle(
        "Ndr64AsyncServerCallAll",
        constants$864.Ndr64AsyncServerCallAll$FUNC
    );
    static final FunctionDescriptor Ndr64AsyncStubCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Ndr64AsyncStubCall$MH = RuntimeHelper.downcallHandle(
        "Ndr64AsyncStubCall",
        constants$864.Ndr64AsyncStubCall$FUNC
    );
    static final FunctionDescriptor Ndr64DcomAsyncStubCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Ndr64DcomAsyncStubCall$MH = RuntimeHelper.downcallHandle(
        "Ndr64DcomAsyncStubCall",
        constants$864.Ndr64DcomAsyncStubCall$FUNC
    );
}

