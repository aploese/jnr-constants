// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 16:59:53 -0500
package jnr.constants.platform.fake;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG(0x1),
WUNTRACED(0x2),
WSTOPPED(0x4),
WEXITED(0x8),
WCONTINUED(0x10),
WNOWAIT(0x20);
private final long value;
private WaitFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 0x20L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
