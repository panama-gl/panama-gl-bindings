// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _IMAGE_DOS_HEADER {
 *     WORD e_magic;
 *     WORD e_cblp;
 *     WORD e_cp;
 *     WORD e_crlc;
 *     WORD e_cparhdr;
 *     WORD e_minalloc;
 *     WORD e_maxalloc;
 *     WORD e_ss;
 *     WORD e_sp;
 *     WORD e_csum;
 *     WORD e_ip;
 *     WORD e_cs;
 *     WORD e_lfarlc;
 *     WORD e_ovno;
 *     WORD e_res[4];
 *     WORD e_oemid;
 *     WORD e_oeminfo;
 *     WORD e_res2[10];
 *     LONG e_lfanew;
 * }
 * }
 */
public class _IMAGE_DOS_HEADER {

    _IMAGE_DOS_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgl_h.C_SHORT.withName("e_magic"),
        wgl_h.C_SHORT.withName("e_cblp"),
        wgl_h.C_SHORT.withName("e_cp"),
        wgl_h.C_SHORT.withName("e_crlc"),
        wgl_h.C_SHORT.withName("e_cparhdr"),
        wgl_h.C_SHORT.withName("e_minalloc"),
        wgl_h.C_SHORT.withName("e_maxalloc"),
        wgl_h.C_SHORT.withName("e_ss"),
        wgl_h.C_SHORT.withName("e_sp"),
        wgl_h.C_SHORT.withName("e_csum"),
        wgl_h.C_SHORT.withName("e_ip"),
        wgl_h.C_SHORT.withName("e_cs"),
        wgl_h.C_SHORT.withName("e_lfarlc"),
        wgl_h.C_SHORT.withName("e_ovno"),
        MemoryLayout.sequenceLayout(4, wgl_h.C_SHORT).withName("e_res"),
        wgl_h.C_SHORT.withName("e_oemid"),
        wgl_h.C_SHORT.withName("e_oeminfo"),
        MemoryLayout.sequenceLayout(10, wgl_h.C_SHORT).withName("e_res2"),
        wgl_h.align(wgl_h.C_LONG, 2).withName("e_lfanew")
    ).withName("_IMAGE_DOS_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort e_magic$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_magic
     * }
     */
    public static final OfShort e_magic$layout() {
        return e_magic$LAYOUT;
    }

    private static final long e_magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_magic
     * }
     */
    public static final long e_magic$offset() {
        return e_magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_magic
     * }
     */
    public static short e_magic(MemorySegment struct) {
        return struct.get(e_magic$LAYOUT, e_magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_magic
     * }
     */
    public static void e_magic(MemorySegment struct, short fieldValue) {
        struct.set(e_magic$LAYOUT, e_magic$OFFSET, fieldValue);
    }

    private static final OfShort e_cblp$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_cblp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_cblp
     * }
     */
    public static final OfShort e_cblp$layout() {
        return e_cblp$LAYOUT;
    }

    private static final long e_cblp$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_cblp
     * }
     */
    public static final long e_cblp$offset() {
        return e_cblp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_cblp
     * }
     */
    public static short e_cblp(MemorySegment struct) {
        return struct.get(e_cblp$LAYOUT, e_cblp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_cblp
     * }
     */
    public static void e_cblp(MemorySegment struct, short fieldValue) {
        struct.set(e_cblp$LAYOUT, e_cblp$OFFSET, fieldValue);
    }

    private static final OfShort e_cp$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_cp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_cp
     * }
     */
    public static final OfShort e_cp$layout() {
        return e_cp$LAYOUT;
    }

    private static final long e_cp$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_cp
     * }
     */
    public static final long e_cp$offset() {
        return e_cp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_cp
     * }
     */
    public static short e_cp(MemorySegment struct) {
        return struct.get(e_cp$LAYOUT, e_cp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_cp
     * }
     */
    public static void e_cp(MemorySegment struct, short fieldValue) {
        struct.set(e_cp$LAYOUT, e_cp$OFFSET, fieldValue);
    }

    private static final OfShort e_crlc$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_crlc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_crlc
     * }
     */
    public static final OfShort e_crlc$layout() {
        return e_crlc$LAYOUT;
    }

    private static final long e_crlc$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_crlc
     * }
     */
    public static final long e_crlc$offset() {
        return e_crlc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_crlc
     * }
     */
    public static short e_crlc(MemorySegment struct) {
        return struct.get(e_crlc$LAYOUT, e_crlc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_crlc
     * }
     */
    public static void e_crlc(MemorySegment struct, short fieldValue) {
        struct.set(e_crlc$LAYOUT, e_crlc$OFFSET, fieldValue);
    }

    private static final OfShort e_cparhdr$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_cparhdr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_cparhdr
     * }
     */
    public static final OfShort e_cparhdr$layout() {
        return e_cparhdr$LAYOUT;
    }

    private static final long e_cparhdr$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_cparhdr
     * }
     */
    public static final long e_cparhdr$offset() {
        return e_cparhdr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_cparhdr
     * }
     */
    public static short e_cparhdr(MemorySegment struct) {
        return struct.get(e_cparhdr$LAYOUT, e_cparhdr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_cparhdr
     * }
     */
    public static void e_cparhdr(MemorySegment struct, short fieldValue) {
        struct.set(e_cparhdr$LAYOUT, e_cparhdr$OFFSET, fieldValue);
    }

    private static final OfShort e_minalloc$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_minalloc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_minalloc
     * }
     */
    public static final OfShort e_minalloc$layout() {
        return e_minalloc$LAYOUT;
    }

    private static final long e_minalloc$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_minalloc
     * }
     */
    public static final long e_minalloc$offset() {
        return e_minalloc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_minalloc
     * }
     */
    public static short e_minalloc(MemorySegment struct) {
        return struct.get(e_minalloc$LAYOUT, e_minalloc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_minalloc
     * }
     */
    public static void e_minalloc(MemorySegment struct, short fieldValue) {
        struct.set(e_minalloc$LAYOUT, e_minalloc$OFFSET, fieldValue);
    }

    private static final OfShort e_maxalloc$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_maxalloc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_maxalloc
     * }
     */
    public static final OfShort e_maxalloc$layout() {
        return e_maxalloc$LAYOUT;
    }

    private static final long e_maxalloc$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_maxalloc
     * }
     */
    public static final long e_maxalloc$offset() {
        return e_maxalloc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_maxalloc
     * }
     */
    public static short e_maxalloc(MemorySegment struct) {
        return struct.get(e_maxalloc$LAYOUT, e_maxalloc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_maxalloc
     * }
     */
    public static void e_maxalloc(MemorySegment struct, short fieldValue) {
        struct.set(e_maxalloc$LAYOUT, e_maxalloc$OFFSET, fieldValue);
    }

    private static final OfShort e_ss$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_ss"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_ss
     * }
     */
    public static final OfShort e_ss$layout() {
        return e_ss$LAYOUT;
    }

    private static final long e_ss$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_ss
     * }
     */
    public static final long e_ss$offset() {
        return e_ss$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_ss
     * }
     */
    public static short e_ss(MemorySegment struct) {
        return struct.get(e_ss$LAYOUT, e_ss$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_ss
     * }
     */
    public static void e_ss(MemorySegment struct, short fieldValue) {
        struct.set(e_ss$LAYOUT, e_ss$OFFSET, fieldValue);
    }

    private static final OfShort e_sp$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_sp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_sp
     * }
     */
    public static final OfShort e_sp$layout() {
        return e_sp$LAYOUT;
    }

    private static final long e_sp$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_sp
     * }
     */
    public static final long e_sp$offset() {
        return e_sp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_sp
     * }
     */
    public static short e_sp(MemorySegment struct) {
        return struct.get(e_sp$LAYOUT, e_sp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_sp
     * }
     */
    public static void e_sp(MemorySegment struct, short fieldValue) {
        struct.set(e_sp$LAYOUT, e_sp$OFFSET, fieldValue);
    }

    private static final OfShort e_csum$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_csum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_csum
     * }
     */
    public static final OfShort e_csum$layout() {
        return e_csum$LAYOUT;
    }

    private static final long e_csum$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_csum
     * }
     */
    public static final long e_csum$offset() {
        return e_csum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_csum
     * }
     */
    public static short e_csum(MemorySegment struct) {
        return struct.get(e_csum$LAYOUT, e_csum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_csum
     * }
     */
    public static void e_csum(MemorySegment struct, short fieldValue) {
        struct.set(e_csum$LAYOUT, e_csum$OFFSET, fieldValue);
    }

    private static final OfShort e_ip$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_ip"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_ip
     * }
     */
    public static final OfShort e_ip$layout() {
        return e_ip$LAYOUT;
    }

    private static final long e_ip$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_ip
     * }
     */
    public static final long e_ip$offset() {
        return e_ip$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_ip
     * }
     */
    public static short e_ip(MemorySegment struct) {
        return struct.get(e_ip$LAYOUT, e_ip$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_ip
     * }
     */
    public static void e_ip(MemorySegment struct, short fieldValue) {
        struct.set(e_ip$LAYOUT, e_ip$OFFSET, fieldValue);
    }

    private static final OfShort e_cs$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_cs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_cs
     * }
     */
    public static final OfShort e_cs$layout() {
        return e_cs$LAYOUT;
    }

    private static final long e_cs$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_cs
     * }
     */
    public static final long e_cs$offset() {
        return e_cs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_cs
     * }
     */
    public static short e_cs(MemorySegment struct) {
        return struct.get(e_cs$LAYOUT, e_cs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_cs
     * }
     */
    public static void e_cs(MemorySegment struct, short fieldValue) {
        struct.set(e_cs$LAYOUT, e_cs$OFFSET, fieldValue);
    }

    private static final OfShort e_lfarlc$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_lfarlc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_lfarlc
     * }
     */
    public static final OfShort e_lfarlc$layout() {
        return e_lfarlc$LAYOUT;
    }

    private static final long e_lfarlc$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_lfarlc
     * }
     */
    public static final long e_lfarlc$offset() {
        return e_lfarlc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_lfarlc
     * }
     */
    public static short e_lfarlc(MemorySegment struct) {
        return struct.get(e_lfarlc$LAYOUT, e_lfarlc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_lfarlc
     * }
     */
    public static void e_lfarlc(MemorySegment struct, short fieldValue) {
        struct.set(e_lfarlc$LAYOUT, e_lfarlc$OFFSET, fieldValue);
    }

    private static final OfShort e_ovno$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_ovno"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_ovno
     * }
     */
    public static final OfShort e_ovno$layout() {
        return e_ovno$LAYOUT;
    }

    private static final long e_ovno$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_ovno
     * }
     */
    public static final long e_ovno$offset() {
        return e_ovno$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_ovno
     * }
     */
    public static short e_ovno(MemorySegment struct) {
        return struct.get(e_ovno$LAYOUT, e_ovno$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_ovno
     * }
     */
    public static void e_ovno(MemorySegment struct, short fieldValue) {
        struct.set(e_ovno$LAYOUT, e_ovno$OFFSET, fieldValue);
    }

    private static final SequenceLayout e_res$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("e_res"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static final SequenceLayout e_res$layout() {
        return e_res$LAYOUT;
    }

    private static final long e_res$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static final long e_res$offset() {
        return e_res$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static MemorySegment e_res(MemorySegment struct) {
        return struct.asSlice(e_res$OFFSET, e_res$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static void e_res(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, e_res$OFFSET, e_res$LAYOUT.byteSize());
    }

    private static long[] e_res$DIMS = { 4 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static long[] e_res$dimensions() {
        return e_res$DIMS;
    }
    private static final VarHandle e_res$ELEM_HANDLE = e_res$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static short e_res(MemorySegment struct, long index0) {
        return (short)e_res$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WORD e_res[4]
     * }
     */
    public static void e_res(MemorySegment struct, long index0, short fieldValue) {
        e_res$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort e_oemid$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_oemid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_oemid
     * }
     */
    public static final OfShort e_oemid$layout() {
        return e_oemid$LAYOUT;
    }

    private static final long e_oemid$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_oemid
     * }
     */
    public static final long e_oemid$offset() {
        return e_oemid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_oemid
     * }
     */
    public static short e_oemid(MemorySegment struct) {
        return struct.get(e_oemid$LAYOUT, e_oemid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_oemid
     * }
     */
    public static void e_oemid(MemorySegment struct, short fieldValue) {
        struct.set(e_oemid$LAYOUT, e_oemid$OFFSET, fieldValue);
    }

    private static final OfShort e_oeminfo$LAYOUT = (OfShort)$LAYOUT.select(groupElement("e_oeminfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_oeminfo
     * }
     */
    public static final OfShort e_oeminfo$layout() {
        return e_oeminfo$LAYOUT;
    }

    private static final long e_oeminfo$OFFSET = 38;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_oeminfo
     * }
     */
    public static final long e_oeminfo$offset() {
        return e_oeminfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_oeminfo
     * }
     */
    public static short e_oeminfo(MemorySegment struct) {
        return struct.get(e_oeminfo$LAYOUT, e_oeminfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_oeminfo
     * }
     */
    public static void e_oeminfo(MemorySegment struct, short fieldValue) {
        struct.set(e_oeminfo$LAYOUT, e_oeminfo$OFFSET, fieldValue);
    }

    private static final SequenceLayout e_res2$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("e_res2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static final SequenceLayout e_res2$layout() {
        return e_res2$LAYOUT;
    }

    private static final long e_res2$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static final long e_res2$offset() {
        return e_res2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static MemorySegment e_res2(MemorySegment struct) {
        return struct.asSlice(e_res2$OFFSET, e_res2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static void e_res2(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, e_res2$OFFSET, e_res2$LAYOUT.byteSize());
    }

    private static long[] e_res2$DIMS = { 10 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static long[] e_res2$dimensions() {
        return e_res2$DIMS;
    }
    private static final VarHandle e_res2$ELEM_HANDLE = e_res2$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static short e_res2(MemorySegment struct, long index0) {
        return (short)e_res2$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WORD e_res2[10]
     * }
     */
    public static void e_res2(MemorySegment struct, long index0, short fieldValue) {
        e_res2$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt e_lfanew$LAYOUT = (OfInt)$LAYOUT.select(groupElement("e_lfanew"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG e_lfanew
     * }
     */
    public static final OfInt e_lfanew$layout() {
        return e_lfanew$LAYOUT;
    }

    private static final long e_lfanew$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG e_lfanew
     * }
     */
    public static final long e_lfanew$offset() {
        return e_lfanew$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG e_lfanew
     * }
     */
    public static int e_lfanew(MemorySegment struct) {
        return struct.get(e_lfanew$LAYOUT, e_lfanew$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG e_lfanew
     * }
     */
    public static void e_lfanew(MemorySegment struct, int fieldValue) {
        struct.set(e_lfanew$LAYOUT, e_lfanew$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

