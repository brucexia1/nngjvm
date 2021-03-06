package nng.req;
import nng.core.nng_socket_s;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>req</b><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("req") 
@Runtime(CRuntime.class) 
public class ReqLibrary {
	static {
		BridJ.register();
	}
	/** <i>native declaration : protocol/reqrep0/req.h</i> */
	public static final String NNG_OPT_REQ_RESENDTIME = (String)"req:resend-time";
	/**
	 * Original signature : <code>int nng_req0_open(nng_socket*)</code><br>
	 * <i>native declaration : protocol/reqrep0/req.h:2</i>
	 */
	@Name("nng_req0_open") 
	public static int nngReq0Open(Pointer<nng_socket_s > nng_socketPtr1) {
		return nngReq0Open(Pointer.getPeer(nng_socketPtr1));
	}
	@Name("nng_req0_open") 
	protected native static int nngReq0Open(@Ptr long nng_socketPtr1);
	/**
	 * Original signature : <code>int nng_req0_open_raw(nng_socket*)</code><br>
	 * <i>native declaration : protocol/reqrep0/req.h:4</i>
	 */
	@Name("nng_req0_open_raw") 
	public static int nngReq0OpenRaw(Pointer<nng_socket_s > nng_socketPtr1) {
		return nngReq0OpenRaw(Pointer.getPeer(nng_socketPtr1));
	}
	@Name("nng_req0_open_raw") 
	protected native static int nngReq0OpenRaw(@Ptr long nng_socketPtr1);
}
