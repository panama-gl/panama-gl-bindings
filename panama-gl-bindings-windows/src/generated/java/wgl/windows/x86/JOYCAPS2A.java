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
 * typedef struct tagJOYCAPS2A {
 *     WORD wMid;
 *     WORD wPid;
 *     CHAR szPname[32];
 *     UINT wXmin;
 *     UINT wXmax;
 *     UINT wYmin;
 *     UINT wYmax;
 *     UINT wZmin;
 *     UINT wZmax;
 *     UINT wNumButtons;
 *     UINT wPeriodMin;
 *     UINT wPeriodMax;
 *     UINT wRmin;
 *     UINT wRmax;
 *     UINT wUmin;
 *     UINT wUmax;
 *     UINT wVmin;
 *     UINT wVmax;
 *     UINT wCaps;
 *     UINT wMaxAxes;
 *     UINT wNumAxes;
 *     UINT wMaxButtons;
 *     CHAR szRegKey[32];
 *     CHAR szOEMVxD[260];
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * } JOYCAPS2A
 * }
 */
public class JOYCAPS2A extends tagJOYCAPS2A {

    JOYCAPS2A() {
        // Should not be called directly
    }
}

