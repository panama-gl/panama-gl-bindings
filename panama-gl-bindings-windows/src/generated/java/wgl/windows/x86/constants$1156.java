// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1156 {

    static final  OfAddress __MIDL_itf_urlmon_0000_0024_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0024_v0_0_s_ifspec$VH = constants$1156.__MIDL_itf_urlmon_0000_0024_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0024_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0024_v0_0_s_ifspec", constants$1156.__MIDL_itf_urlmon_0000_0024_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IBindHost$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IBindHost$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IBindHost", constants$1156.IID_IBindHost$LAYOUT);
    static final FunctionDescriptor IBindHost_RemoteMonikerBindToStorage_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IBindHost_RemoteMonikerBindToStorage_Proxy$MH = RuntimeHelper.downcallHandle(
        "IBindHost_RemoteMonikerBindToStorage_Proxy",
        constants$1156.IBindHost_RemoteMonikerBindToStorage_Proxy$FUNC
    );
    static final FunctionDescriptor IBindHost_RemoteMonikerBindToStorage_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IBindHost_RemoteMonikerBindToStorage_Stub$MH = RuntimeHelper.downcallHandle(
        "IBindHost_RemoteMonikerBindToStorage_Stub",
        constants$1156.IBindHost_RemoteMonikerBindToStorage_Stub$FUNC
    );
    static final FunctionDescriptor IBindHost_RemoteMonikerBindToObject_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IBindHost_RemoteMonikerBindToObject_Proxy$MH = RuntimeHelper.downcallHandle(
        "IBindHost_RemoteMonikerBindToObject_Proxy",
        constants$1156.IBindHost_RemoteMonikerBindToObject_Proxy$FUNC
    );
    static final FunctionDescriptor IBindHost_RemoteMonikerBindToObject_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IBindHost_RemoteMonikerBindToObject_Stub$MH = RuntimeHelper.downcallHandle(
        "IBindHost_RemoteMonikerBindToObject_Stub",
        constants$1156.IBindHost_RemoteMonikerBindToObject_Stub$FUNC
    );
}

