// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 20:14:49 -0500
package jnr.constants.platform.fake;
public enum Access implements jnr.constants.Constant {
F_OK(0x0),
X_OK(0x1),
W_OK(0x2),
R_OK(0x4);
private final long value;
private Access(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 0x4L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
