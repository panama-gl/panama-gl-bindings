// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1037 {

    static final  GroupLayout IID_IThumbnailExtractor$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IThumbnailExtractor$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IThumbnailExtractor", constants$1037.IID_IThumbnailExtractor$LAYOUT);
    static final  GroupLayout IID_IDummyHICONIncluder$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IDummyHICONIncluder$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IDummyHICONIncluder", constants$1037.IID_IDummyHICONIncluder$LAYOUT);
    static final  OfAddress __MIDL_itf_objidl_0000_0087_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0087_v0_0_c_ifspec$VH = constants$1037.__MIDL_itf_objidl_0000_0087_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0087_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0087_v0_0_c_ifspec", constants$1037.__MIDL_itf_objidl_0000_0087_v0_0_c_ifspec$LAYOUT);
    static final  OfAddress __MIDL_itf_objidl_0000_0087_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0087_v0_0_s_ifspec$VH = constants$1037.__MIDL_itf_objidl_0000_0087_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0087_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0087_v0_0_s_ifspec", constants$1037.__MIDL_itf_objidl_0000_0087_v0_0_s_ifspec$LAYOUT);
    static final  GroupLayout IID_IProcessLock$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IProcessLock$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IProcessLock", constants$1037.IID_IProcessLock$LAYOUT);
    static final  GroupLayout IID_ISurrogateService$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISurrogateService$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISurrogateService", constants$1037.IID_ISurrogateService$LAYOUT);
}


