// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Nov 11 10:09:16 +1000 2008
package com.kenai.constantine.platform;
public enum INAddr implements com.kenai.constantine.Constant {
INADDR_ANY,
INADDR_BROADCAST,
INADDR_NONE,
INADDR_LOOPBACK,
INADDR_UNSPEC_GROUP,
INADDR_ALLHOSTS_GROUP,
INADDR_ALLRTRS_GROUP,
INADDR_MAX_LOCAL_GROUP,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<INAddr> resolver = ConstantResolver.getResolver(INAddr.class);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static INAddr valueOf(int value) { 
    return resolver.valueOf(value);
}
}
