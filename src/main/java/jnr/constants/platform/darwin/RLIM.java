// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:12 +1000
package jnr.constants.platform.darwin;
public enum RLIM implements jnr.constants.Constant {
RLIM_NLIMITS(0x9L),
RLIM_INFINITY(0x7fffffffffffffffL),
RLIM_SAVED_MAX(0x7fffffffffffffffL),
RLIM_SAVED_CUR(0x7fffffffffffffffL);
private final long value;
private RLIM(long value) { this.value = value; }
public static final long MIN_VALUE = 0x9L;
public static final long MAX_VALUE = 0x7fffffffffffffffL;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
