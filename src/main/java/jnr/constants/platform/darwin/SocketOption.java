// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-20 11:35:39 -0500
package jnr.constants.platform.darwin;
public enum SocketOption implements jnr.constants.Constant {
SO_DEBUG(0x1L),
SO_ACCEPTCONN(0x2L),
SO_REUSEADDR(0x4L),
SO_KEEPALIVE(0x8L),
SO_DONTROUTE(0x10L),
SO_BROADCAST(0x20L),
SO_USELOOPBACK(0x40L),
SO_LINGER(0x80L),
SO_OOBINLINE(0x100L),
SO_REUSEPORT(0x200L),
SO_TIMESTAMP(0x400L),
// SO_ACCEPTFILTER not defined
SO_DONTTRUNC(0x2000L),
SO_WANTMORE(0x4000L),
SO_WANTOOBFLAG(0x8000L),
SO_SNDBUF(0x1001L),
SO_RCVBUF(0x1002L),
SO_SNDLOWAT(0x1003L),
SO_RCVLOWAT(0x1004L),
SO_SNDTIMEO(0x1005L),
SO_RCVTIMEO(0x1006L),
SO_ERROR(0x1007L),
SO_TYPE(0x1008L),
SO_NREAD(0x1020L),
SO_NKE(0x1021L),
SO_NOSIGPIPE(0x1022L),
SO_NOADDRERR(0x1023L),
SO_NWRITE(0x1024L),
SO_REUSESHAREUID(0x1025L),
SO_LABEL(0x1010L),
SO_PEERLABEL(0x1011L);
// SO_ATTACH_FILTER not defined
// SO_BINDTODEVICE not defined
// SO_DETACH_FILTER not defined
// SO_NO_CHECK not defined
// SO_PASSCRED not defined
// SO_PEERCRED not defined
// SO_PEERNAME not defined
// SO_PRIORITY not defined
// SO_SECURITY_AUTHENTICATION not defined
// SO_SECURITY_ENCRYPTION_NETWORK not defined
// SO_SECURITY_ENCRYPTION_TRANSPORT not defined
private final long value;
private SocketOption(long value) { this.value = value; }
public static final long MIN_VALUE = 0x1L;
public static final long MAX_VALUE = 0x8000L;

static final class StringTable {
  public static final java.util.Map<SocketOption, String> descriptions = generateTable();
  public static final java.util.Map<SocketOption, String> generateTable() {
    java.util.Map<SocketOption, String> map = new java.util.EnumMap<SocketOption, String>(SocketOption.class);
  map.put(SO_DEBUG, "SO_DEBUG");
  map.put(SO_ACCEPTCONN, "SO_ACCEPTCONN");
  map.put(SO_REUSEADDR, "SO_REUSEADDR");
  map.put(SO_KEEPALIVE, "SO_KEEPALIVE");
  map.put(SO_DONTROUTE, "SO_DONTROUTE");
  map.put(SO_BROADCAST, "SO_BROADCAST");
  map.put(SO_USELOOPBACK, "SO_USELOOPBACK");
  map.put(SO_LINGER, "SO_LINGER");
  map.put(SO_OOBINLINE, "SO_OOBINLINE");
  map.put(SO_REUSEPORT, "SO_REUSEPORT");
  map.put(SO_TIMESTAMP, "SO_TIMESTAMP");
  map.put(SO_DONTTRUNC, "SO_DONTTRUNC");
  map.put(SO_WANTMORE, "SO_WANTMORE");
  map.put(SO_WANTOOBFLAG, "SO_WANTOOBFLAG");
  map.put(SO_SNDBUF, "SO_SNDBUF");
  map.put(SO_RCVBUF, "SO_RCVBUF");
  map.put(SO_SNDLOWAT, "SO_SNDLOWAT");
  map.put(SO_RCVLOWAT, "SO_RCVLOWAT");
  map.put(SO_SNDTIMEO, "SO_SNDTIMEO");
  map.put(SO_RCVTIMEO, "SO_RCVTIMEO");
  map.put(SO_ERROR, "SO_ERROR");
  map.put(SO_TYPE, "SO_TYPE");
  map.put(SO_NREAD, "SO_NREAD");
  map.put(SO_NKE, "SO_NKE");
  map.put(SO_NOSIGPIPE, "SO_NOSIGPIPE");
  map.put(SO_NOADDRERR, "SO_NOADDRERR");
  map.put(SO_NWRITE, "SO_NWRITE");
  map.put(SO_REUSESHAREUID, "SO_REUSESHAREUID");
  map.put(SO_LABEL, "SO_LABEL");
  map.put(SO_PEERLABEL, "SO_PEERLABEL");
    return map;
  }
}
public final String toString() { return StringTable.descriptions.get(this); }
public final int value() { return (int) value; }
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
