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
 * typedef struct _devicemodeW {
 *     WCHAR dmDeviceName[32];
 *     WORD dmSpecVersion;
 *     WORD dmDriverVersion;
 *     WORD dmSize;
 *     WORD dmDriverExtra;
 *     DWORD dmFields;
 *     union {
 *         struct {
 *             short dmOrientation;
 *             short dmPaperSize;
 *             short dmPaperLength;
 *             short dmPaperWidth;
 *             short dmScale;
 *             short dmCopies;
 *             short dmDefaultSource;
 *             short dmPrintQuality;
 *         };
 *         struct {
 *             POINTL dmPosition;
 *             DWORD dmDisplayOrientation;
 *             DWORD dmDisplayFixedOutput;
 *         };
 *     };
 *     short dmColor;
 *     short dmDuplex;
 *     short dmYResolution;
 *     short dmTTOption;
 *     short dmCollate;
 *     WCHAR dmFormName[32];
 *     WORD dmLogPixels;
 *     DWORD dmBitsPerPel;
 *     DWORD dmPelsWidth;
 *     DWORD dmPelsHeight;
 *     union {
 *         DWORD dmDisplayFlags;
 *         DWORD dmNup;
 *     };
 *     DWORD dmDisplayFrequency;
 *     DWORD dmICMMethod;
 *     DWORD dmICMIntent;
 *     DWORD dmMediaType;
 *     DWORD dmDitherType;
 *     DWORD dmReserved1;
 *     DWORD dmReserved2;
 *     DWORD dmPanningWidth;
 *     DWORD dmPanningHeight;
 * } DEVMODEW
 * }
 */
public class DEVMODEW extends _devicemodeW {

    DEVMODEW() {
        // Should not be called directly
    }
}

