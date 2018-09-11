// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-09-11 16:59:54 -0500
package jnr.constants.platform.fake;
public enum Errno implements jnr.constants.Constant {
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
EAGAIN(36),
EINPROGRESS(37),
EALREADY(38),
ENOTSOCK(39),
EDESTADDRREQ(40),
EMSGSIZE(41),
EPROTOTYPE(42),
ENOPROTOOPT(43),
EPROTONOSUPPORT(44),
ESOCKTNOSUPPORT(45),
EOPNOTSUPP(46),
EPFNOSUPPORT(47),
EAFNOSUPPORT(48),
EADDRINUSE(49),
EADDRNOTAVAIL(50),
ENETDOWN(51),
ENETUNREACH(52),
ENETRESET(53),
ECONNABORTED(54),
ECONNRESET(55),
ENOBUFS(56),
EISCONN(57),
ENOTCONN(58),
ESHUTDOWN(59),
ETOOMANYREFS(60),
ETIMEDOUT(61),
ECONNREFUSED(62),
ELOOP(63),
ENAMETOOLONG(64),
EHOSTDOWN(65),
EHOSTUNREACH(66),
ENOTEMPTY(67),
EUSERS(68),
EDQUOT(69),
ESTALE(70),
EREMOTE(71),
ENOLCK(72),
ENOSYS(73),
EOVERFLOW(74),
EIDRM(75),
ENOMSG(76),
EILSEQ(77),
EBADMSG(78),
EMULTIHOP(79),
ENODATA(80),
ENOLINK(81),
ENOSR(82),
ENOSTR(83),
EPROTO(84),
ETIME(85),
ECHRNG(86),
EL2NSYNC(87),
EL3HLT(88),
EL3RST(89),
ELNRNG(90),
EUNATCH(91),
ENOCSI(92),
EL2HLT(93),
EBADE(94),
EBADR(95),
EXFULL(96),
ENOANO(97),
EBADRQC(98),
EBADSLT(99),
EDEADLOCK(100),
EBFONT(101),
ENONET(102),
ENOPKG(103),
EADV(104),
ESRMNT(105),
ECOMM(106),
EDOTDOT(107),
ENOTUNIQ(108),
EBADFD(109),
EREMCHG(110),
ELIBACC(111),
ELIBBAD(112),
ELIBSCN(113),
ELIBMAX(114),
ELIBEXEC(115),
ERESTART(116),
ESTRPIPE(117),
EUCLEAN(118),
ENOTNAM(119),
ENAVAIL(120),
EISNAM(121),
EREMOTEIO(122),
ECANCELED(123),
EKEYEXPIRED(124),
EKEYREJECTED(125),
EKEYREVOKED(126),
EMEDIUMTYPE(127),
ENOKEY(128),
ENOMEDIUM(129),
ENOTRECOVERABLE(130),
EOWNERDEAD(131),
ERFKILL(132),
EAUTH(133),
EBADRPC(134),
EDOOFUS(135),
EFTYPE(136),
ENEEDAUTH(137),
ENOATTR(138),
ENOTSUP(139),
EPROCLIM(140),
EPROCUNAVAIL(141),
EPROGMISMATCH(142),
EPROGUNAVAIL(143),
ERPCMISMATCH(144),
EIPSEC(145),
EHWPOISON(146),
ECAPMODE(147),
ENOTCAPABLE(148);
private final long value;
private Errno(long value) { this.value = value; }
public static final long MIN_VALUE = 1L;
public static final long MAX_VALUE = 148L;
public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
