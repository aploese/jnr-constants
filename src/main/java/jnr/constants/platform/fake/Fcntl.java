// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 16:59:52 -0500
package jnr.constants.platform.fake;
public enum Fcntl implements jnr.constants.Constant {
F_DUPFD(0),
F_GETFD(1),
F_SETFD(2),
F_GETFL(3),
F_SETFL(4),
F_GETOWN(5),
F_SETOWN(6),
F_GETLK(7),
F_SETLK(8),
F_SETLKW(9),
F_CHKCLEAN(10),
F_PREALLOCATE(11),
F_SETSIZE(12),
F_RDADVISE(13),
F_RDAHEAD(14),
F_READBOOTSTRAP(15),
F_WRITEBOOTSTRAP(16),
F_NOCACHE(17),
F_LOG2PHYS(18),
F_GETPATH(19),
F_FULLFSYNC(20),
F_PATHPKG_CHECK(21),
F_FREEZE_FS(22),
F_THAW_FS(23),
F_GLOBAL_NOCACHE(24),
F_ADDSIGS(25),
F_MARKDEPENDENCY(26),
F_RDLCK(27),
F_UNLCK(28),
F_WRLCK(29),
F_ALLOCATECONTIG(30),
F_ALLOCATEALL(31);
private final long value;
private Fcntl(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 31L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
