package nng.tls;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>tls</b><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("tls") 
@Runtime(CRuntime.class) 
public class TlsLibrary {
	static {
		BridJ.register();
	}
	/**
	 * TLS transport.  This is used for communication via TLS v1.2 over TCP/IP.<br>
	 * Original signature : <code>int nng_tls_register()</code><br>
	 * <i>native declaration : transport/tls/tls.h:4</i>
	 */
	@Name("nng_tls_register") 
	public static native int nngTlsRegister();
}
