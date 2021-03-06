package nng.tlssup;
import java.util.Collections;
import java.util.Iterator;
import nng.tlsapi.TlsApiLibrary.nng_tls_config;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>tlsSup</b><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("tlsSup") 
@Runtime(CRuntime.class) 
public class TlsSupLibrary {
	static {
		BridJ.register();
	}
	/**
	 * enum values<br>
	 * <i>native declaration : supplemental/tls/tls.h:5</i>
	 */
	public enum nng_tls_mode implements IntValuedEnum<nng_tls_mode > {
		NNG_TLS_MODE_CLIENT(0),
		NNG_TLS_MODE_SERVER(1);
		nng_tls_mode(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<nng_tls_mode > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<nng_tls_mode > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : supplemental/tls/tls.h:13</i>
	 */
	public enum nng_tls_auth_mode implements IntValuedEnum<nng_tls_auth_mode > {
		/** No verification is performed */
		NNG_TLS_AUTH_MODE_NONE(0),
		/** Verify cert if presented */
		NNG_TLS_AUTH_MODE_OPTIONAL(1),
		/** Verify cert, close if invalid */
		NNG_TLS_AUTH_MODE_REQUIRED(2);
		nng_tls_auth_mode(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<nng_tls_auth_mode > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<nng_tls_auth_mode > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * with multiple pipes or services/servers.<br>
	 * Original signature : <code>int nng_tls_config_alloc(nng_tls_config**, nng_tls_mode)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:18</i>
	 */
	@Name("nng_tls_config_alloc") 
	public static int nngTlsConfigAlloc(Pointer<Pointer<nng_tls_config > > nng_tls_configPtrPtr1, IntValuedEnum<TlsSupLibrary.nng_tls_mode > nng_tls_mode1) {
		return nngTlsConfigAlloc(Pointer.getPeer(nng_tls_configPtrPtr1), (int)nng_tls_mode1.value());
	}
	@Name("nng_tls_config_alloc") 
	protected native static int nngTlsConfigAlloc(@Ptr long nng_tls_configPtrPtr1, int nng_tls_mode1);
	/**
	 * configuration object, and if zero, deallocates it.<br>
	 * Original signature : <code>void nng_tls_config_free(nng_tls_config*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:23</i>
	 */
	@Name("nng_tls_config_free") 
	public static void nngTlsConfigFree(Pointer<nng_tls_config > nng_tls_configPtr1) {
		nngTlsConfigFree(Pointer.getPeer(nng_tls_configPtr1));
	}
	@Name("nng_tls_config_free") 
	protected native static void nngTlsConfigFree(@Ptr long nng_tls_configPtr1);
	/**
	 * use if it supports more than one.<br>
	 * Original signature : <code>int nng_tls_config_server_name(nng_tls_config*, const char*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:28</i>
	 */
	@Name("nng_tls_config_server_name") 
	public static int nngTlsConfigServerName(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > charPtr1) {
		return nngTlsConfigServerName(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(charPtr1));
	}
	@Name("nng_tls_config_server_name") 
	protected native static int nngTlsConfigServerName(@Ptr long nng_tls_configPtr1, @Ptr long charPtr1);
	/**
	 * format (except that the CRL may be NULL).<br>
	 * Original signature : <code>int nng_tls_config_ca_chain(nng_tls_config*, const char*, const char*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:33</i>
	 */
	@Name("nng_tls_config_ca_chain") 
	public static int nngTlsConfigCaChain(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > charPtr1, Pointer<Byte > charPtr2) {
		return nngTlsConfigCaChain(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(charPtr1), Pointer.getPeer(charPtr2));
	}
	@Name("nng_tls_config_ca_chain") 
	protected native static int nngTlsConfigCaChain(@Ptr long nng_tls_configPtr1, @Ptr long charPtr1, @Ptr long charPtr2);
	/**
	 * password and may be NULL.<br>
	 * Original signature : <code>int nng_tls_config_own_cert(nng_tls_config*, const char*, const char*, const char*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:38</i>
	 */
	@Name("nng_tls_config_own_cert") 
	public static int nngTlsConfigOwnCert(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > charPtr1, Pointer<Byte > charPtr2, Pointer<Byte > charPtr3) {
		return nngTlsConfigOwnCert(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(charPtr1), Pointer.getPeer(charPtr2), Pointer.getPeer(charPtr3));
	}
	@Name("nng_tls_config_own_cert") 
	protected native static int nngTlsConfigOwnCert(@Ptr long nng_tls_configPtr1, @Ptr long charPtr1, @Ptr long charPtr2, @Ptr long charPtr3);
	/**
	 * nng_tls_config_key is used to pass our own private key.<br>
	 * Original signature : <code>int nng_tls_config_key(nng_tls_config*, const uint8_t*, size_t)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:43</i>
	 */
	@Name("nng_tls_config_key") 
	public static int nngTlsConfigKey(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > uint8_tPtr1, long size_t1) {
		return nngTlsConfigKey(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(uint8_tPtr1), size_t1);
	}
	@Name("nng_tls_config_key") 
	protected native static int nngTlsConfigKey(@Ptr long nng_tls_configPtr1, @Ptr long uint8_tPtr1, long size_t1);
	/**
	 * private keys that are encrypted.<br>
	 * Original signature : <code>int nng_tls_config_pass(nng_tls_config*, const char*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:48</i>
	 */
	@Name("nng_tls_config_pass") 
	public static int nngTlsConfigPass(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > charPtr1) {
		return nngTlsConfigPass(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(charPtr1));
	}
	@Name("nng_tls_config_pass") 
	protected native static int nngTlsConfigPass(@Ptr long nng_tls_configPtr1, @Ptr long charPtr1);
	/**
	 * practice.<br>
	 * Original signature : <code>int nng_tls_config_auth_mode(nng_tls_config*, nng_tls_auth_mode)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:53</i>
	 */
	@Name("nng_tls_config_auth_mode") 
	public static int nngTlsConfigAuthMode(Pointer<nng_tls_config > nng_tls_configPtr1, IntValuedEnum<TlsSupLibrary.nng_tls_auth_mode > nng_tls_auth_mode1) {
		return nngTlsConfigAuthMode(Pointer.getPeer(nng_tls_configPtr1), (int)nng_tls_auth_mode1.value());
	}
	@Name("nng_tls_config_auth_mode") 
	protected native static int nngTlsConfigAuthMode(@Ptr long nng_tls_configPtr1, int nng_tls_auth_mode1);
	/**
	 * The path name must be a legal file name.<br>
	 * Original signature : <code>int nng_tls_config_ca_file(nng_tls_config*, const char*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:58</i>
	 */
	@Name("nng_tls_config_ca_file") 
	public static int nngTlsConfigCaFile(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > charPtr1) {
		return nngTlsConfigCaFile(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(charPtr1));
	}
	@Name("nng_tls_config_ca_file") 
	protected native static int nngTlsConfigCaFile(@Ptr long nng_tls_configPtr1, @Ptr long charPtr1);
	/**
	 * different cryptographic algorithms.  Clients only get one.)<br>
	 * Original signature : <code>int nng_tls_config_cert_key_file(nng_tls_config*, const char*, const char*)</code><br>
	 * <i>native declaration : supplemental/tls/tls.h:63</i>
	 */
	@Name("nng_tls_config_cert_key_file") 
	public static int nngTlsConfigCertKeyFile(Pointer<nng_tls_config > nng_tls_configPtr1, Pointer<Byte > charPtr1, Pointer<Byte > charPtr2) {
		return nngTlsConfigCertKeyFile(Pointer.getPeer(nng_tls_configPtr1), Pointer.getPeer(charPtr1), Pointer.getPeer(charPtr2));
	}
	@Name("nng_tls_config_cert_key_file") 
	protected native static int nngTlsConfigCertKeyFile(@Ptr long nng_tls_configPtr1, @Ptr long charPtr1, @Ptr long charPtr2);
}
