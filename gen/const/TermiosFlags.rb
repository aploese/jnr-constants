require_relative '../../gen/ConstGenerator'
def gen_termiosflags_java(options)
  ConstGenerator.new 'platform.termiosflags', options do |cg|
    cg.include "termios.h"
    cg.type = :bitmask
    %w[
      NCCS
      _HAVE_STRUCT_TERMIOS_C_ISPEED
      _HAVE_STRUCT_TERMIOS_C_OSPEED
      VINTR
      VQUIT
      VERASE
      VKILL
      VEOF
      VTIME
      VMIN
      VSWTC
      VSWTCH
      VSTART
      VSTOP
      VSUSP
      VEOL
      VREPRINT
      VDISCARD
      VWERASE
      VLNEXT
      VEOL2
      IGNBRK
      BRKINT
      IGNPAR
      PARMRK
      INPCK
      ISTRIP
      INLCR
      IGNCR
      ICRNL
      IUCLC
      IXON
      IXANY
      IXOFF
      IMAXBEL
      IUTF8
      OPOST
      OLCUC
      ONLCR
      OCRNL
      ONOCR
      ONLRET
      OFILL
      OFDEL
      NLDLY
      NL0
      NL1
      CRDLY
      CR0
      CR1
      CR2
      CR3
      TABDLY
      TAB0
      TAB1
      TAB2
      TAB3
      BSDLY
      BS0
      BS1
      FFDLY
      FF0
      FF1
      VTDLY
      VT0
      VT1
      XTABS
      CBAUD
      B0
      B50
      B75
      B110
      B134
      B150
      B200
      B300
      B600
      B1200
      B1800
      B2400
      B4800
      B9600
      B19200
      B38400
      EXTA
      EXTB
      CSIZE
      CS5
      CS6
      CS7
      CS8
      CSTOPB
      CREAD
      PARENB
      PARODD
      HUPCL
      CLOCAL
      CBAUDEX
      B57600
      B115200
      B230400
      B460800
      B500000
      B576000
      B921600
      B1000000
      B1152000
      B1500000
      B2000000
      B2500000
      B3000000
      B3500000
      B4000000
      __MAX_BAUD
      CIBAUD
      CMSPAR
      CRTSCTS
      ISIG
      ICANON
      XCASE
      ECHO
      ECHOE
      ECHOK
      ECHONL
      NOFLSH
      TOSTOP
      ECHOCTL
      ECHOPRT
      ECHOKE
      FLUSHO
      PENDIN
      IEXTEN
      EXTPROC
      TCOOFF
      TCOON
      TCIOFF
      TCION
      TCIFLUSH
      TCOFLUSH
      TCIOFLUSH
      TCSANOW
      TCSADRAIN
      TCSAFLUSH
      PAREXT
     ].each { |c| cg.const c }
  end
end
