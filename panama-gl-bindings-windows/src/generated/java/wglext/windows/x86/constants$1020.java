// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1020 {

    static final FunctionDescriptor ILockBytes_RemoteReadAt_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ILockBytes_RemoteReadAt_Proxy$MH = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteReadAt_Proxy",
        constants$1020.ILockBytes_RemoteReadAt_Proxy$FUNC
    );
    static final FunctionDescriptor ILockBytes_RemoteReadAt_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ILockBytes_RemoteReadAt_Stub$MH = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteReadAt_Stub",
        constants$1020.ILockBytes_RemoteReadAt_Stub$FUNC
    );
    static final FunctionDescriptor ILockBytes_RemoteWriteAt_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ILockBytes_RemoteWriteAt_Proxy$MH = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteWriteAt_Proxy",
        constants$1020.ILockBytes_RemoteWriteAt_Proxy$FUNC
    );
    static final FunctionDescriptor ILockBytes_RemoteWriteAt_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ILockBytes_RemoteWriteAt_Stub$MH = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteWriteAt_Stub",
        constants$1020.ILockBytes_RemoteWriteAt_Stub$FUNC
    );
    static final  GroupLayout IID_IEnumFORMATETC$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumFORMATETC$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumFORMATETC", constants$1020.IID_IEnumFORMATETC$LAYOUT);
    static final FunctionDescriptor IEnumFORMATETC_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumFORMATETC_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumFORMATETC_RemoteNext_Proxy",
        constants$1020.IEnumFORMATETC_RemoteNext_Proxy$FUNC
    );
}


