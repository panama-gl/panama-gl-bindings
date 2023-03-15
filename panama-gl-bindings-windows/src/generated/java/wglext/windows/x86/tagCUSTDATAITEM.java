// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCUSTDATAITEM {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("guid"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("vt"),
                    Constants$root.C_SHORT$LAYOUT.withName("wReserved1"),
                    Constants$root.C_SHORT$LAYOUT.withName("wReserved2"),
                    Constants$root.C_SHORT$LAYOUT.withName("wReserved3"),
                    MemoryLayout.unionLayout(
                        Constants$root.C_LONG_LONG$LAYOUT.withName("llVal"),
                        Constants$root.C_LONG$LAYOUT.withName("lVal"),
                        Constants$root.C_CHAR$LAYOUT.withName("bVal"),
                        Constants$root.C_SHORT$LAYOUT.withName("iVal"),
                        Constants$root.C_FLOAT$LAYOUT.withName("fltVal"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("dblVal"),
                        Constants$root.C_SHORT$LAYOUT.withName("boolVal"),
                        Constants$root.C_SHORT$LAYOUT.withName("__OBSOLETE__VARIANT_BOOL"),
                        Constants$root.C_LONG$LAYOUT.withName("scode"),
                        MemoryLayout.unionLayout(
                            MemoryLayout.structLayout(
                                Constants$root.C_LONG$LAYOUT.withName("Lo"),
                                Constants$root.C_LONG$LAYOUT.withName("Hi")
                            ).withName("$anon$0"),
                            Constants$root.C_LONG_LONG$LAYOUT.withName("int64")
                        ).withName("cyVal"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("date"),
                        Constants$root.C_POINTER$LAYOUT.withName("bstrVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("punkVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pdispVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("parray"),
                        Constants$root.C_POINTER$LAYOUT.withName("pbVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("piVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("plVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pllVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pfltVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pdblVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pboolVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("__OBSOLETE__VARIANT_PBOOL"),
                        Constants$root.C_POINTER$LAYOUT.withName("pscode"),
                        Constants$root.C_POINTER$LAYOUT.withName("pcyVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pdate"),
                        Constants$root.C_POINTER$LAYOUT.withName("pbstrVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("ppunkVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("ppdispVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pparray"),
                        Constants$root.C_POINTER$LAYOUT.withName("pvarVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("byref"),
                        Constants$root.C_CHAR$LAYOUT.withName("cVal"),
                        Constants$root.C_SHORT$LAYOUT.withName("uiVal"),
                        Constants$root.C_LONG$LAYOUT.withName("ulVal"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("ullVal"),
                        Constants$root.C_LONG$LAYOUT.withName("intVal"),
                        Constants$root.C_LONG$LAYOUT.withName("uintVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pdecVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pcVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("puiVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pulVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pullVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("pintVal"),
                        Constants$root.C_POINTER$LAYOUT.withName("puintVal"),
                        MemoryLayout.structLayout(
                            Constants$root.C_POINTER$LAYOUT.withName("pvRecord"),
                            Constants$root.C_POINTER$LAYOUT.withName("pRecInfo")
                        ).withName("$anon$0")
                    ).withName("$anon$0")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("wReserved"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_CHAR$LAYOUT.withName("scale"),
                            Constants$root.C_CHAR$LAYOUT.withName("sign")
                        ).withName("$anon$0"),
                        Constants$root.C_SHORT$LAYOUT.withName("signscale")
                    ).withName("$anon$0"),
                    Constants$root.C_LONG$LAYOUT.withName("Hi32"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            Constants$root.C_LONG$LAYOUT.withName("Lo32"),
                            Constants$root.C_LONG$LAYOUT.withName("Mid32")
                        ).withName("$anon$0"),
                        Constants$root.C_LONG_LONG$LAYOUT.withName("Lo64")
                    ).withName("$anon$1")
                ).withName("decVal")
            ).withName("$anon$0")
        ).withName("varValue")
    ).withName("tagCUSTDATAITEM");
    public static MemoryLayout $LAYOUT() {
        return tagCUSTDATAITEM.$struct$LAYOUT;
    }
    public static MemorySegment guid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment varValue$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


