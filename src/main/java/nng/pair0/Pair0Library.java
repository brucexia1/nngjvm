package nng.pair0;
import nng.core.nng_socket_s;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>pair0</b><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("pair0") 
@Runtime(CRuntime.class) 
public class Pair0Library {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>int nng_pair0_open(nng_socket*)</code><br>
	 * <i>native declaration : protocol/pair0/pair.h:2</i>
	 */
	@Name("nng_pair0_open") 
	public static int nngPair0Open(Pointer<nng_socket_s > nng_socketPtr1) {
		return nngPair0Open(Pointer.getPeer(nng_socketPtr1));
	}
	@Name("nng_pair0_open") 
	protected native static int nngPair0Open(@Ptr long nng_socketPtr1);
	/**
	 * Original signature : <code>int nng_pair0_open_raw(nng_socket*)</code><br>
	 * <i>native declaration : protocol/pair0/pair.h:4</i>
	 */
	@Name("nng_pair0_open_raw") 
	public static int nngPair0OpenRaw(Pointer<nng_socket_s > nng_socketPtr1) {
		return nngPair0OpenRaw(Pointer.getPeer(nng_socketPtr1));
	}
	@Name("nng_pair0_open_raw") 
	protected native static int nngPair0OpenRaw(@Ptr long nng_socketPtr1);
}
