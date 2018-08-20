package nng.sub;
import nng.nng.nng_socket_s;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>sub</b><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("sub") 
@Runtime(CRuntime.class) 
public class SubLibrary {
	static {
		BridJ.register();
	}
	/** <i>native declaration : protocol/pubsub0/sub.h</i> */
	public static final String NNG_OPT_SUB_SUBSCRIBE = (String)"sub:subscribe";
	/** <i>native declaration : protocol/pubsub0/sub.h</i> */
	public static final String NNG_OPT_SUB_UNSUBSCRIBE = (String)"sub:unsubscribe";
	/**
	 * Original signature : <code>int nng_sub0_open(nng_socket*)</code><br>
	 * <i>native declaration : protocol/pubsub0/sub.h:2</i>
	 */
	@Name("nng_sub0_open") 
	public static int nngSub0Open(Pointer<nng_socket_s > nng_socketPtr1) {
		return nngSub0Open(Pointer.getPeer(nng_socketPtr1));
	}
	@Name("nng_sub0_open") 
	protected native static int nngSub0Open(@Ptr long nng_socketPtr1);
	/**
	 * Original signature : <code>int nng_sub0_open_raw(nng_socket*)</code><br>
	 * <i>native declaration : protocol/pubsub0/sub.h:4</i>
	 */
	@Name("nng_sub0_open_raw") 
	public static int nngSub0OpenRaw(Pointer<nng_socket_s > nng_socketPtr1) {
		return nngSub0OpenRaw(Pointer.getPeer(nng_socketPtr1));
	}
	@Name("nng_sub0_open_raw") 
	protected native static int nngSub0OpenRaw(@Ptr long nng_socketPtr1);
}