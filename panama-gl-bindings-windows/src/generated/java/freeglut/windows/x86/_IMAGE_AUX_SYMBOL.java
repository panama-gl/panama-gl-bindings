// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_AUX_SYMBOL {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("TagIndex"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("Linenumber"),
                    Constants$root.C_SHORT$LAYOUT.withName("Size")
                ).withName("LnSz"),
                Constants$root.C_LONG$LAYOUT.withName("TotalSize")
            ).withName("Misc"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("PointerToLinenumber"),
                    Constants$root.C_LONG$LAYOUT.withName("PointerToNextFunction")
                ).withName("Function"),
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("Dimension")
                ).withName("Array")
            ).withName("FcnAry"),
            Constants$root.C_SHORT$LAYOUT.withName("TvIndex")
        ).withName("Sym"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(18, Constants$root.C_CHAR$LAYOUT).withName("Name")
        ).withName("File"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Length"),
            Constants$root.C_SHORT$LAYOUT.withName("NumberOfRelocations"),
            Constants$root.C_SHORT$LAYOUT.withName("NumberOfLinenumbers"),
            Constants$root.C_LONG$LAYOUT.withName("CheckSum"),
            Constants$root.C_SHORT$LAYOUT.withName("Number"),
            Constants$root.C_CHAR$LAYOUT.withName("Selection"),
            Constants$root.C_CHAR$LAYOUT.withName("bReserved"),
            Constants$root.C_SHORT$LAYOUT.withName("HighNumber")
        ).withName("Section"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("bAuxType"),
            Constants$root.C_CHAR$LAYOUT.withName("bReserved"),
            Constants$root.C_LONG$LAYOUT.withName("SymbolTableIndex"),
            MemoryLayout.sequenceLayout(12, Constants$root.C_CHAR$LAYOUT).withName("rgbReserved")
        ).withName("TokenDef"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("crc"),
            MemoryLayout.sequenceLayout(14, Constants$root.C_CHAR$LAYOUT).withName("rgbReserved")
        ).withName("CRC")
    ).withName("_IMAGE_AUX_SYMBOL");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_AUX_SYMBOL.$union$LAYOUT;
    }
    public static class Sym {

        static final  GroupLayout Sym$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("TagIndex"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("Linenumber"),
                    Constants$root.C_SHORT$LAYOUT.withName("Size")
                ).withName("LnSz"),
                Constants$root.C_LONG$LAYOUT.withName("TotalSize")
            ).withName("Misc"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("PointerToLinenumber"),
                    Constants$root.C_LONG$LAYOUT.withName("PointerToNextFunction")
                ).withName("Function"),
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("Dimension")
                ).withName("Array")
            ).withName("FcnAry"),
            Constants$root.C_SHORT$LAYOUT.withName("TvIndex")
        );
        public static MemoryLayout $LAYOUT() {
            return Sym.Sym$struct$LAYOUT;
        }
        static final VarHandle TagIndex$VH = Sym$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TagIndex"));
        public static VarHandle TagIndex$VH() {
            return Sym.TagIndex$VH;
        }
        public static int TagIndex$get(MemorySegment seg) {
            return (int)Sym.TagIndex$VH.get(seg);
        }
        public static void TagIndex$set( MemorySegment seg, int x) {
            Sym.TagIndex$VH.set(seg, x);
        }
        public static int TagIndex$get(MemorySegment seg, long index) {
            return (int)Sym.TagIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void TagIndex$set(MemorySegment seg, long index, int x) {
            Sym.TagIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static class Misc {

            static final  GroupLayout Sym$Misc$union$LAYOUT = MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("Linenumber"),
                    Constants$root.C_SHORT$LAYOUT.withName("Size")
                ).withName("LnSz"),
                Constants$root.C_LONG$LAYOUT.withName("TotalSize")
            );
            public static MemoryLayout $LAYOUT() {
                return Misc.Sym$Misc$union$LAYOUT;
            }
            public static class LnSz {

                static final  GroupLayout Sym$Misc$LnSz$struct$LAYOUT = MemoryLayout.structLayout(
                    Constants$root.C_SHORT$LAYOUT.withName("Linenumber"),
                    Constants$root.C_SHORT$LAYOUT.withName("Size")
                );
                public static MemoryLayout $LAYOUT() {
                    return LnSz.Sym$Misc$LnSz$struct$LAYOUT;
                }
                static final VarHandle Linenumber$VH = Sym$Misc$LnSz$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Linenumber"));
                public static VarHandle Linenumber$VH() {
                    return LnSz.Linenumber$VH;
                }
                public static short Linenumber$get(MemorySegment seg) {
                    return (short)LnSz.Linenumber$VH.get(seg);
                }
                public static void Linenumber$set( MemorySegment seg, short x) {
                    LnSz.Linenumber$VH.set(seg, x);
                }
                public static short Linenumber$get(MemorySegment seg, long index) {
                    return (short)LnSz.Linenumber$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void Linenumber$set(MemorySegment seg, long index, short x) {
                    LnSz.Linenumber$VH.set(seg.asSlice(index*sizeof()), x);
                }
                static final VarHandle Size$VH = Sym$Misc$LnSz$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
                public static VarHandle Size$VH() {
                    return LnSz.Size$VH;
                }
                public static short Size$get(MemorySegment seg) {
                    return (short)LnSz.Size$VH.get(seg);
                }
                public static void Size$set( MemorySegment seg, short x) {
                    LnSz.Size$VH.set(seg, x);
                }
                public static short Size$get(MemorySegment seg, long index) {
                    return (short)LnSz.Size$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void Size$set(MemorySegment seg, long index, short x) {
                    LnSz.Size$VH.set(seg.asSlice(index*sizeof()), x);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
            }

            public static MemorySegment LnSz$slice(MemorySegment seg) {
                return seg.asSlice(0, 4);
            }
            static final VarHandle TotalSize$VH = Sym$Misc$union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalSize"));
            public static VarHandle TotalSize$VH() {
                return Misc.TotalSize$VH;
            }
            public static int TotalSize$get(MemorySegment seg) {
                return (int)Misc.TotalSize$VH.get(seg);
            }
            public static void TotalSize$set( MemorySegment seg, int x) {
                Misc.TotalSize$VH.set(seg, x);
            }
            public static int TotalSize$get(MemorySegment seg, long index) {
                return (int)Misc.TotalSize$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void TotalSize$set(MemorySegment seg, long index, int x) {
                Misc.TotalSize$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment Misc$slice(MemorySegment seg) {
            return seg.asSlice(4, 4);
        }
        public static class FcnAry {

            static final  GroupLayout Sym$FcnAry$union$LAYOUT = MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("PointerToLinenumber"),
                    Constants$root.C_LONG$LAYOUT.withName("PointerToNextFunction")
                ).withName("Function"),
                MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("Dimension")
                ).withName("Array")
            );
            public static MemoryLayout $LAYOUT() {
                return FcnAry.Sym$FcnAry$union$LAYOUT;
            }
            public static class Function {

                static final  GroupLayout Sym$FcnAry$Function$struct$LAYOUT = MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("PointerToLinenumber"),
                    Constants$root.C_LONG$LAYOUT.withName("PointerToNextFunction")
                );
                public static MemoryLayout $LAYOUT() {
                    return Function.Sym$FcnAry$Function$struct$LAYOUT;
                }
                static final VarHandle PointerToLinenumber$VH = Sym$FcnAry$Function$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToLinenumber"));
                public static VarHandle PointerToLinenumber$VH() {
                    return Function.PointerToLinenumber$VH;
                }
                public static int PointerToLinenumber$get(MemorySegment seg) {
                    return (int)Function.PointerToLinenumber$VH.get(seg);
                }
                public static void PointerToLinenumber$set( MemorySegment seg, int x) {
                    Function.PointerToLinenumber$VH.set(seg, x);
                }
                public static int PointerToLinenumber$get(MemorySegment seg, long index) {
                    return (int)Function.PointerToLinenumber$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void PointerToLinenumber$set(MemorySegment seg, long index, int x) {
                    Function.PointerToLinenumber$VH.set(seg.asSlice(index*sizeof()), x);
                }
                static final VarHandle PointerToNextFunction$VH = Sym$FcnAry$Function$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToNextFunction"));
                public static VarHandle PointerToNextFunction$VH() {
                    return Function.PointerToNextFunction$VH;
                }
                public static int PointerToNextFunction$get(MemorySegment seg) {
                    return (int)Function.PointerToNextFunction$VH.get(seg);
                }
                public static void PointerToNextFunction$set( MemorySegment seg, int x) {
                    Function.PointerToNextFunction$VH.set(seg, x);
                }
                public static int PointerToNextFunction$get(MemorySegment seg, long index) {
                    return (int)Function.PointerToNextFunction$VH.get(seg.asSlice(index*sizeof()));
                }
                public static void PointerToNextFunction$set(MemorySegment seg, long index, int x) {
                    Function.PointerToNextFunction$VH.set(seg.asSlice(index*sizeof()), x);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
            }

            public static MemorySegment Function$slice(MemorySegment seg) {
                return seg.asSlice(0, 8);
            }
            public static class Array {

                static final  GroupLayout Sym$FcnAry$Array$struct$LAYOUT = MemoryLayout.structLayout(
                    MemoryLayout.sequenceLayout(4, Constants$root.C_SHORT$LAYOUT).withName("Dimension")
                );
                public static MemoryLayout $LAYOUT() {
                    return Array.Sym$FcnAry$Array$struct$LAYOUT;
                }
                public static MemorySegment Dimension$slice(MemorySegment seg) {
                    return seg.asSlice(0, 8);
                }
                public static long sizeof() { return $LAYOUT().byteSize(); }
                public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
                public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                    return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
                }
                public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
            }

            public static MemorySegment Array$slice(MemorySegment seg) {
                return seg.asSlice(0, 8);
            }
            public static long sizeof() { return $LAYOUT().byteSize(); }
            public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
            public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
                return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
            }
            public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
        }

        public static MemorySegment FcnAry$slice(MemorySegment seg) {
            return seg.asSlice(8, 8);
        }
        static final VarHandle TvIndex$VH = Sym$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TvIndex"));
        public static VarHandle TvIndex$VH() {
            return Sym.TvIndex$VH;
        }
        public static short TvIndex$get(MemorySegment seg) {
            return (short)Sym.TvIndex$VH.get(seg);
        }
        public static void TvIndex$set( MemorySegment seg, short x) {
            Sym.TvIndex$VH.set(seg, x);
        }
        public static short TvIndex$get(MemorySegment seg, long index) {
            return (short)Sym.TvIndex$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void TvIndex$set(MemorySegment seg, long index, short x) {
            Sym.TvIndex$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Sym$slice(MemorySegment seg) {
        return seg.asSlice(0, 18);
    }
    public static class File {

        static final  GroupLayout File$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(18, Constants$root.C_CHAR$LAYOUT).withName("Name")
        );
        public static MemoryLayout $LAYOUT() {
            return File.File$struct$LAYOUT;
        }
        public static MemorySegment Name$slice(MemorySegment seg) {
            return seg.asSlice(0, 18);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment File$slice(MemorySegment seg) {
        return seg.asSlice(0, 18);
    }
    public static class Section {

        static final  GroupLayout Section$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Length"),
            Constants$root.C_SHORT$LAYOUT.withName("NumberOfRelocations"),
            Constants$root.C_SHORT$LAYOUT.withName("NumberOfLinenumbers"),
            Constants$root.C_LONG$LAYOUT.withName("CheckSum"),
            Constants$root.C_SHORT$LAYOUT.withName("Number"),
            Constants$root.C_CHAR$LAYOUT.withName("Selection"),
            Constants$root.C_CHAR$LAYOUT.withName("bReserved"),
            Constants$root.C_SHORT$LAYOUT.withName("HighNumber")
        );
        public static MemoryLayout $LAYOUT() {
            return Section.Section$struct$LAYOUT;
        }
        static final VarHandle Length$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
        public static VarHandle Length$VH() {
            return Section.Length$VH;
        }
        public static int Length$get(MemorySegment seg) {
            return (int)Section.Length$VH.get(seg);
        }
        public static void Length$set( MemorySegment seg, int x) {
            Section.Length$VH.set(seg, x);
        }
        public static int Length$get(MemorySegment seg, long index) {
            return (int)Section.Length$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Length$set(MemorySegment seg, long index, int x) {
            Section.Length$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle NumberOfRelocations$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRelocations"));
        public static VarHandle NumberOfRelocations$VH() {
            return Section.NumberOfRelocations$VH;
        }
        public static short NumberOfRelocations$get(MemorySegment seg) {
            return (short)Section.NumberOfRelocations$VH.get(seg);
        }
        public static void NumberOfRelocations$set( MemorySegment seg, short x) {
            Section.NumberOfRelocations$VH.set(seg, x);
        }
        public static short NumberOfRelocations$get(MemorySegment seg, long index) {
            return (short)Section.NumberOfRelocations$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void NumberOfRelocations$set(MemorySegment seg, long index, short x) {
            Section.NumberOfRelocations$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle NumberOfLinenumbers$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfLinenumbers"));
        public static VarHandle NumberOfLinenumbers$VH() {
            return Section.NumberOfLinenumbers$VH;
        }
        public static short NumberOfLinenumbers$get(MemorySegment seg) {
            return (short)Section.NumberOfLinenumbers$VH.get(seg);
        }
        public static void NumberOfLinenumbers$set( MemorySegment seg, short x) {
            Section.NumberOfLinenumbers$VH.set(seg, x);
        }
        public static short NumberOfLinenumbers$get(MemorySegment seg, long index) {
            return (short)Section.NumberOfLinenumbers$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void NumberOfLinenumbers$set(MemorySegment seg, long index, short x) {
            Section.NumberOfLinenumbers$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle CheckSum$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
        public static VarHandle CheckSum$VH() {
            return Section.CheckSum$VH;
        }
        public static int CheckSum$get(MemorySegment seg) {
            return (int)Section.CheckSum$VH.get(seg);
        }
        public static void CheckSum$set( MemorySegment seg, int x) {
            Section.CheckSum$VH.set(seg, x);
        }
        public static int CheckSum$get(MemorySegment seg, long index) {
            return (int)Section.CheckSum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void CheckSum$set(MemorySegment seg, long index, int x) {
            Section.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Number$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Number"));
        public static VarHandle Number$VH() {
            return Section.Number$VH;
        }
        public static short Number$get(MemorySegment seg) {
            return (short)Section.Number$VH.get(seg);
        }
        public static void Number$set( MemorySegment seg, short x) {
            Section.Number$VH.set(seg, x);
        }
        public static short Number$get(MemorySegment seg, long index) {
            return (short)Section.Number$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Number$set(MemorySegment seg, long index, short x) {
            Section.Number$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle Selection$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Selection"));
        public static VarHandle Selection$VH() {
            return Section.Selection$VH;
        }
        public static byte Selection$get(MemorySegment seg) {
            return (byte)Section.Selection$VH.get(seg);
        }
        public static void Selection$set( MemorySegment seg, byte x) {
            Section.Selection$VH.set(seg, x);
        }
        public static byte Selection$get(MemorySegment seg, long index) {
            return (byte)Section.Selection$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Selection$set(MemorySegment seg, long index, byte x) {
            Section.Selection$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle bReserved$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bReserved"));
        public static VarHandle bReserved$VH() {
            return Section.bReserved$VH;
        }
        public static byte bReserved$get(MemorySegment seg) {
            return (byte)Section.bReserved$VH.get(seg);
        }
        public static void bReserved$set( MemorySegment seg, byte x) {
            Section.bReserved$VH.set(seg, x);
        }
        public static byte bReserved$get(MemorySegment seg, long index) {
            return (byte)Section.bReserved$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void bReserved$set(MemorySegment seg, long index, byte x) {
            Section.bReserved$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle HighNumber$VH = Section$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighNumber"));
        public static VarHandle HighNumber$VH() {
            return Section.HighNumber$VH;
        }
        public static short HighNumber$get(MemorySegment seg) {
            return (short)Section.HighNumber$VH.get(seg);
        }
        public static void HighNumber$set( MemorySegment seg, short x) {
            Section.HighNumber$VH.set(seg, x);
        }
        public static short HighNumber$get(MemorySegment seg, long index) {
            return (short)Section.HighNumber$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void HighNumber$set(MemorySegment seg, long index, short x) {
            Section.HighNumber$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Section$slice(MemorySegment seg) {
        return seg.asSlice(0, 18);
    }
    public static MemorySegment TokenDef$slice(MemorySegment seg) {
        return seg.asSlice(0, 18);
    }
    public static class CRC {

        static final  GroupLayout CRC$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("crc"),
            MemoryLayout.sequenceLayout(14, Constants$root.C_CHAR$LAYOUT).withName("rgbReserved")
        );
        public static MemoryLayout $LAYOUT() {
            return CRC.CRC$struct$LAYOUT;
        }
        static final VarHandle crc$VH = CRC$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crc"));
        public static VarHandle crc$VH() {
            return CRC.crc$VH;
        }
        public static int crc$get(MemorySegment seg) {
            return (int)CRC.crc$VH.get(seg);
        }
        public static void crc$set( MemorySegment seg, int x) {
            CRC.crc$VH.set(seg, x);
        }
        public static int crc$get(MemorySegment seg, long index) {
            return (int)CRC.crc$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void crc$set(MemorySegment seg, long index, int x) {
            CRC.crc$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment rgbReserved$slice(MemorySegment seg) {
            return seg.asSlice(4, 14);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment CRC$slice(MemorySegment seg) {
        return seg.asSlice(0, 18);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


