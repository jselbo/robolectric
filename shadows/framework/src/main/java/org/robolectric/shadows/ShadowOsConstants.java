package org.robolectric.shadows;

import android.system.OsConstants;
import java.io.File;
import java.lang.reflect.Field;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;

/** */
@Implements(value = OsConstants.class)
public final class ShadowOsConstants {
  @Implementation
  protected static void initConstants() {

    // In real android these constants are populated via reflection in native linux-only code.
    // This shadow performs similar logic here , using the values obtained from
    // an Android emulator at runtime.

    initConstant("AF_INET", 0x0000002);
    initConstant("AF_INET6", 0x000000a);
    initConstant("AF_NETLINK", 0x0000010);
    initConstant("AF_PACKET", 0x0000011);
    initConstant("AF_UNIX", 0x0000001);
    initConstant("AF_UNSPEC", 0x0000000);
    initConstant("AF_VSOCK", 0x0000028);
    initConstant("AI_ADDRCONFIG", 0x0000400);
    initConstant("AI_ALL", 0x0000100);
    initConstant("AI_CANONNAME", 0x0000002);
    initConstant("AI_NUMERICHOST", 0x0000004);
    initConstant("AI_NUMERICSERV", 0x0000008);
    initConstant("AI_PASSIVE", 0x0000001);
    initConstant("AI_V4MAPPED", 0x0000800);
    initConstant("ARPHRD_ETHER", 0x0000001);
    initConstant("ARPHRD_LOOPBACK", 0x0000304);
    initConstant("CAP_AUDIT_CONTROL", 0x000001e);
    initConstant("CAP_AUDIT_WRITE", 0x000001d);
    initConstant("CAP_BLOCK_SUSPEND", 0x0000024);
    initConstant("CAP_CHOWN", 0x0000000);
    initConstant("CAP_DAC_OVERRIDE", 0x0000001);
    initConstant("CAP_DAC_READ_SEARCH", 0x0000002);
    initConstant("CAP_FOWNER", 0x0000003);
    initConstant("CAP_FSETID", 0x0000004);
    initConstant("CAP_IPC_LOCK", 0x000000e);
    initConstant("CAP_IPC_OWNER", 0x000000f);
    initConstant("CAP_KILL", 0x0000005);
    initConstant("CAP_LAST_CAP", 0x0000028);
    initConstant("CAP_LEASE", 0x000001c);
    initConstant("CAP_LINUX_IMMUTABLE", 0x0000009);
    initConstant("CAP_MAC_ADMIN", 0x0000021);
    initConstant("CAP_MAC_OVERRIDE", 0x0000020);
    initConstant("CAP_MKNOD", 0x000001b);
    initConstant("CAP_NET_ADMIN", 0x000000c);
    initConstant("CAP_NET_BIND_SERVICE", 0x000000a);
    initConstant("CAP_NET_BROADCAST", 0x000000b);
    initConstant("CAP_NET_RAW", 0x000000d);
    initConstant("CAP_SETFCAP", 0x000001f);
    initConstant("CAP_SETGID", 0x0000006);
    initConstant("CAP_SETPCAP", 0x0000008);
    initConstant("CAP_SETUID", 0x0000007);
    initConstant("CAP_SYSLOG", 0x0000022);
    initConstant("CAP_SYS_ADMIN", 0x0000015);
    initConstant("CAP_SYS_BOOT", 0x0000016);
    initConstant("CAP_SYS_CHROOT", 0x0000012);
    initConstant("CAP_SYS_MODULE", 0x0000010);
    initConstant("CAP_SYS_NICE", 0x0000017);
    initConstant("CAP_SYS_PACCT", 0x0000014);
    initConstant("CAP_SYS_PTRACE", 0x0000013);
    initConstant("CAP_SYS_RAWIO", 0x0000011);
    initConstant("CAP_SYS_RESOURCE", 0x0000018);
    initConstant("CAP_SYS_TIME", 0x0000019);
    initConstant("CAP_SYS_TTY_CONFIG", 0x000001a);
    initConstant("CAP_WAKE_ALARM", 0x0000023);
    initConstant("E2BIG", 0x0000007);
    initConstant("EACCES", 0x000000d);
    initConstant("EADDRINUSE", 0x0000062);
    initConstant("EADDRNOTAVAIL", 0x0000063);
    initConstant("EAFNOSUPPORT", 0x0000061);
    initConstant("EAGAIN", 0x000000b);
    initConstant("EAI_AGAIN", 0x0000002);
    initConstant("EAI_BADFLAGS", 0x0000003);
    initConstant("EAI_FAIL", 0x0000004);
    initConstant("EAI_FAMILY", 0x0000005);
    initConstant("EAI_MEMORY", 0x0000006);
    initConstant("EAI_NODATA", 0x0000007);
    initConstant("EAI_NONAME", 0x0000008);
    initConstant("EAI_OVERFLOW", 0x000000e);
    initConstant("EAI_SERVICE", 0x0000009);
    initConstant("EAI_SOCKTYPE", 0x000000a);
    initConstant("EAI_SYSTEM", 0x000000b);
    initConstant("EALREADY", 0x0000072);
    initConstant("EBADF", 0x0000009);
    initConstant("EBADMSG", 0x000004a);
    initConstant("EBUSY", 0x0000010);
    initConstant("ECANCELED", 0x000007d);
    initConstant("ECHILD", 0x000000a);
    initConstant("ECONNABORTED", 0x0000067);
    initConstant("ECONNREFUSED", 0x000006f);
    initConstant("ECONNRESET", 0x0000068);
    initConstant("EDEADLK", 0x0000023);
    initConstant("EDESTADDRREQ", 0x0000059);
    initConstant("EDOM", 0x0000021);
    initConstant("EDQUOT", 0x000007a);
    initConstant("EEXIST", 0x0000011);
    initConstant("EFAULT", 0x000000e);
    initConstant("EFBIG", 0x000001b);
    initConstant("EHOSTUNREACH", 0x0000071);
    initConstant("EIDRM", 0x000002b);
    initConstant("EILSEQ", 0x0000054);
    initConstant("EINPROGRESS", 0x0000073);
    initConstant("EINTR", 0x0000004);
    initConstant("EINVAL", 0x0000016);
    initConstant("EIO", 0x0000005);
    initConstant("EISCONN", 0x000006a);
    initConstant("EISDIR", 0x0000015);
    initConstant("ELOOP", 0x0000028);
    initConstant("EMFILE", 0x0000018);
    initConstant("EMLINK", 0x000001f);
    initConstant("EMSGSIZE", 0x000005a);
    initConstant("EMULTIHOP", 0x0000048);
    initConstant("ENAMETOOLONG", 0x0000024);
    initConstant("ENETDOWN", 0x0000064);
    initConstant("ENETRESET", 0x0000066);
    initConstant("ENETUNREACH", 0x0000065);
    initConstant("ENFILE", 0x0000017);
    initConstant("ENOBUFS", 0x0000069);
    initConstant("ENODATA", 0x000003d);
    initConstant("ENODEV", 0x0000013);
    initConstant("ENOENT", 0x0000002);
    initConstant("ENOEXEC", 0x0000008);
    initConstant("ENOLCK", 0x0000025);
    initConstant("ENOLINK", 0x0000043);
    initConstant("ENOMEM", 0x000000c);
    initConstant("ENOMSG", 0x000002a);
    initConstant("ENONET", 0x0000040);
    initConstant("ENOPROTOOPT", 0x000005c);
    initConstant("ENOSPC", 0x000001c);
    initConstant("ENOSR", 0x000003f);
    initConstant("ENOSTR", 0x000003c);
    initConstant("ENOSYS", 0x0000026);
    initConstant("ENOTCONN", 0x000006b);
    initConstant("ENOTDIR", 0x0000014);
    initConstant("ENOTEMPTY", 0x0000027);
    initConstant("ENOTSOCK", 0x0000058);
    initConstant("ENOTSUP", 0x000005f);
    initConstant("ENOTTY", 0x0000019);
    initConstant("ENXIO", 0x0000006);
    initConstant("EOPNOTSUPP", 0x000005f);
    initConstant("EOVERFLOW", 0x000004b);
    initConstant("EPERM", 0x0000001);
    initConstant("EPIPE", 0x0000020);
    initConstant("EPROTO", 0x0000047);
    initConstant("EPROTONOSUPPORT", 0x000005d);
    initConstant("EPROTOTYPE", 0x000005b);
    initConstant("ERANGE", 0x0000022);
    initConstant("EROFS", 0x000001e);
    initConstant("ESPIPE", 0x000001d);
    initConstant("ESRCH", 0x0000003);
    initConstant("ESTALE", 0x0000074);
    initConstant("ETH_P_ALL", 0x0000003);
    initConstant("ETH_P_ARP", 0x0000806);
    initConstant("ETH_P_IP", 0x0000800);
    initConstant("ETH_P_IPV6", 0x00086dd);
    initConstant("ETIME", 0x000003e);
    initConstant("ETIMEDOUT", 0x000006e);
    initConstant("ETXTBSY", 0x000001a);
    initConstant("EUSERS", 0x0000057);
    initConstant("EXDEV", 0x0000012);
    initConstant("EXIT_FAILURE", 0x0000001);
    initConstant("EXIT_SUCCESS", 0x0000000);
    initConstant("FD_CLOEXEC", 0x0000001);
    initConstant("FIONREAD", 0x000541b);
    initConstant("F_DUPFD", 0x0000000);
    initConstant("F_DUPFD_CLOEXEC", 0x0000406);
    initConstant("F_GETFD", 0x0000001);
    initConstant("F_GETFL", 0x0000003);
    initConstant("F_GETLK", 0x0000005);
    initConstant("F_GETLK64", 0x0000005);
    initConstant("F_GETOWN", 0x0000009);
    initConstant("F_OK", 0x0000000);
    initConstant("F_RDLCK", 0x0000000);
    initConstant("F_SETFD", 0x0000002);
    initConstant("F_SETFL", 0x0000004);
    initConstant("F_SETLK", 0x0000006);
    initConstant("F_SETLK64", 0x0000006);
    initConstant("F_SETLKW", 0x0000007);
    initConstant("F_SETLKW64", 0x0000007);
    initConstant("F_SETOWN", 0x0000008);
    initConstant("F_UNLCK", 0x0000002);
    initConstant("F_WRLCK", 0x0000001);
    initConstant("ICMP6_ECHO_REPLY", 0x0000081);
    initConstant("ICMP6_ECHO_REQUEST", 0x0000080);
    initConstant("ICMP_ECHO", 0x0000008);
    initConstant("ICMP_ECHOREPLY", 0x0000000);
    initConstant("IFA_F_DADFAILED", 0x0000008);
    initConstant("IFA_F_DEPRECATED", 0x0000020);
    initConstant("IFA_F_HOMEADDRESS", 0x0000010);
    initConstant("IFA_F_MANAGETEMPADDR", 0x0000100);
    initConstant("IFA_F_NODAD", 0x0000002);
    initConstant("IFA_F_NOPREFIXROUTE", 0x0000200);
    initConstant("IFA_F_OPTIMISTIC", 0x0000004);
    initConstant("IFA_F_PERMANENT", 0x0000080);
    initConstant("IFA_F_SECONDARY", 0x0000001);
    initConstant("IFA_F_TEMPORARY", 0x0000001);
    initConstant("IFA_F_TENTATIVE", 0x0000040);
    initConstant("IFF_ALLMULTI", 0x0000200);
    initConstant("IFF_AUTOMEDIA", 0x0004000);
    initConstant("IFF_BROADCAST", 0x0000002);
    initConstant("IFF_DEBUG", 0x0000004);
    initConstant("IFF_DYNAMIC", 0x0008000);
    initConstant("IFF_LOOPBACK", 0x0000008);
    initConstant("IFF_MASTER", 0x0000400);
    initConstant("IFF_MULTICAST", 0x0001000);
    initConstant("IFF_NOARP", 0x0000080);
    initConstant("IFF_NOTRAILERS", 0x0000020);
    initConstant("IFF_POINTOPOINT", 0x0000010);
    initConstant("IFF_PORTSEL", 0x0002000);
    initConstant("IFF_PROMISC", 0x0000100);
    initConstant("IFF_RUNNING", 0x0000040);
    initConstant("IFF_SLAVE", 0x0000800);
    initConstant("IFF_UP", 0x0000001);
    initConstant("IPPROTO_ESP", 0x0000032);
    initConstant("IPPROTO_ICMP", 0x0000001);
    initConstant("IPPROTO_ICMPV6", 0x000003a);
    initConstant("IPPROTO_IP", 0x0000000);
    initConstant("IPPROTO_IPV6", 0x0000029);
    initConstant("IPPROTO_RAW", 0x00000ff);
    initConstant("IPPROTO_TCP", 0x0000006);
    initConstant("IPPROTO_UDP", 0x0000011);
    initConstant("IPV6_CHECKSUM", 0x0000007);
    initConstant("IPV6_MULTICAST_HOPS", 0x0000012);
    initConstant("IPV6_MULTICAST_IF", 0x0000011);
    initConstant("IPV6_MULTICAST_LOOP", 0x0000013);
    initConstant("IPV6_PKTINFO", 0x0000032);
    initConstant("IPV6_RECVDSTOPTS", 0x000003a);
    initConstant("IPV6_RECVHOPLIMIT", 0x0000033);
    initConstant("IPV6_RECVHOPOPTS", 0x0000035);
    initConstant("IPV6_RECVPKTINFO", 0x0000031);
    initConstant("IPV6_RECVRTHDR", 0x0000038);
    initConstant("IPV6_RECVTCLASS", 0x0000042);
    initConstant("IPV6_TCLASS", 0x0000043);
    initConstant("IPV6_UNICAST_HOPS", 0x0000010);
    initConstant("IPV6_V6ONLY", 0x000001a);
    initConstant("IP_MULTICAST_ALL", 0x0000031);
    initConstant("IP_MULTICAST_IF", 0x0000020);
    initConstant("IP_MULTICAST_LOOP", 0x0000022);
    initConstant("IP_MULTICAST_TTL", 0x0000021);
    initConstant("IP_RECVTOS", 0x000000d);
    initConstant("IP_TOS", 0x0000001);
    initConstant("IP_TTL", 0x0000002);
    initConstant("MAP_ANONYMOUS", 0x0000020);
    initConstant("MAP_FIXED", 0x0000010);
    initConstant("MAP_POPULATE", 0x0008000);
    initConstant("MAP_PRIVATE", 0x0000002);
    initConstant("MAP_SHARED", 0x0000001);
    initConstant("MCAST_BLOCK_SOURCE", 0x000002b);
    initConstant("MCAST_JOIN_GROUP", 0x000002a);
    initConstant("MCAST_JOIN_SOURCE_GROUP", 0x000002e);
    initConstant("MCAST_LEAVE_GROUP", 0x000002d);
    initConstant("MCAST_LEAVE_SOURCE_GROUP", 0x000002f);
    initConstant("MCAST_UNBLOCK_SOURCE", 0x000002c);
    initConstant("MCL_CURRENT", 0x0000001);
    initConstant("MCL_FUTURE", 0x0000002);
    initConstant("MFD_CLOEXEC", 0x0000001);
    initConstant("MSG_CTRUNC", 0x0000008);
    initConstant("MSG_DONTROUTE", 0x0000004);
    initConstant("MSG_EOR", 0x0000080);
    initConstant("MSG_OOB", 0x0000001);
    initConstant("MSG_PEEK", 0x0000002);
    initConstant("MSG_TRUNC", 0x0000020);
    initConstant("MSG_WAITALL", 0x0000100);
    initConstant("MS_ASYNC", 0x0000001);
    initConstant("MS_INVALIDATE", 0x0000002);
    initConstant("MS_SYNC", 0x0000004);
    initConstant("NETLINK_INET_DIAG", 0x0000004);
    initConstant("NETLINK_NETFILTER", 0x000000c);
    initConstant("NETLINK_ROUTE", 0x0000000);
    initConstant("NETLINK_XFRM", 0x0000006);
    initConstant("NI_DGRAM", 0x0000010);
    initConstant("NI_NAMEREQD", 0x0000004);
    initConstant("NI_NOFQDN", 0x0000001);
    initConstant("NI_NUMERICHOST", 0x0000002);
    initConstant("NI_NUMERICSERV", 0x0000008);
    initConstant("O_ACCMODE", 0x0000003);
    initConstant("O_APPEND", 0x0000400);
    initConstant("O_CLOEXEC", 0x0080000);
    initConstant("O_CREAT", 0x0000040);
    initConstant("O_DIRECT", 0x0004000);
    initConstant("O_DSYNC", 0x0001000);
    initConstant("O_EXCL", 0x0000080);
    initConstant("O_NOCTTY", 0x0000100);
    initConstant("O_NOFOLLOW", 0x0020000);
    initConstant("O_NONBLOCK", 0x0000800);
    initConstant("O_RDONLY", 0x0000000);
    initConstant("O_RDWR", 0x0000002);
    initConstant("O_SYNC", 0x0101000);
    initConstant("O_TRUNC", 0x0000200);
    initConstant("O_WRONLY", 0x0000001);
    initConstant("PACKET_IGNORE_OUTGOING", 0x0000017);
    initConstant("POLLERR", 0x0000008);
    initConstant("POLLHUP", 0x0000010);
    initConstant("POLLIN", 0x0000001);
    initConstant("POLLNVAL", 0x0000020);
    initConstant("POLLOUT", 0x0000004);
    initConstant("POLLPRI", 0x0000002);
    initConstant("POLLRDBAND", 0x0000080);
    initConstant("POLLRDNORM", 0x0000040);
    initConstant("POLLWRBAND", 0x0000200);
    initConstant("POLLWRNORM", 0x0000100);
    initConstant("PROT_EXEC", 0x0000004);
    initConstant("PROT_NONE", 0x0000000);
    initConstant("PROT_READ", 0x0000001);
    initConstant("PROT_WRITE", 0x0000002);
    initConstant("PR_CAP_AMBIENT", 0x000002f);
    initConstant("PR_CAP_AMBIENT_RAISE", 0x0000002);
    initConstant("PR_GET_DUMPABLE", 0x0000003);
    initConstant("PR_SET_DUMPABLE", 0x0000004);
    initConstant("PR_SET_NO_NEW_PRIVS", 0x0000026);
    initConstant("RLIMIT_NOFILE", 0x0000007);
    initConstant("RLIMIT_RTPRIO", 0x000000e);
    initConstant("RTMGRP_IPV4_IFADDR", 0x0000010);
    initConstant("RTMGRP_IPV4_MROUTE", 0x0000020);
    initConstant("RTMGRP_IPV4_ROUTE", 0x0000040);
    initConstant("RTMGRP_IPV4_RULE", 0x0000080);
    initConstant("RTMGRP_IPV6_IFADDR", 0x0000100);
    initConstant("RTMGRP_IPV6_IFINFO", 0x0000800);
    initConstant("RTMGRP_IPV6_MROUTE", 0x0000200);
    initConstant("RTMGRP_IPV6_PREFIX", 0x0020000);
    initConstant("RTMGRP_IPV6_ROUTE", 0x0000400);
    initConstant("RTMGRP_LINK", 0x0000001);
    initConstant("RTMGRP_NEIGH", 0x0000004);
    initConstant("RTMGRP_NOTIFY", 0x0000002);
    initConstant("RTMGRP_TC", 0x0000008);
    initConstant("RT_SCOPE_HOST", 0x00000fe);
    initConstant("RT_SCOPE_LINK", 0x00000fd);
    initConstant("RT_SCOPE_NOWHERE", 0x00000ff);
    initConstant("RT_SCOPE_SITE", 0x00000c8);
    initConstant("RT_SCOPE_UNIVERSE", 0x0000000);
    initConstant("R_OK", 0x0000004);
    initConstant("SEEK_CUR", 0x0000001);
    initConstant("SEEK_END", 0x0000002);
    initConstant("SEEK_SET", 0x0000000);
    initConstant("SHUT_RD", 0x0000000);
    initConstant("SHUT_RDWR", 0x0000002);
    initConstant("SHUT_WR", 0x0000001);
    initConstant("SIGABRT", 0x0000006);
    initConstant("SIGALRM", 0x000000e);
    initConstant("SIGBUS", 0x0000007);
    initConstant("SIGCHLD", 0x0000011);
    initConstant("SIGCONT", 0x0000012);
    initConstant("SIGFPE", 0x0000008);
    initConstant("SIGHUP", 0x0000001);
    initConstant("SIGILL", 0x0000004);
    initConstant("SIGINT", 0x0000002);
    initConstant("SIGIO", 0x000001d);
    initConstant("SIGKILL", 0x0000009);
    initConstant("SIGPIPE", 0x000000d);
    initConstant("SIGPROF", 0x000001b);
    initConstant("SIGPWR", 0x000001e);
    initConstant("SIGQUIT", 0x0000003);
    initConstant("SIGRTMAX", 0x0000040);
    initConstant("SIGRTMIN", 0x0000029);
    initConstant("SIGSEGV", 0x000000b);
    initConstant("SIGSTKFLT", 0x0000010);
    initConstant("SIGSTOP", 0x0000013);
    initConstant("SIGSYS", 0x000001f);
    initConstant("SIGTERM", 0x000000f);
    initConstant("SIGTRAP", 0x0000005);
    initConstant("SIGTSTP", 0x0000014);
    initConstant("SIGTTIN", 0x0000015);
    initConstant("SIGTTOU", 0x0000016);
    initConstant("SIGURG", 0x0000017);
    initConstant("SIGUSR1", 0x000000a);
    initConstant("SIGUSR2", 0x000000c);
    initConstant("SIGVTALRM", 0x000001a);
    initConstant("SIGWINCH", 0x000001c);
    initConstant("SIGXCPU", 0x0000018);
    initConstant("SIGXFSZ", 0x0000019);
    initConstant("SIOCGIFADDR", 0x0008915);
    initConstant("SIOCGIFBRDADDR", 0x0008919);
    initConstant("SIOCGIFDSTADDR", 0x0008917);
    initConstant("SIOCGIFNETMASK", 0x000891b);
    initConstant("SOCK_CLOEXEC", 0x0080000);
    initConstant("SOCK_DGRAM", 0x0000002);
    initConstant("SOCK_NONBLOCK", 0x0000800);
    initConstant("SOCK_RAW", 0x0000003);
    initConstant("SOCK_SEQPACKET", 0x0000005);
    initConstant("SOCK_STREAM", 0x0000001);
    initConstant("SOL_PACKET", 0x0000107);
    initConstant("SOL_SOCKET", 0x0000001);
    initConstant("SOL_UDP", 0x0000011);
    initConstant("SO_BINDTODEVICE", 0x0000019);
    initConstant("SO_BROADCAST", 0x0000006);
    initConstant("SO_DEBUG", 0x0000001);
    initConstant("SO_DOMAIN", 0x0000027);
    initConstant("SO_DONTROUTE", 0x0000005);
    initConstant("SO_ERROR", 0x0000004);
    initConstant("SO_KEEPALIVE", 0x0000009);
    initConstant("SO_LINGER", 0x000000d);
    initConstant("SO_OOBINLINE", 0x000000a);
    initConstant("SO_PASSCRED", 0x0000010);
    initConstant("SO_PEERCRED", 0x0000011);
    initConstant("SO_PROTOCOL", 0x0000026);
    initConstant("SO_RCVBUF", 0x0000008);
    initConstant("SO_RCVLOWAT", 0x0000012);
    initConstant("SO_RCVTIMEO", 0x0000014);
    initConstant("SO_REUSEADDR", 0x0000002);
    initConstant("SO_SNDBUF", 0x0000007);
    initConstant("SO_SNDLOWAT", 0x0000013);
    initConstant("SO_SNDTIMEO", 0x0000015);
    initConstant("SO_TYPE", 0x0000003);
    initConstant("SPLICE_F_MORE", 0x0000004);
    initConstant("SPLICE_F_MOVE", 0x0000001);
    initConstant("SPLICE_F_NONBLOCK", 0x0000002);
    initConstant("STDERR_FILENO", 0x0000002);
    initConstant("STDIN_FILENO", 0x0000000);
    initConstant("STDOUT_FILENO", 0x0000001);
    initConstant("ST_MANDLOCK", 0x0000040);
    initConstant("ST_NOATIME", 0x0000400);
    initConstant("ST_NODEV", 0x0000004);
    initConstant("ST_NODIRATIME", 0x0000800);
    initConstant("ST_NOEXEC", 0x0000008);
    initConstant("ST_NOSUID", 0x0000002);
    initConstant("ST_RDONLY", 0x0000001);
    initConstant("ST_RELATIME", 0x0001000);
    initConstant("ST_SYNCHRONOUS", 0x0000010);
    initConstant("S_IFBLK", 0x0006000);
    initConstant("S_IFCHR", 0x0002000);
    initConstant("S_IFDIR", 0x0004000);
    initConstant("S_IFIFO", 0x0001000);
    initConstant("S_IFLNK", 0x000a000);
    initConstant("S_IFMT", 0x000f000);
    initConstant("S_IFREG", 0x0008000);
    initConstant("S_IFSOCK", 0x000c000);
    initConstant("S_IRGRP", 0x0000020);
    initConstant("S_IROTH", 0x0000004);
    initConstant("S_IRUSR", 0x0000100);
    initConstant("S_IRWXG", 0x0000038);
    initConstant("S_IRWXO", 0x0000007);
    initConstant("S_IRWXU", 0x00001c0);
    initConstant("S_ISGID", 0x0000400);
    initConstant("S_ISUID", 0x0000800);
    initConstant("S_ISVTX", 0x0000200);
    initConstant("S_IWGRP", 0x0000010);
    initConstant("S_IWOTH", 0x0000002);
    initConstant("S_IWUSR", 0x0000080);
    initConstant("S_IXGRP", 0x0000008);
    initConstant("S_IXOTH", 0x0000001);
    initConstant("S_IXUSR", 0x0000040);
    initConstant("TCP_NODELAY", 0x0000001);
    initConstant("TCP_USER_TIMEOUT", 0x0000012);
    initConstant("TIOCOUTQ", 0x0005411);
    initConstant("UDP_ENCAP", 0x0000064);
    initConstant("UDP_ENCAP_ESPINUDP", 0x0000002);
    initConstant("UDP_ENCAP_ESPINUDP_NON_IKE", 0x0000001);
    initConstant("UDP_GRO", 0x0000068);
    initConstant("UDP_SEGMENT", 0x0000067);
    initConstant("UNIX_PATH_MAX", 0x000006c);
    initConstant("VMADDR_CID_ANY", 0xffffffff);
    initConstant("VMADDR_CID_HOST", 0x0000002);
    initConstant("VMADDR_CID_LOCAL", 0x0000001);
    initConstant("VMADDR_PORT_ANY", 0xffffffff);
    initConstant("WCONTINUED", 0x0000008);
    initConstant("WEXITED", 0x0000004);
    initConstant("WNOHANG", 0x0000001);
    initConstant("WNOWAIT", 0x1000000);
    initConstant("WSTOPPED", 0x0000002);
    initConstant("WUNTRACED", 0x0000002);
    initConstant("W_OK", 0x0000002);
    initConstant("XATTR_CREATE", 0x0000001);
    initConstant("XATTR_REPLACE", 0x0000002);
    initConstant("X_OK", 0x0000001);
    initConstant("_LINUX_CAPABILITY_VERSION_3", 0x20080522);
    initConstant("_SC_2_CHAR_TERM", 0x0000010);
    initConstant("_SC_2_C_BIND", 0x000000d);
    initConstant("_SC_2_C_DEV", 0x000000e);
    initConstant("_SC_2_C_VERSION", 0x000000f);
    initConstant("_SC_2_FORT_DEV", 0x0000011);
    initConstant("_SC_2_FORT_RUN", 0x0000012);
    initConstant("_SC_2_LOCALEDEF", 0x0000013);
    initConstant("_SC_2_SW_DEV", 0x0000014);
    initConstant("_SC_2_UPE", 0x0000015);
    initConstant("_SC_2_VERSION", 0x0000016);
    initConstant("_SC_AIO_LISTIO_MAX", 0x000002e);
    initConstant("_SC_AIO_MAX", 0x000002f);
    initConstant("_SC_AIO_PRIO_DELTA_MAX", 0x0000030);
    initConstant("_SC_ARG_MAX", 0x0000000);
    initConstant("_SC_ASYNCHRONOUS_IO", 0x0000039);
    initConstant("_SC_ATEXIT_MAX", 0x0000025);
    initConstant("_SC_AVPHYS_PAGES", 0x0000063);
    initConstant("_SC_BC_BASE_MAX", 0x0000001);
    initConstant("_SC_BC_DIM_MAX", 0x0000002);
    initConstant("_SC_BC_SCALE_MAX", 0x0000003);
    initConstant("_SC_BC_STRING_MAX", 0x0000004);
    initConstant("_SC_CHILD_MAX", 0x0000005);
    initConstant("_SC_CLK_TCK", 0x0000006);
    initConstant("_SC_COLL_WEIGHTS_MAX", 0x0000007);
    initConstant("_SC_DELAYTIMER_MAX", 0x0000031);
    initConstant("_SC_EXPR_NEST_MAX", 0x0000008);
    initConstant("_SC_FSYNC", 0x000003a);
    initConstant("_SC_GETGR_R_SIZE_MAX", 0x0000047);
    initConstant("_SC_GETPW_R_SIZE_MAX", 0x0000048);
    initConstant("_SC_IOV_MAX", 0x0000026);
    initConstant("_SC_JOB_CONTROL", 0x0000017);
    initConstant("_SC_LINE_MAX", 0x0000009);
    initConstant("_SC_LOGIN_NAME_MAX", 0x0000049);
    initConstant("_SC_MAPPED_FILES", 0x000003b);
    initConstant("_SC_MEMLOCK", 0x000003c);
    initConstant("_SC_MEMLOCK_RANGE", 0x000003d);
    initConstant("_SC_MEMORY_PROTECTION", 0x000003e);
    initConstant("_SC_MESSAGE_PASSING", 0x000003f);
    initConstant("_SC_MQ_OPEN_MAX", 0x0000032);
    initConstant("_SC_MQ_PRIO_MAX", 0x0000033);
    initConstant("_SC_NGROUPS_MAX", 0x000000a);
    initConstant("_SC_NPROCESSORS_CONF", 0x0000060);
    initConstant("_SC_NPROCESSORS_ONLN", 0x0000061);
    initConstant("_SC_OPEN_MAX", 0x000000b);
    initConstant("_SC_PAGESIZE", 0x0000027);
    initConstant("_SC_PAGE_SIZE", 0x0000028);
    initConstant("_SC_PASS_MAX", 0x000000c);
    initConstant("_SC_PHYS_PAGES", 0x0000062);
    initConstant("_SC_PRIORITIZED_IO", 0x0000040);
    initConstant("_SC_PRIORITY_SCHEDULING", 0x0000041);
    initConstant("_SC_REALTIME_SIGNALS", 0x0000042);
    initConstant("_SC_RE_DUP_MAX", 0x000001a);
    initConstant("_SC_RTSIG_MAX", 0x0000034);
    initConstant("_SC_SAVED_IDS", 0x0000018);
    initConstant("_SC_SEMAPHORES", 0x0000043);
    initConstant("_SC_SEM_NSEMS_MAX", 0x0000035);
    initConstant("_SC_SEM_VALUE_MAX", 0x0000036);
    initConstant("_SC_SHARED_MEMORY_OBJECTS", 0x0000044);
    initConstant("_SC_SIGQUEUE_MAX", 0x0000037);
    initConstant("_SC_STREAM_MAX", 0x000001b);
    initConstant("_SC_SYNCHRONIZED_IO", 0x0000045);
    initConstant("_SC_THREADS", 0x000004f);
    initConstant("_SC_THREAD_ATTR_STACKADDR", 0x0000050);
    initConstant("_SC_THREAD_ATTR_STACKSIZE", 0x0000051);
    initConstant("_SC_THREAD_DESTRUCTOR_ITERATIONS", 0x000004a);
    initConstant("_SC_THREAD_KEYS_MAX", 0x000004b);
    initConstant("_SC_THREAD_PRIORITY_SCHEDULING", 0x0000052);
    initConstant("_SC_THREAD_PRIO_INHERIT", 0x0000053);
    initConstant("_SC_THREAD_PRIO_PROTECT", 0x0000054);
    initConstant("_SC_THREAD_SAFE_FUNCTIONS", 0x0000055);
    initConstant("_SC_THREAD_STACK_MIN", 0x000004c);
    initConstant("_SC_THREAD_THREADS_MAX", 0x000004d);
    initConstant("_SC_TIMERS", 0x0000046);
    initConstant("_SC_TIMER_MAX", 0x0000038);
    initConstant("_SC_TTY_NAME_MAX", 0x000004e);
    initConstant("_SC_TZNAME_MAX", 0x000001c);
    initConstant("_SC_VERSION", 0x0000019);
    initConstant("_SC_XBS5_ILP32_OFF32", 0x000002a);
    initConstant("_SC_XBS5_ILP32_OFFBIG", 0x000002b);
    initConstant("_SC_XBS5_LP64_OFF64", 0x000002c);
    initConstant("_SC_XBS5_LPBIG_OFFBIG", 0x000002d);
    initConstant("_SC_XOPEN_CRYPT", 0x000001d);
    initConstant("_SC_XOPEN_ENH_I18N", 0x000001e);
    initConstant("_SC_XOPEN_LEGACY", 0x0000024);
    initConstant("_SC_XOPEN_REALTIME", 0x0000022);
    initConstant("_SC_XOPEN_REALTIME_THREADS", 0x0000023);
    initConstant("_SC_XOPEN_SHM", 0x000001f);
    initConstant("_SC_XOPEN_UNIX", 0x0000029);
    initConstant("_SC_XOPEN_VERSION", 0x0000020);
    initConstant("_SC_XOPEN_XCU_VERSION", 0x0000021);
  }

  private static void initConstant(String fieldName, int value) {
    try {
      Field field = OsConstants.class.getField(fieldName);
      field.setInt(field, value);
    } catch (ReflectiveOperationException e) {
      // ignore, this can occur when running on an older SDK that doesn't have a
      // constant from a newer SDK
    }
  }

  /** Returns the st_mode for the path. */
  public static int getMode(String path) {
    if (path == null) {
      return 0;
    }
    int mode = 0;

    File file = new File(path);
    if (file.isDirectory()) {
      mode |= OsConstants.S_IFDIR;
    } else if (file.isFile()) {
      mode |= OsConstants.S_IFREG;
    } else if (!canonicalize(path).equals(path)) {
      mode |= OsConstants.S_IFLNK;
    }

    // the Java File API doesn't have concepts for user vs group vs other permissions
    // so just assume world permissions
    if (file.canExecute()) {
      mode |= OsConstants.S_IXUSR | OsConstants.S_IXGRP | OsConstants.S_IXOTH;
    }
    if (file.canRead()) {
      mode |= OsConstants.S_IRUSR | OsConstants.S_IRGRP | OsConstants.S_IROTH;
    }
    if (file.canWrite()) {
      mode |= OsConstants.S_IWUSR | OsConstants.S_IWGRP | OsConstants.S_IWOTH;
    }
    return mode;
  }

  private static String canonicalize(String path) {
    try {
      return new File(path).getCanonicalPath();
    } catch (Throwable t) {
      throw new RuntimeException(t);
    }
  }
}
