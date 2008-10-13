// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Oct 13 19:29:55 +1000 2008
package constantine.platform.darwin;
public enum Errno implements constantine.Constant {
EPERM(1),
ENOENT(2),
ESRCH(3),
EINTR(4),
EIO(5),
ENXIO(6),
E2BIG(7),
ENOEXEC(8),
EBADF(9),
ECHILD(10),
EDEADLK(11),
ENOMEM(12),
EACCES(13),
EFAULT(14),
ENOTBLK(15),
EBUSY(16),
EEXIST(17),
EXDEV(18),
ENODEV(19),
ENOTDIR(20),
EISDIR(21),
EINVAL(22),
ENFILE(23),
EMFILE(24),
ENOTTY(25),
ETXTBSY(26),
EFBIG(27),
ENOSPC(28),
ESPIPE(29),
EROFS(30),
EMLINK(31),
EPIPE(32),
EDOM(33),
ERANGE(34),
EWOULDBLOCK(35),
EAGAIN(35),
EINPROGRESS(36),
EALREADY(37),
ENOTSOCK(38),
EDESTADDRREQ(39),
EMSGSIZE(40),
EPROTOTYPE(41),
ENOPROTOOPT(42),
EPROTONOSUPPORT(43),
ESOCKTNOSUPPORT(44),
EOPNOTSUPP(102),
EPFNOSUPPORT(46),
EAFNOSUPPORT(47),
EADDRINUSE(48),
EADDRNOTAVAIL(49),
ENETDOWN(50),
ENETUNREACH(51),
ENETRESET(52),
ECONNABORTED(53),
ECONNRESET(54),
ENOBUFS(55),
EISCONN(56),
ENOTCONN(57),
ESHUTDOWN(58),
ETOOMANYREFS(59),
ETIMEDOUT(60),
ECONNREFUSED(61),
ELOOP(62),
ENAMETOOLONG(63),
EHOSTDOWN(64),
EHOSTUNREACH(65),
ENOTEMPTY(66),
EUSERS(68),
EDQUOT(69),
ESTALE(70),
EREMOTE(71),
ENOLCK(77),
ENOSYS(78),
EOVERFLOW(84),
EIDRM(90),
ENOMSG(91),
EILSEQ(92),
EBADMSG(94),
EMULTIHOP(95),
ENODATA(96),
ENOLINK(97),
ENOSR(98),
ENOSTR(99),
EPROTO(100),
ETIME(101);
private final int value;
private Errno(int value) { this.value = value; }
public final int value() { return value; }
}
