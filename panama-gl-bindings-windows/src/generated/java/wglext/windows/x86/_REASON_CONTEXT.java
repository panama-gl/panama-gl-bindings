// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _REASON_CONTEXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("LocalizedReasonModule"),
                Constants$root.C_LONG$LAYOUT.withName("LocalizedReasonId"),
                Constants$root.C_LONG$LAYOUT.withName("ReasonStringCount"),
                Constants$root.C_POINTER$LAYOUT.withName("ReasonStrings")
            ).withName("Detailed"),
            Constants$root.C_POINTER$LAYOUT.withName("SimpleReasonString")
        ).withName("Reason")
    ).withName("_REASON_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return _REASON_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _REASON_CONTEXT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_REASON_CONTEXT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _REASON_CONTEXT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_REASON_CONTEXT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _REASON_CONTEXT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _REASON_CONTEXT.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_REASON_CONTEXT.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _REASON_CONTEXT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_REASON_CONTEXT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _REASON_CONTEXT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Reason {

        static final  GroupLayout Reason$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("LocalizedReasonModule"),
                Constants$root.C_LONG$LAYOUT.withName("LocalizedReasonId"),
                Constants$root.C_LONG$LAYOUT.withName("ReasonStringCount"),
                Constants$root.C_POINTER$LAYOUT.withName("ReasonStrings")
            ).withName("Detailed"),
            Constants$root.C_POINTER$LAYOUT.withName("SimpleReasonString")
        );
        public static MemoryLayout $LAYOUT() {
            return Reason.Reason$union$LAYOUT;
        }
        public static class Detailed {

            static final  GroupLayout Reason$Detailed$struct$LAYOUT = MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("LocalizedReasonModule"),
                Constants$root.C_LONG$LAYOUT.withName("LocalizedReasonId"),
                Constants$root.C_LONG$LAYOUT.withName("ReasonStringCount"),
                Constants$root.C_POINTER$LAYOUT.withName("ReasonStrings")
            );
            public static MemoryLayout $LAYOUT() {
                return Detailed.Reason$Detailed$struct$LAYOUT;
            }
            static final VarHandle LocalizedReasonModule$VH = Reason$Detailed$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LocalizedReasonModule"));
            public static VarHandle LocalizedReasonModule$VH() {
                return Detailed.LocalizedReasonModule$VH;
            }
            public static MemoryAddress LocalizedReasonModule$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Detailed.LocalizedReasonModule$VH.get(seg);
            }
            public static void LocalizedReasonModule$set( MemorySegment seg, MemoryAddress x) {
                Detailed.LocalizedReasonModule$VH.set(seg, x);
            }
            public static MemoryAddress LocalizedReasonModule$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Detailed.LocalizedReasonModule$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void LocalizedReasonModule$set(MemorySegment seg, long index, MemoryAddress x) {
                Detailed.LocalizedReasonModule$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle LocalizedReasonId$VH = Reason$Detailed$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LocalizedReasonId"));
            public static VarHandle LocalizedReasonId$VH() {
                return Detailed.LocalizedReasonId$VH;
            }
            public static int LocalizedReasonId$get(MemorySegment seg) {
                return (int)Detailed.LocalizedReasonId$VH.get(seg);
            }
            public static void LocalizedReasonId$set( MemorySegment seg, int x) {
                Detailed.LocalizedReasonId$VH.set(seg, x);
            }
            public static int LocalizedReasonId$get(MemorySegment seg, long index) {
                return (int)Detailed.LocalizedReasonId$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void LocalizedReasonId$set(MemorySegment seg, long index, int x) {
                Detailed.LocalizedReasonId$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ReasonStringCount$VH = Reason$Detailed$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReasonStringCount"));
            public static VarHandle ReasonStringCount$VH() {
                return Detailed.ReasonStringCount$VH;
            }
            public static int ReasonStringCount$get(MemorySegment seg) {
                return (int)Detailed.ReasonStringCount$VH.get(seg);
            }
            public static void ReasonStringCount$set( MemorySegment seg, int x) {
                Detailed.ReasonStringCount$VH.set(seg, x);
            }
            public static int ReasonStringCount$get(MemorySegment seg, long index) {
                return (int)Detailed.ReasonStringCount$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ReasonStringCount$set(MemorySegment seg, long index, int x) {
                Detailed.ReasonStringCount$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle ReasonStrings$VH = Reason$Detailed$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReasonStrings"));
            public static VarHandle ReasonStrings$VH() {
                return Detailed.ReasonStrings$VH;
            }
            public static MemoryAddress ReasonStrings$get(MemorySegment seg) {
                return (java.lang.foreign.MemoryAddress)Detailed.ReasonStrings$VH.get(seg);
            }
            public static void ReasonStrings$set( MemorySegment seg, MemoryAddress x) {
                Detailed.ReasonStrings$VH.set(seg, x);
            }
            public static MemoryAddress ReasonStrings$get(MemorySegment seg, long index) {
                return (java.lang.foreign.MemoryAddress)Detailed.ReasonStrings$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void ReasonStrings$set(MemorySegment seg, long index, MemoryAddress x) {
                Detailed.ReasonStrings$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Detailed$slice(MemorySegment seg) {
            return seg.asSlice(0, 24);
        }
        static final VarHandle SimpleReasonString$VH = Reason$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SimpleReasonString"));
        public static VarHandle SimpleReasonString$VH() {
            return Reason.SimpleReasonString$VH;
        }
        public static MemoryAddress SimpleReasonString$get(MemorySegment seg) {
            return (java.lang.foreign.MemoryAddress)Reason.SimpleReasonString$VH.get(seg);
        }
        public static void SimpleReasonString$set( MemorySegment seg, MemoryAddress x) {
            Reason.SimpleReasonString$VH.set(seg, x);
        }
        public static MemoryAddress SimpleReasonString$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemoryAddress)Reason.SimpleReasonString$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void SimpleReasonString$set(MemorySegment seg, long index, MemoryAddress x) {
            Reason.SimpleReasonString$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Reason$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


