// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Jan 23 18:50:01 +1000 2009
package com.kenai.constantine.platform.fake;
public enum Signal implements com.kenai.constantine.Constant {
SIGHUP(1),
SIGINT(2),
SIGQUIT(3),
SIGILL(4),
SIGTRAP(5),
SIGABRT(6),
SIGIOT(7),
SIGBUS(8),
SIGFPE(9),
SIGKILL(10),
SIGUSR1(11),
SIGSEGV(12),
SIGUSR2(13),
SIGPIPE(14),
SIGALRM(15),
SIGTERM(16),
SIGSTKFLT(17),
SIGCLD(18),
SIGCHLD(19),
SIGCONT(20),
SIGSTOP(21),
SIGTSTP(22),
SIGTTIN(23),
SIGTTOU(24),
SIGURG(25),
SIGXCPU(26),
SIGXFSZ(27),
SIGVTALRM(28),
SIGPROF(29),
SIGWINCH(30),
SIGPOLL(31),
SIGIO(32),
SIGPWR(33),
SIGSYS(34),
SIGUNUSED(35),
SIGRTMIN(36),
SIGRTMAX(37),
NSIG(38);
private final int value;
private Signal(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 38;
public final int value() { return value; }
}