package org.acra.log;

import android.util.Log;

public final class AndroidLogDelegate implements ACRALog {
    /* renamed from: v */
    public int mo12258v(String tag, String msg) {
        return Log.v(tag, msg);
    }

    /* renamed from: v */
    public int mo12259v(String tag, String msg, Throwable tr) {
        return Log.v(tag, msg, tr);
    }

    /* renamed from: d */
    public int mo12251d(String tag, String msg) {
        return Log.d(tag, msg);
    }

    /* renamed from: d */
    public int mo12252d(String tag, String msg, Throwable tr) {
        return Log.d(tag, msg, tr);
    }

    /* renamed from: i */
    public int mo12256i(String tag, String msg) {
        return Log.i(tag, msg);
    }

    /* renamed from: i */
    public int mo12257i(String tag, String msg, Throwable tr) {
        return Log.i(tag, msg, tr);
    }

    /* renamed from: w */
    public int mo12260w(String tag, String msg) {
        return Log.w(tag, msg);
    }

    /* renamed from: w */
    public int mo12261w(String tag, String msg, Throwable tr) {
        return Log.w(tag, msg, tr);
    }

    /* renamed from: w */
    public int mo12262w(String tag, Throwable tr) {
        return Log.w(tag, tr);
    }

    /* renamed from: e */
    public int mo12253e(String tag, String msg) {
        return Log.e(tag, msg);
    }

    /* renamed from: e */
    public int mo12254e(String tag, String msg, Throwable tr) {
        return Log.e(tag, msg, tr);
    }

    public String getStackTraceString(Throwable tr) {
        return Log.getStackTraceString(tr);
    }
}
