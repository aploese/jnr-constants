// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 23:52:41 +0000 2009
package com.kenai.constantine.platform.sunos;
public enum Fcntl implements com.kenai.constantine.Constant {
F_DUPFD(0),
// FREAD not defined
// FWRITE not defined
// FAPPEND not defined
// FASYNC not defined
// FFSYNC not defined
// FNONBLOCK not defined
// FNDELAY not defined
F_GETFD(1),
F_SETFD(2),
F_GETFL(3),
F_SETFL(4),
F_GETOWN(23),
F_SETOWN(24),
F_GETLK(33),
F_SETLK(34),
F_SETLKW(35),
// F_CHKCLEAN not defined
// F_PREALLOCATE not defined
// F_SETSIZE not defined
// F_RDADVISE not defined
// F_RDAHEAD not defined
// F_READBOOTSTRAP not defined
// F_WRITEBOOTSTRAP not defined
// F_NOCACHE not defined
// F_LOG2PHYS not defined
// F_GETPATH not defined
// F_FULLFSYNC not defined
// F_PATHPKG_CHECK not defined
// F_FREEZE_FS not defined
// F_THAW_FS not defined
// F_GLOBAL_NOCACHE not defined
// F_ADDSIGS not defined
// F_MARKDEPENDENCY not defined
F_RDLCK(1),
F_UNLCK(3),
F_WRLCK(2);
// F_ALLOCATECONTIG not defined
// F_ALLOCATEALL not defined
private final int value;
private Fcntl(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 35;

public final int value() { return value; }
}