// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2018-05-11 03:41:45 +0000
package jnr.constants.platform.aix;
public enum Sysconf implements jnr.constants.Constant {
_SC_ARG_MAX(0L),
_SC_CHILD_MAX(1L),
_SC_CLK_TCK(2L),
_SC_NGROUPS_MAX(3L),
_SC_OPEN_MAX(4L),
_SC_JOB_CONTROL(7L),
_SC_SAVED_IDS(8L),
_SC_VERSION(9L),
_SC_BC_BASE_MAX(23L),
_SC_BC_DIM_MAX(24L),
_SC_BC_SCALE_MAX(25L),
_SC_BC_STRING_MAX(26L),
_SC_COLL_WEIGHTS_MAX(50L),
_SC_EXPR_NEST_MAX(28L),
_SC_LINE_MAX(29L),
_SC_RE_DUP_MAX(30L),
_SC_2_VERSION(31L),
_SC_2_C_BIND(51L),
_SC_2_C_DEV(32L),
_SC_2_CHAR_TERM(54L),
_SC_2_FORT_DEV(33L),
_SC_2_FORT_RUN(34L),
_SC_2_LOCALEDEF(35L),
_SC_2_SW_DEV(36L),
_SC_2_UPE(53L),
_SC_STREAM_MAX(5L),
_SC_TZNAME_MAX(6L),
_SC_ASYNCHRONOUS_IO(78L),
_SC_PAGESIZE(48L),
_SC_MEMLOCK(85L),
_SC_MEMLOCK_RANGE(86L),
_SC_MEMORY_PROTECTION(87L),
_SC_MESSAGE_PASSING(88L),
_SC_PRIORITIZED_IO(91L),
_SC_PRIORITY_SCHEDULING(92L),
_SC_REALTIME_SIGNALS(93L),
_SC_SEMAPHORES(95L),
_SC_FSYNC(80L),
_SC_SHARED_MEMORY_OBJECTS(98L),
_SC_SYNCHRONIZED_IO(100L),
_SC_TIMERS(102L),
_SC_AIO_LISTIO_MAX(75L),
_SC_AIO_MAX(76L),
_SC_AIO_PRIO_DELTA_MAX(77L),
_SC_DELAYTIMER_MAX(79L),
_SC_MQ_OPEN_MAX(89L),
_SC_MAPPED_FILES(84L),
_SC_RTSIG_MAX(94L),
_SC_SEM_NSEMS_MAX(96L),
_SC_SEM_VALUE_MAX(97L),
_SC_SIGQUEUE_MAX(99L),
_SC_TIMER_MAX(103L),
_SC_NPROCESSORS_CONF(71L),
_SC_NPROCESSORS_ONLN(72L),
_SC_2_PBS(132L),
_SC_2_PBS_ACCOUNTING(133L),
_SC_2_PBS_CHECKPOINT(134L),
_SC_2_PBS_LOCATE(135L),
_SC_2_PBS_MESSAGE(136L),
_SC_2_PBS_TRACK(137L),
_SC_ADVISORY_INFO(130L),
_SC_BARRIERS(138L),
_SC_CLOCK_SELECTION(139L),
_SC_CPUTIME(140L),
_SC_FILE_LOCKING(131L),
_SC_GETGR_R_SIZE_MAX(81L),
_SC_GETPW_R_SIZE_MAX(82L),
_SC_HOST_NAME_MAX(126L),
_SC_LOGIN_NAME_MAX(83L),
_SC_MONOTONIC_CLOCK(141L),
_SC_MQ_PRIO_MAX(90L),
_SC_READER_WRITER_LOCKS(142L),
_SC_REGEXP(127L),
_SC_SHELL(128L),
_SC_SPAWN(143L),
_SC_SPIN_LOCKS(144L),
_SC_SPORADIC_SERVER(145L),
_SC_THREAD_ATTR_STACKADDR(61L),
_SC_THREAD_ATTR_STACKSIZE(62L),
_SC_THREAD_CPUTIME(146L),
_SC_THREAD_DESTRUCTOR_ITERATIONS(101L),
_SC_THREAD_KEYS_MAX(68L),
_SC_THREAD_PRIO_INHERIT(65L),
_SC_THREAD_PRIO_PROTECT(66L),
_SC_THREAD_PRIORITY_SCHEDULING(64L),
_SC_THREAD_PROCESS_SHARED(67L),
_SC_THREAD_SAFE_FUNCTIONS(59L),
_SC_THREAD_SPORADIC_SERVER(147L),
_SC_THREAD_STACK_MIN(69L),
_SC_THREAD_THREADS_MAX(70L),
_SC_TIMEOUTS(148L),
_SC_THREADS(60L),
_SC_TRACE(149L),
_SC_TRACE_EVENT_FILTER(150L),
_SC_TRACE_INHERIT(151L),
_SC_TRACE_LOG(152L),
_SC_TTY_NAME_MAX(104L),
_SC_TYPED_MEMORY_OBJECTS(153L),
_SC_V6_ILP32_OFF32(121L),
_SC_V6_ILP32_OFFBIG(122L),
_SC_V6_LP64_OFF64(123L),
_SC_V6_LPBIG_OFFBIG(124L),
_SC_IPV6(154L),
_SC_RAW_SOCKETS(155L),
_SC_SYMLOOP_MAX(129L),
_SC_ATEXIT_MAX(47L),
_SC_IOV_MAX(58L),
_SC_PAGE_SIZE(48L),
_SC_XOPEN_CRYPT(56L),
_SC_XOPEN_ENH_I18N(57L),
_SC_XOPEN_LEGACY(112L),
_SC_XOPEN_REALTIME(110L),
_SC_XOPEN_REALTIME_THREADS(111L),
_SC_XOPEN_SHM(55L),
_SC_XOPEN_STREAMS(125L),
_SC_XOPEN_UNIX(73L),
_SC_XOPEN_VERSION(46L),
_SC_XOPEN_XCU_VERSION(109L),
_SC_XBS5_ILP32_OFF32(105L),
_SC_XBS5_ILP32_OFFBIG(106L),
_SC_XBS5_LP64_OFF64(107L),
_SC_XBS5_LPBIG_OFFBIG(108L),
_SC_SS_REPL_MAX(156L),
_SC_TRACE_EVENT_NAME_MAX(157L),
_SC_TRACE_NAME_MAX(158L),
_SC_TRACE_SYS_MAX(159L),
_SC_TRACE_USER_EVENT_MAX(160L),
_SC_PASS_MAX(45L);
private final long value;
private Sysconf(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 160L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
