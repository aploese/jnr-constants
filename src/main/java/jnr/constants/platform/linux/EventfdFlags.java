// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-11-29 09:39:59 +0100
package jnr.constants.platform.linux;
public enum EventfdFlags implements jnr.constants.Constant {
EFD_CLOEXEC(524288L),
EFD_NONBLOCK(2048L),
EFD_SEMAPHORE(1L);
private final long value;
private EventfdFlags(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 524288L;

static final class StringTable {
  public static final java.util.Map<EventfdFlags, String> descriptions = generateTable();
  public static final java.util.Map<EventfdFlags, String> generateTable() {
    java.util.Map<EventfdFlags, String> map = new java.util.EnumMap<EventfdFlags, String>(EventfdFlags.class);
  map.put(EFD_CLOEXEC, "EFD_CLOEXEC");
  map.put(EFD_NONBLOCK, "EFD_NONBLOCK");
  map.put(EFD_SEMAPHORE, "EFD_SEMAPHORE");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}