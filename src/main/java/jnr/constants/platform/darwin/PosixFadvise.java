// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 11:35:38 -0500
package jnr.constants.platform.darwin;
public enum PosixFadvise implements jnr.constants.Constant {
;
// POSIX_FADV_NORMAL not defined
// POSIX_FADV_SEQUENTIAL not defined
// POSIX_FADV_RANDOM not defined
// POSIX_FADV_NOREUSE not defined
// POSIX_FADV_WILLNEED not defined
// POSIX_FADV_DONTNEED not defined
private final long value;
private PosixFadvise(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 0L;

public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
