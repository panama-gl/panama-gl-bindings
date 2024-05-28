#include <windows.h>
#include <jni.h>
#include <jawt.h>
#include <jawt_md.h>

HMODULE _hAWT = 0;

JNIEXPORT jint JNICALL Java_win32_Win32_getWindowHandle
  (JNIEnv * env, jclass cls, jobject comp)
{
    HWND hWnd = 0;
    typedef jboolean (JNICALL *PJAWT_GETAWT)(JNIEnv*, JAWT*);
    JAWT awt;
    JAWT_DrawingSurface* ds;
    JAWT_DrawingSurfaceInfo* dsi;
    JAWT_Win32DrawingSurfaceInfo* dsi_win;
    jboolean result;
    jint lock;

    //Load AWT Library
    if(!_hAWT)
        //for Java 1.4
        _hAWT = LoadLibrary("jawt.dll");
    if(!_hAWT)
        //for Java 1.3
        _hAWT = LoadLibrary("awt.dll");
    if(_hAWT)
    {
    	//PJAWT_GETAWT JAWT_GetAWT = (PJAWT_GETAWT)GetProcAddress(_hAWT, "_JAWT_GetAWT@8");
        PJAWT_GETAWT JAWT_GetAWT = (PJAWT_GETAWT)GetProcAddress(_hAWT, "JAWT_GetAWT");
        if(JAWT_GetAWT)
        {
            awt.version = JAWT_VERSION_1_4; // Init here with JAWT_VERSION_1_3 or JAWT_VERSION_1_4
            //Get AWT API Interface
            result = JAWT_GetAWT(env, &awt);
            if(result != JNI_FALSE)
            {
                ds = awt.GetDrawingSurface(env, comp);
                if(ds != NULL)
                {
                    lock = ds->Lock(ds);
                    if((lock & JAWT_LOCK_ERROR) == 0)
                    {
                        dsi = ds->GetDrawingSurfaceInfo(ds);
                        if(dsi)
                        {
                            dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
                            if(dsi_win)
                            {
                                hWnd = dsi_win->hwnd;
                                //hWnd = dsi_win->hdc;
                            }
                            else {
                                hWnd = (HWND) -1;
                            }
                            ds->FreeDrawingSurfaceInfo(dsi);
                        }
                        else {
                            hWnd = (HWND) -2;
                        }
                        ds->Unlock(ds);
                    }
                    else {
                        hWnd = (HWND) -3;
                    }
                    awt.FreeDrawingSurface(ds);
                }
                else {
                    hWnd = (HWND) -4;
                }
            }
            else {
                hWnd = (HWND) -5;
            }
        }
        else {
            hWnd = (HWND) -6;
        }
    }
    else {
        hWnd = (HWND) -7;
    }
    return (jint)hWnd;

}
