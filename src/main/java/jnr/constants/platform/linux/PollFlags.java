// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-11-29 09:39:59 +0100
package jnr.constants.platform.linux;
public enum PollFlags implements jnr.constants.Constant {
POLLERR(8L),
POLLHUP(16L),
POLLIN(1L),
POLLNVAL(32L),
POLLOUT(4L),
POLLPRI(2L),
POLLRDBAND(128L),
POLLRDNORM(64L),
POLLWRBAND(512L),
POLLWRNORM(256L);
private final long value;
private PollFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 512L;

static final class StringTable {
  public static final java.util.Map<PollFlags, String> descriptions = generateTable();
  public static final java.util.Map<PollFlags, String> generateTable() {
    java.util.Map<PollFlags, String> map = new java.util.EnumMap<PollFlags, String>(PollFlags.class);
  map.put(POLLERR, "POLLERR");
  map.put(POLLHUP, "POLLHUP");
  map.put(POLLIN, "POLLIN");
  map.put(POLLNVAL, "POLLNVAL");
  map.put(POLLOUT, "POLLOUT");
  map.put(POLLPRI, "POLLPRI");
  map.put(POLLRDBAND, "POLLRDBAND");
  map.put(POLLRDNORM, "POLLRDNORM");
  map.put(POLLWRBAND, "POLLWRBAND");
  map.put(POLLWRNORM, "POLLWRNORM");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}