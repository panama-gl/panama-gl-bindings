// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$337 {

    static final FunctionDescriptor CreateSymbolicLinkTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateSymbolicLinkTransactedW$MH = RuntimeHelper.downcallHandle(
        "CreateSymbolicLinkTransactedW",
        constants$337.CreateSymbolicLinkTransactedW$FUNC
    );
    static final FunctionDescriptor ReplacePartitionUnit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ReplacePartitionUnit$MH = RuntimeHelper.downcallHandle(
        "ReplacePartitionUnit",
        constants$337.ReplacePartitionUnit$FUNC
    );
    static final FunctionDescriptor AddSecureMemoryCacheCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddSecureMemoryCacheCallback$MH = RuntimeHelper.downcallHandle(
        "AddSecureMemoryCacheCallback",
        constants$337.AddSecureMemoryCacheCallback$FUNC
    );
    static final FunctionDescriptor RemoveSecureMemoryCacheCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RemoveSecureMemoryCacheCallback$MH = RuntimeHelper.downcallHandle(
        "RemoveSecureMemoryCacheCallback",
        constants$337.RemoveSecureMemoryCacheCallback$FUNC
    );
    static final FunctionDescriptor CopyContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyContext$MH = RuntimeHelper.downcallHandle(
        "CopyContext",
        constants$337.CopyContext$FUNC
    );
    static final FunctionDescriptor InitializeContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeContext$MH = RuntimeHelper.downcallHandle(
        "InitializeContext",
        constants$337.InitializeContext$FUNC
    );
}


