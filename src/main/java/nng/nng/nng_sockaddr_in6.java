package nng.nng;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : nng.h:37</i><br>
 * This file was autogenerated by <a href="https://github.com/nativelibs4java/JNAerator">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="https://github.com/nativelibs4java">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("nng") 
public class nng_sockaddr_in6 extends StructObject {
	static {
		BridJ.register();
	}
	@Field(0) 
	public short sa_family() {
		return this.io.getShortField(this, 0);
	}
	@Field(0) 
	public nng_sockaddr_in6 sa_family(short sa_family) {
		this.io.setShortField(this, 0, sa_family);
		return this;
	}
	@Field(1) 
	public short sa_port() {
		return this.io.getShortField(this, 1);
	}
	@Field(1) 
	public nng_sockaddr_in6 sa_port(short sa_port) {
		this.io.setShortField(this, 1, sa_port);
		return this;
	}
	/** C type : uint8_t[16] */
	@Array({16}) 
	@Field(2) 
	public Pointer<Byte > sa_addr() {
		return this.io.getPointerField(this, 2);
	}
	public nng_sockaddr_in6() {
		super();
	}
	public nng_sockaddr_in6(Pointer pointer) {
		super(pointer);
	}
}